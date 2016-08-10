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
    public partial class Pagamento : Form
    {

        MySqlConnection conn = new MySqlConnection();
        MySqlCommand cmd = new MySqlCommand();
        List<Carrinho> lst = new List<Carrinho>();
        double totalpagar;

        public Pagamento(double total, List<Carrinho> id)
        {
            InitializeComponent();
            lst = id;
            conn.ConnectionString = "server=localhost;database=test_music;uid=root;pwd=root";
            conn.Open();
            cmd.Connection = conn;
            totalpagar = total;
            atualiza_valores();
            label8.Text = Convert.ToString(0);
            label9.Text = Convert.ToString(0);
        }
        public Boolean verifica() {
            double valor;
            valor = Convert.ToDouble(txtValor.Text) -Convert.ToDouble(txtPagar.Text);
            if (valor >= 0)
            {
                MessageBox.Show("Troco: " + valor);
                return true;
                this.Dispose();
            }
            else {
                txtPagar.Text = Convert.ToString(Math.Abs(valor));
                txtValor.Text = "";

                return false;
            }
        
        }
        public void cadastrar(int status, int parcela){
                  try
                {
       
                   cmd.CommandText = "INSERT INTO caixa(valor, cod_venda, status, parcela) values('" + txtValor.Text +"','" + 1 +"', '" + status +"','" + parcela +"')";
                    cmd.ExecuteNonQuery();
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
        
        }
        public void atualiza_valores()
        {
            if (!string.IsNullOrWhiteSpace(txtDesc.Text))
            {
                txtPagar.Text = (Convert.ToDouble(txtValorDesc.Text) - Convert.ToDouble(txtPagar.Text)).ToString();
            }
            else
                txtPagar.Text = totalpagar.ToString();
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
           
        }

        private void rdbtnDin_CheckedChanged(object sender, EventArgs e)
        {
            if (rdbtnDin.Checked == true)
            {
                groupBox1.Visible = false;
                btnConfirma.Text = "À vista";
                label8.Text = Convert.ToString(0);
                label9.Text = Convert.ToString(0);

            }
            else
            {
                btnConfirma.Text = "A prazo";
                groupBox1.Visible = true;
                label9.Text = Convert.ToString(1);
                txtValor.Text = txtPagar.Text;
            }
        }

        private void rdbtn1_CheckedChanged(object sender, EventArgs e)
        {
            if (rdbtn1.Checked == true)
                MessageBox.Show("1 Parcela de: R$" + txtPagar.Text);
            label8.Text = Convert.ToString(1);
            txtValor.Text = txtPagar.Text;


        }

        private void rdbtn2_CheckedChanged(object sender, EventArgs e)
        {

            if (rdbtn2.Checked == true)
                MessageBox.Show("2 Parcela de: R$" + (Convert.ToDouble(txtPagar.Text) / 2));
            label8.Text = Convert.ToString(2);
            txtValor.Text = txtPagar.Text;


          
        }

        private void rdbtn3_CheckedChanged(object sender, EventArgs e)
        {
            if (rdbtn3.Checked == true)
                MessageBox.Show("3 Parcela de: R$" + (Convert.ToDouble(txtPagar.Text) / 3));
                                    label8.Text = Convert.ToString(3);
                                    txtValor.Text = txtPagar.Text;

        }

        private void rdbtnCard_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void btnConfirma_Click(object sender, EventArgs e)
        {
            if (verifica() == true)
            {
                foreach (Carrinho car in lst)
                {
                    try
                    {

                        cmd.CommandText = "UPDATE produtos SET quantidade = quantidade- '" + Convert.ToInt32(car.Quantidade) + "' WHERE cod_prod = '" + Convert.ToInt32(car.Cod_prod) + "';";
                        cmd.ExecuteNonQuery();
                        MessageBox.Show("Fim. Obrigado e volte sempre.");
                    }
                    catch (Exception ex)
                    {
                        MessageBox.Show(ex.Message);
                    }
                    cadastrar(Convert.ToInt32(label9.Text), Convert.ToInt32(label8.Text));
                   
                }
            }

            

        }

        private void txtDesc_TextChanged(object sender, EventArgs e)
        {
            if (!string.IsNullOrWhiteSpace(txtDesc.Text))
            {
                txtValorDesc.Text = (Convert.ToDouble(txtPagar.Text) * (Convert.ToDouble(txtDesc.Text) / 100)).ToString();
                double valor = Convert.ToDouble(txtPagar.Text);
                double x = valor - (Convert.ToDouble(txtValorDesc.Text));


                txtPagar.Text = Convert.ToString(x);

            }
            else
            {
                txtValorDesc.Clear();
                txtPagar.Text = totalpagar.ToString();
            }
        }
    }
}
