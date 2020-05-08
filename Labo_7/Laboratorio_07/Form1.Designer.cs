namespace Laboratorio_07
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

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.btnRed = new System.Windows.Forms.Button();
            this.btnBlue = new System.Windows.Forms.Button();
            this.btnGreen = new System.Windows.Forms.Button();
            this.btnCambiarColor = new System.Windows.Forms.Button();
            this.lblTexto = new System.Windows.Forms.Label();
            this.txtCambiarColor = new System.Windows.Forms.TextBox();
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.btnCambiarColor2 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btnRed
            // 
            this.btnRed.BackColor = System.Drawing.Color.White;
            this.btnRed.Location = new System.Drawing.Point(72, 437);
            this.btnRed.Name = "btnRed";
            this.btnRed.Size = new System.Drawing.Size(120, 72);
            this.btnRed.TabIndex = 1;
            this.btnRed.Text = "Rojo";
            this.btnRed.UseVisualStyleBackColor = false;
            this.btnRed.Click += new System.EventHandler(this.btnRed_Click);
            // 
            // btnBlue
            // 
            this.btnBlue.BackColor = System.Drawing.Color.White;
            this.btnBlue.Location = new System.Drawing.Point(320, 437);
            this.btnBlue.Name = "btnBlue";
            this.btnBlue.Size = new System.Drawing.Size(120, 72);
            this.btnBlue.TabIndex = 2;
            this.btnBlue.Text = "Azul";
            this.btnBlue.UseVisualStyleBackColor = false;
            this.btnBlue.Click += new System.EventHandler(this.btnBlue_Click);
            // 
            // btnGreen
            // 
            this.btnGreen.BackColor = System.Drawing.Color.White;
            this.btnGreen.Location = new System.Drawing.Point(572, 437);
            this.btnGreen.Name = "btnGreen";
            this.btnGreen.Size = new System.Drawing.Size(120, 72);
            this.btnGreen.TabIndex = 3;
            this.btnGreen.Text = "Verde";
            this.btnGreen.UseVisualStyleBackColor = false;
            this.btnGreen.Click += new System.EventHandler(this.btnGreen_Click);
            // 
            // btnCambiarColor
            // 
            this.btnCambiarColor.BackColor = System.Drawing.Color.White;
            this.btnCambiarColor.Location = new System.Drawing.Point(612, 158);
            this.btnCambiarColor.Name = "btnCambiarColor";
            this.btnCambiarColor.Size = new System.Drawing.Size(80, 48);
            this.btnCambiarColor.TabIndex = 4;
            this.btnCambiarColor.Text = "Cambiar color";
            this.btnCambiarColor.UseVisualStyleBackColor = false;
            this.btnCambiarColor.Click += new System.EventHandler(this.btnCambiarTexto_Click);
            // 
            // lblTexto
            // 
            this.lblTexto.Font = new System.Drawing.Font("Times New Roman", 18F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.lblTexto.Location = new System.Drawing.Point(72, 47);
            this.lblTexto.Name = "lblTexto";
            this.lblTexto.Size = new System.Drawing.Size(619, 63);
            this.lblTexto.TabIndex = 5;
            this.lblTexto.Text = "Presiona un botón";
            this.lblTexto.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // txtCambiarColor
            // 
            this.txtCambiarColor.Location = new System.Drawing.Point(320, 173);
            this.txtCambiarColor.Name = "txtCambiarColor";
            this.txtCambiarColor.Size = new System.Drawing.Size(120, 23);
            this.txtCambiarColor.TabIndex = 6;
            // 
            // comboBox1
            // 
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Location = new System.Drawing.Point(321, 303);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(120, 23);
            this.comboBox1.TabIndex = 7;
            // 
            // btnCambiarColor2
            // 
            this.btnCambiarColor2.BackColor = System.Drawing.Color.White;
            this.btnCambiarColor2.Location = new System.Drawing.Point(612, 289);
            this.btnCambiarColor2.Name = "btnCambiarColor2";
            this.btnCambiarColor2.Size = new System.Drawing.Size(80, 48);
            this.btnCambiarColor2.TabIndex = 8;
            this.btnCambiarColor2.Text = "Cambiar color";
            this.btnCambiarColor2.UseVisualStyleBackColor = false;
            this.btnCambiarColor2.Click += new System.EventHandler(this.btnCambiarColor2_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Bisque;
            this.ClientSize = new System.Drawing.Size(784, 561);
            this.Controls.Add(this.btnCambiarColor2);
            this.Controls.Add(this.comboBox1);
            this.Controls.Add(this.txtCambiarColor);
            this.Controls.Add(this.lblTexto);
            this.Controls.Add(this.btnCambiarColor);
            this.Controls.Add(this.btnGreen);
            this.Controls.Add(this.btnBlue);
            this.Controls.Add(this.btnRed);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();
        }

        #endregion

        private System.Windows.Forms.Button btnGreen;
        private System.Windows.Forms.Button btnBlue;
        private System.Windows.Forms.Button btnRed;
        private System.Windows.Forms.Label lblTexto;
        private System.Windows.Forms.TextBox txtCambiarColor;
        private System.Windows.Forms.ComboBox comboBox1;
        private System.Windows.Forms.Button btnCambiarColor2;
        private System.Windows.Forms.Button btnCambiarColor;
    }
}