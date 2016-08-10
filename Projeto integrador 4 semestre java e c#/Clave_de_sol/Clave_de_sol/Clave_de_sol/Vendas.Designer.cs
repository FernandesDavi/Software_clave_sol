namespace Clave_de_sol
{
    partial class Vendas
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
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.cbxCliente = new System.Windows.Forms.ComboBox();
            this.txtCPF = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.btnBuscar = new System.Windows.Forms.Button();
            this.txtProd = new System.Windows.Forms.TextBox();
            this.txtQtd = new System.Windows.Forms.TextBox();
            this.labelqtd = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.gridVenda = new System.Windows.Forms.DataGridView();
            this.brtAdicionar = new System.Windows.Forms.Button();
            this.codigo = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.nome = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.valor = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.qtd = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.subtotal = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.txtAux = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.lblSub = new System.Windows.Forms.Label();
            this.btnFinaliza = new System.Windows.Forms.Button();
            this.txtSubtotal = new System.Windows.Forms.TextBox();
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.gridVenda)).BeginInit();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.cbxCliente);
            this.groupBox1.Controls.Add(this.txtCPF);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Controls.Add(this.label7);
            this.groupBox1.Location = new System.Drawing.Point(12, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(264, 103);
            this.groupBox1.TabIndex = 9;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Cliente";
            // 
            // cbxCliente
            // 
            this.cbxCliente.FormattingEnabled = true;
            this.cbxCliente.Location = new System.Drawing.Point(62, 25);
            this.cbxCliente.Name = "cbxCliente";
            this.cbxCliente.Size = new System.Drawing.Size(178, 21);
            this.cbxCliente.TabIndex = 22;
            this.cbxCliente.SelectedIndexChanged += new System.EventHandler(this.cbxCliente_SelectedIndexChanged);
            // 
            // txtCPF
            // 
            this.txtCPF.Enabled = false;
            this.txtCPF.Location = new System.Drawing.Point(62, 52);
            this.txtCPF.Name = "txtCPF";
            this.txtCPF.Size = new System.Drawing.Size(178, 20);
            this.txtCPF.TabIndex = 5;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(6, 55);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(27, 13);
            this.label3.TabIndex = 4;
            this.label3.Text = "CPF";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(6, 29);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(39, 13);
            this.label7.TabIndex = 2;
            this.label7.Text = "Cliente";
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.brtAdicionar);
            this.groupBox2.Controls.Add(this.btnBuscar);
            this.groupBox2.Controls.Add(this.txtProd);
            this.groupBox2.Controls.Add(this.txtQtd);
            this.groupBox2.Controls.Add(this.labelqtd);
            this.groupBox2.Controls.Add(this.label5);
            this.groupBox2.Location = new System.Drawing.Point(298, 12);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(324, 103);
            this.groupBox2.TabIndex = 23;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Produto";
            // 
            // btnBuscar
            // 
            this.btnBuscar.Location = new System.Drawing.Point(249, 26);
            this.btnBuscar.Name = "btnBuscar";
            this.btnBuscar.Size = new System.Drawing.Size(75, 23);
            this.btnBuscar.TabIndex = 6;
            this.btnBuscar.Text = "Buscar";
            this.btnBuscar.UseVisualStyleBackColor = true;
            this.btnBuscar.Click += new System.EventHandler(this.btnBuscar_Click);
            // 
            // txtProd
            // 
            this.txtProd.Enabled = false;
            this.txtProd.Location = new System.Drawing.Point(62, 26);
            this.txtProd.Name = "txtProd";
            this.txtProd.Size = new System.Drawing.Size(181, 20);
            this.txtProd.TabIndex = 5;
            // 
            // txtQtd
            // 
            this.txtQtd.Location = new System.Drawing.Point(62, 52);
            this.txtQtd.Name = "txtQtd";
            this.txtQtd.Size = new System.Drawing.Size(102, 20);
            this.txtQtd.TabIndex = 5;
            // 
            // labelqtd
            // 
            this.labelqtd.AutoSize = true;
            this.labelqtd.Location = new System.Drawing.Point(6, 55);
            this.labelqtd.Name = "labelqtd";
            this.labelqtd.Size = new System.Drawing.Size(24, 13);
            this.labelqtd.TabIndex = 4;
            this.labelqtd.Text = "Qtd";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(6, 29);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(44, 13);
            this.label5.TabIndex = 2;
            this.label5.Text = "Produto";
            // 
            // gridVenda
            // 
            this.gridVenda.AllowUserToAddRows = false;
            this.gridVenda.AllowUserToDeleteRows = false;
            this.gridVenda.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.gridVenda.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.codigo,
            this.nome,
            this.valor,
            this.qtd,
            this.subtotal});
            this.gridVenda.Location = new System.Drawing.Point(21, 166);
            this.gridVenda.Name = "gridVenda";
            this.gridVenda.ReadOnly = true;
            this.gridVenda.Size = new System.Drawing.Size(586, 197);
            this.gridVenda.TabIndex = 24;
            // 
            // brtAdicionar
            // 
            this.brtAdicionar.Location = new System.Drawing.Point(178, 74);
            this.brtAdicionar.Name = "brtAdicionar";
            this.brtAdicionar.Size = new System.Drawing.Size(75, 23);
            this.brtAdicionar.TabIndex = 7;
            this.brtAdicionar.Text = "Adicionar";
            this.brtAdicionar.UseVisualStyleBackColor = true;
            this.brtAdicionar.Click += new System.EventHandler(this.brtAdicionar_Click);
            // 
            // codigo
            // 
            this.codigo.HeaderText = "Código";
            this.codigo.Name = "codigo";
            this.codigo.ReadOnly = true;
            // 
            // nome
            // 
            this.nome.HeaderText = "Nome";
            this.nome.Name = "nome";
            this.nome.ReadOnly = true;
            // 
            // valor
            // 
            this.valor.HeaderText = "Valor";
            this.valor.Name = "valor";
            this.valor.ReadOnly = true;
            // 
            // qtd
            // 
            this.qtd.HeaderText = "Quantidade";
            this.qtd.Name = "qtd";
            this.qtd.ReadOnly = true;
            // 
            // subtotal
            // 
            this.subtotal.HeaderText = "Subtotal";
            this.subtotal.Name = "subtotal";
            this.subtotal.ReadOnly = true;
            // 
            // txtAux
            // 
            this.txtAux.Location = new System.Drawing.Point(520, 121);
            this.txtAux.Name = "txtAux";
            this.txtAux.Size = new System.Drawing.Size(102, 20);
            this.txtAux.TabIndex = 25;
            this.txtAux.Visible = false;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(17, 391);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(77, 24);
            this.label1.TabIndex = 26;
            this.label1.Text = "Subtotal";
            // 
            // lblSub
            // 
            this.lblSub.AutoSize = true;
            this.lblSub.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblSub.Location = new System.Drawing.Point(113, 391);
            this.lblSub.Name = "lblSub";
            this.lblSub.Size = new System.Drawing.Size(0, 24);
            this.lblSub.TabIndex = 26;
            // 
            // btnFinaliza
            // 
            this.btnFinaliza.Location = new System.Drawing.Point(509, 381);
            this.btnFinaliza.Name = "btnFinaliza";
            this.btnFinaliza.Size = new System.Drawing.Size(113, 23);
            this.btnFinaliza.TabIndex = 8;
            this.btnFinaliza.Text = "Finalizar Venda";
            this.btnFinaliza.UseVisualStyleBackColor = true;
            this.btnFinaliza.Click += new System.EventHandler(this.button1_Click_1);
            // 
            // txtSubtotal
            // 
            this.txtSubtotal.Location = new System.Drawing.Point(117, 396);
            this.txtSubtotal.Name = "txtSubtotal";
            this.txtSubtotal.Size = new System.Drawing.Size(102, 20);
            this.txtSubtotal.TabIndex = 8;
            // 
            // Vendas
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(634, 426);
            this.Controls.Add(this.txtSubtotal);
            this.Controls.Add(this.btnFinaliza);
            this.Controls.Add(this.lblSub);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.txtAux);
            this.Controls.Add(this.gridVenda);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.groupBox1);
            this.Name = "Vendas";
            this.Text = "Vendas";
            this.Load += new System.EventHandler(this.Vendas_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.gridVenda)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.ComboBox cbxCliente;
        private System.Windows.Forms.TextBox txtCPF;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.TextBox txtProd;
        private System.Windows.Forms.TextBox txtQtd;
        private System.Windows.Forms.Label labelqtd;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Button btnBuscar;
        private System.Windows.Forms.DataGridView gridVenda;
        private System.Windows.Forms.Button brtAdicionar;
        private System.Windows.Forms.DataGridViewTextBoxColumn codigo;
        private System.Windows.Forms.DataGridViewTextBoxColumn nome;
        private System.Windows.Forms.DataGridViewTextBoxColumn valor;
        private System.Windows.Forms.DataGridViewTextBoxColumn qtd;
        private System.Windows.Forms.DataGridViewTextBoxColumn subtotal;
        private System.Windows.Forms.TextBox txtAux;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label lblSub;
        private System.Windows.Forms.Button btnFinaliza;
        private System.Windows.Forms.TextBox txtSubtotal;
    }
}