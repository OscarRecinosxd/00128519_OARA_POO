using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Laboratorio_07
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            comboBox1.DataSource = new List<String>(){"Morado","Naranja","Rosado","Gris"};
            AutoSizeMode = AutoSizeMode.GrowAndShrink;
            MaximizeBox = false;
            MinimizeBox = false;
        } 

        private void btnRed_Click(object sender, EventArgs e)
        {
            BackColor = Color.Red;
        }

        private void btnBlue_Click(object sender, EventArgs e)
        {
            BackColor = Color.Blue;
        }

        private void btnGreen_Click(object sender, EventArgs e)
        {
            BackColor = Color.Green;
        }

        private void btnCambiarTexto_Click(object sender, EventArgs e)
        {
            BackColor = ColorTranslator.FromHtml("#" + txtCambiarColor.Text);
        }


        private void btnCambiarColor2_Click(object sender, EventArgs e)
        {
            String Morado = "#9900CC";
            String Naranja = "#FF3300";
            String Rosado = "#FF0099";
            String Gris = "#999999";

            switch (comboBox1.SelectedIndex)
            {
                case 0: BackColor = ColorTranslator.FromHtml(Morado); break;
                case 1: BackColor = ColorTranslator.FromHtml(Naranja); break;
                case 2: BackColor = ColorTranslator.FromHtml(Rosado); break;
                case 3: BackColor = ColorTranslator.FromHtml(Gris); break;
            }
            
        }
    }
}