namespace Laboratorio_09
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }

            base.Dispose(disposing);
        }

       // #region Windows Form Designer generated code

       /// <summary>
       /// Required method for Designer support - do not modify
       /// the contents of this method with the code editor.
       /// </summary>
       private void InitializeComponent()
       {
           this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
           this.button1 = new System.Windows.Forms.Button();
           this.button2 = new System.Windows.Forms.Button();
           this.button3 = new System.Windows.Forms.Button();
           this.button4 = new System.Windows.Forms.Button();
           this.registerStudent1 = new Laboratorio_09.RegisterStudent();
           this.tableLayoutPanel1.SuspendLayout();
           this.SuspendLayout();
           // 
           // tableLayoutPanel1
           // 
           this.tableLayoutPanel1.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
           this.tableLayoutPanel1.ColumnCount = 4;
           this.tableLayoutPanel1.ColumnStyles.Add(
               new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
           this.tableLayoutPanel1.ColumnStyles.Add(
               new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
           this.tableLayoutPanel1.ColumnStyles.Add(
               new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
           this.tableLayoutPanel1.ColumnStyles.Add(
               new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
           this.tableLayoutPanel1.Controls.Add(this.button1, 0, 0);
           this.tableLayoutPanel1.Controls.Add(this.button2, 1, 0);
           this.tableLayoutPanel1.Controls.Add(this.button3, 2, 0);
           this.tableLayoutPanel1.Controls.Add(this.button4, 3, 0);
           this.tableLayoutPanel1.Controls.Add(this.registerStudent1, 0, 1);
           this.tableLayoutPanel1.Dock = System.Windows.Forms.DockStyle.Fill;
           this.tableLayoutPanel1.Location = new System.Drawing.Point(0, 0);
           this.tableLayoutPanel1.Name = "tableLayoutPanel1";
           this.tableLayoutPanel1.RowCount = 2;
           this.tableLayoutPanel1.RowStyles.Add(
               new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 12F));
           this.tableLayoutPanel1.RowStyles.Add(
               new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 88F));
           this.tableLayoutPanel1.RowStyles.Add(
               new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Absolute, 20F));
           this.tableLayoutPanel1.Size = new System.Drawing.Size(761, 457);
           this.tableLayoutPanel1.TabIndex = 0;
           // 
           // button1
           // 
           this.button1.Anchor =
               ((System.Windows.Forms.AnchorStyles) ((((System.Windows.Forms.AnchorStyles.Top |
                                                        System.Windows.Forms.AnchorStyles.Bottom) |
                                                       System.Windows.Forms.AnchorStyles.Left) |
                                                      System.Windows.Forms.AnchorStyles.Right)));
           this.button1.Location = new System.Drawing.Point(3, 3);
           this.button1.Name = "button1";
           this.button1.Size = new System.Drawing.Size(184, 48);
           this.button1.TabIndex = 0;
           this.button1.Text = "Estudiante";
           this.button1.UseVisualStyleBackColor = true;
           this.button1.Click += new System.EventHandler(this.button1_Click_1);
           // 
           // button2
           // 
           this.button2.Anchor =
               ((System.Windows.Forms.AnchorStyles) ((((System.Windows.Forms.AnchorStyles.Top |
                                                        System.Windows.Forms.AnchorStyles.Bottom) |
                                                       System.Windows.Forms.AnchorStyles.Left) |
                                                      System.Windows.Forms.AnchorStyles.Right)));
           this.button2.Location = new System.Drawing.Point(193, 3);
           this.button2.Name = "button2";
           this.button2.Size = new System.Drawing.Size(184, 48);
           this.button2.TabIndex = 0;
           this.button2.Text = "Materia";
           this.button2.UseVisualStyleBackColor = true;
           this.button2.Click += new System.EventHandler(this.button2_Click);
           // 
           // button3
           // 
           this.button3.Anchor =
               ((System.Windows.Forms.AnchorStyles) ((((System.Windows.Forms.AnchorStyles.Top |
                                                        System.Windows.Forms.AnchorStyles.Bottom) |
                                                       System.Windows.Forms.AnchorStyles.Left) |
                                                      System.Windows.Forms.AnchorStyles.Right)));
           this.button3.Location = new System.Drawing.Point(383, 3);
           this.button3.Name = "button3";
           this.button3.Size = new System.Drawing.Size(184, 48);
           this.button3.TabIndex = 0;
           this.button3.Text = "Inscripción";
           this.button3.UseVisualStyleBackColor = true;
           this.button3.Click += new System.EventHandler(this.button3_Click);
           // 
           // button4
           // 
           this.button4.Anchor =
               ((System.Windows.Forms.AnchorStyles) ((((System.Windows.Forms.AnchorStyles.Top |
                                                        System.Windows.Forms.AnchorStyles.Bottom) |
                                                       System.Windows.Forms.AnchorStyles.Left) |
                                                      System.Windows.Forms.AnchorStyles.Right)));
           this.button4.Location = new System.Drawing.Point(573, 3);
           this.button4.Name = "button4";
           this.button4.Size = new System.Drawing.Size(185, 48);
           this.button4.TabIndex = 0;
           this.button4.Text = "Consultar";
           this.button4.UseVisualStyleBackColor = true;
           this.button4.Click += new System.EventHandler(this.button4_Click);
           // 
           // registerStudent1
           // 
           this.tableLayoutPanel1.SetColumnSpan(this.registerStudent1, 4);
           this.registerStudent1.Location = new System.Drawing.Point(3, 57);
           this.registerStudent1.Name = "registerStudent1";
           this.registerStudent1.Size = new System.Drawing.Size(755, 397);
           this.registerStudent1.TabIndex = 1;
           // 
           // Form1
           // 
           this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
           this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
           this.ClientSize = new System.Drawing.Size(761, 457);
           this.Controls.Add(this.tableLayoutPanel1);
           this.Name = "Form1";
           this.Text = "Form1";
           this.tableLayoutPanel1.ResumeLayout(false);
           this.ResumeLayout(false);
       }

       // #endregion
       private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
       private System.Windows.Forms.Button button1;
       private System.Windows.Forms.Button button4;
       private System.Windows.Forms.Button button3;
       private System.Windows.Forms.Button button2;
       private Laboratorio_09.RegisterStudent registerStudent1;
    }
}