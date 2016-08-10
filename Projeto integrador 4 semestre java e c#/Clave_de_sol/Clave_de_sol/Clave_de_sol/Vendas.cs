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
    public partial class Vendas : Form
    {
        MySqlConnection conn = new MySqlConnection();
        MySqlCommand cmd = new MySqlCommand();
        MySqlDataReader reader;
        Carrinho car = new Carrinho();
        List<Carrinho> listcar = new List<Carrinho>();

        public Vendas()
        {
            InitializeComponent();
            conn.ConnectionString = "server=localhost;database=test_music;uid=root;pwd=root";
            conn.Open();
            cmd.Connection = conn;
            carregaCombo_Cliente();
            carregaCombo_Produto();
        }

        public Vendas(Carrinho cr)
        {
            InitializeComponent();
            conn.ConnectionString = "server=localhost;database=test_music;uid=root;pwd=root";
            conn.Open();
            cmd.Connection = conn;
            carregaCombo_Cliente();
            carregaCombo_Produto();
          
            //MessageBox.Show(cr.Cod_prod.ToString());
            
        }

        public void carrega_produtos()
        {
             //gridVenda.Rows.Add(car.Cod_prod, car.Nome, car.Valor, txtQtd.Text, car.calculaSubtotal());
         
        }

        public void carregaCombo_Produto()
        {

          

        }

        public void carregaCombo_Cliente()
        {

            cmd.CommandText = "SELECT CONCAT (cod_cli, ' - ',nome_cli) FROM cliente";
            reader = cmd.ExecuteReader();

            //cbxCliente.Items.Clear();

            while (reader.Read())
            {
                cbxCliente.Items.Add(reader[0]);
            }

            reader.Close();

        }

        public void carregaCPF()
        {
            cmd.CommandText = "SELECT cpf FROM cliente WHERE cod_cli = " + pegaCodigo(cbxCliente.Text);
            reader = cmd.ExecuteReader();

            reader.Read();

            txtCPF.Text = reader[0].ToString();
            
            reader.Close();

        }

        public int pegaCodigo(String cb)
        {
            int ind = cb.IndexOf(' ');

            return Convert.ToInt32(cb.Substring(0, ind));
        }

        /*public void atualiza_grid(String cb)
        {
            DataSet ds = new DataSet();
            DataTable dt = new DataTable();
            ds.Tables.Add(dt);
            cmd.CommandText = "SELECT cod_prod, nome, unidade, valor, quantidade FROM produtos WHERE tipo = '" + cb + "'";
            MySqlDataAdapter da = new MySqlDataAdapter(cmd);
            da.Fill(dt);
            gridProdutos.DataSource = dt;

            gridProdutos.ReadOnly = true;

            gridProdutos.Columns[0].HeaderText = "Código";
            gridProdutos.Columns[1].HeaderText = "Nome";
            gridProdutos.Columns[2].HeaderText = "Unidade";
            gridProdutos.Columns[3].HeaderText = "Valor";
            gridProdutos.Columns[4].HeaderText = "Quantidade"; 
            

        }*/

        private void Vendas_Load(object sender, EventArgs e)
        {

        }

        private void cbxCliente_SelectedIndexChanged(object sender, EventArgs e)
        {

            carregaCPF();

        }

        private void button1_Click(object sender, EventArgs e)
        {
         
        }

        private void cbxTipo_SelectedIndexChanged(object sender, EventArgs e)
        {
            
        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            Venda_Produto vp = new Venda_Produto();
            //this.Hide();
            vp.ShowDialog();
            if (vp.getCarrinho() != null)
            {
                car = vp.getCarrinho();
                txtProd.Text = vp.getCarrinho().Nome;
                //MessageBox.Show(vp.getCarrinho().Quantidade.ToString());
                txtAux.Text = vp.getCarrinho().Quantidade.ToString();
            }
            
        }

        private void brtAdicionar_Click(object sender, EventArgs e)
        {
            if (!string.IsNullOrWhiteSpace(txtQtd.Text))
            {
                if (Convert.ToInt32(txtQtd.Text) > Convert.ToInt32(txtAux.Text))
                    MessageBox.Show("A quantidade digitada é maior do que a em estoque. \nEstoque: " + txtAux.Text);
                else
                {
                    txtAux.Text = (Convert.ToInt32(txtAux.Text) - Convert.ToInt32(txtQtd.Text)).ToString();
                    listcar.Add(car);
                    listcar.Last().Quantidade = Convert.ToInt32(txtQtd.Text);
                    listcar.Last().Subtotal = car.calculaSubtotal();
                    gridVenda.Rows.Add(car.Cod_prod, car.Nome, car.Valor, car.Quantidade, car.calculaSubtotal());
                    calculaSubtotal();
                }
            }
            else
                MessageBox.Show("Digite um valor válido no campo quantidade.");
             
        }

        public void calculaSubtotal()
        {
            double total = 0;
            foreach (Carrinho car in listcar)
            {
                total = total + car.Subtotal;
            }
            txtSubtotal.Text = total.ToString();
        }

        private void txt_TextChanged(object sender, EventArgs e)
        {
           
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            Pagamento pgt = new Pagamento((Convert.ToDouble(txtSubtotal.Text)), listcar);
            pgt.ShowDialog();
           
        }
    }
}
