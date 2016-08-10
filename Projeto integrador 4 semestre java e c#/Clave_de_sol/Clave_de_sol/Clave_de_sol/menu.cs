using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Clave_de_sol
{
    public partial class menu : Form
    {
        public menu()
        {
            InitializeComponent();
        }

        private void clienteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Cad_cliente CC = new Cad_cliente();
            CC.Show();
        }

        private void funcionarioToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Cad_Func cf = new Cad_Func();
            cf.Show();
        }

        private void fornecedorToolStripMenuItem_Click(object sender, EventArgs e)
        {
            cad_fornecedor cf = new cad_fornecedor();
            cf.Show();

        }

        private void prosutoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Cad_Produto cp = new Cad_Produto();
            cp.Show();


        }

        private void contadorToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Cad_contador cc = new Cad_contador();
            cc.Show();
        }

        private void contasToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Cad_Conta cc = new Cad_Conta();
            cc.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
        }

        private void vendasToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Vendas cc = new Vendas();
            cc.Show();
        }
    }
}
