using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql;
using MySql.Data;
using MySql.Data.MySqlClient;

namespace Clave_de_sol
{
    public partial class Venda_Produto : Form
    {
        MySqlConnection conn = new MySqlConnection();
        MySqlCommand cmd = new MySqlCommand();
        MySqlDataReader reader;
        
        Carrinho cr = new Carrinho();

        public Venda_Produto()
        {
            
            InitializeComponent();
            conn.ConnectionString = "server=localhost;database=test_music;uid=root;pwd=root";
            conn.Open();
            cmd.Connection = conn;
            carrega_produtos();
        }

        public void carrega_produtos()
        {

            lstProdutos.Items.Clear();
            cmd.CommandText = "SELECT cod_prod, codigo_barras, tipo, nome, unidade, valor, quantidade FROM produtos where quantidade > 0";
            reader = cmd.ExecuteReader();

            while (reader.Read())
            {
                ListViewItem list = new ListViewItem(reader[0].ToString());
                list.SubItems.Add(reader[1].ToString());
                list.SubItems.Add(reader[2].ToString());
                list.SubItems.Add(reader[3].ToString());
                list.SubItems.Add(reader[4].ToString());
                list.SubItems.Add(reader[5].ToString());
                list.SubItems.Add(reader[6].ToString());

                lstProdutos.Items.AddRange(new ListViewItem[] { list });
               
            }

            reader.Close();

        }

        private void Venda_Produto_Load(object sender, EventArgs e)
        {

        }

        private void lstProdutos_DoubleClick(object sender, EventArgs e)
        {

        }

        private void lstProdutos_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            //MessageBox.Show(lstProdutos.SelectedItems[0].Text);
        }

        public Carrinho getCarrinho()
        {
            return cr;
        }

        private void lstProdutos_MouseDoubleClick(object sender, MouseEventArgs e)
        {
            if (lstProdutos.SelectedItems.Count == 1)
            {
                cr.Quantidade = Convert.ToInt32(lstProdutos.SelectedItems[0].SubItems[6].Text);
                cr.Subtotal = 0;
                cr.Cod_prod = Convert.ToInt32(lstProdutos.SelectedItems[0].Text);
                cr.Nome = lstProdutos.SelectedItems[0].SubItems[3].Text;
                cr.Valor = Convert.ToDouble(lstProdutos.SelectedItems[0].SubItems[5].Text);

                //getCarrinho();
                this.Close();
                
            }
        }

        private void txtPesq_TextChanged(object sender, EventArgs e)
        {

          
        }

        private void lstProdutos_SelectedIndexChanged_1(object sender, EventArgs e)
        {

        }
    }
}
