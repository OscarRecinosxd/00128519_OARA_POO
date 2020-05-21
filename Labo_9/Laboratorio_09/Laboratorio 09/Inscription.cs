using System;
using System.Collections.Generic;
using System.Data;
using System.Windows.Forms;

namespace Laboratorio_09
{
    public partial class Inscription : UserControl
    {
        public Inscription()
        {
            InitializeComponent();
        }

        private void Inscription_Load(object sender, EventArgs e)
        {
            var assignatures = ConnectionBD.ExcuteQuery("SELECT NOMBRE FROM MATERIA");
            var assignaturesCombo = new List<string>();

            foreach (DataRow dr in assignatures.Rows)
            {
                assignaturesCombo.Add(dr[0].ToString());
            }

            comboBox1.DataSource = assignaturesCombo;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
                if (textBox1.Text.Equals(""))
                {
                    MessageBox.Show("No se puede dejar campos vacios");
                }
                else
                {
                    try
                    {
                        //String query = $"SELECT idmateria FROM MATERIA WHERE nombre = '{comboBox1.SelectedItem.ToString()}'";
                        
                        var dt = ConnectionBD.ExcuteQuery($"SELECT idmateria FROM MATERIA WHERE nombre = '{comboBox1.SelectedItem.ToString()}'");
                        var dr = dt.Rows[0];
                        var idMateria = Convert.ToInt32(dr[0].ToString());

                        String nonQuery = $"INSERT INTO INSCRIPCION(carnet,idmateria) VALUES("+
                                          $"'{textBox1.Text}'," +
                                          $"{idMateria})";
                        
                        ConnectionBD.ExecuteNonQuery(nonQuery);

                        MessageBox.Show("Se ha inscrito la materia");
                    }
                    catch (Exception ex)
                    {
                        MessageBox.Show("Ha ocurrido un error");
                    }
                }
            
        }
    }
}