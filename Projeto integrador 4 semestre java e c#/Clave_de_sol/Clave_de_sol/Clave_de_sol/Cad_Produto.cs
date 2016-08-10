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
    public partial class Cad_Produto : Form
    {
            MySqlConnection conn = new MySqlConnection();
            MySqlCommand cmd = new MySqlCommand();
            MySqlDataReader reader;
        public Cad_Produto()
        {
            InitializeComponent();
            conn.ConnectionString = "server=localhost;database=test_music;uid=root;pwd=root";
            conn.Open();
            cmd.Connection = conn;
            carregaDados();
            btnAlterar.Visible = false;
            btnNovo.Visible = false;
            btnExluir.Visible = false;
        }
        public void carregaDados()
        {
            try
            {
                listView1.Items.Clear();
                if (txtBuscar.Text == "")
                {
                    cmd.CommandText = "SELECT * FROM produtos";
                }
                else
                {
                    cmd.CommandText = "SELECT * FROM produtos WHERE codigo_barras LIKE '" + txtBuscar.Text + "%'";
                }
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
                    list.SubItems.Add(reader[7].ToString());
                    listView1.Items.AddRange(new ListViewItem[] { list });
                }
                reader.Close();
            }
            catch (Exception ex) { MessageBox.Show(ex.ToString()); }
        }
        public void Limpar()
        {
            txtBarra.Clear();
            txtBuscar.Clear();
            txtQuantidade.Clear();
            txtTipo.Clear();
            txtUnidade.Clear();
            txtValor.Clear();
            txtValorCusto.Clear();


        }

        private void btnCadastrar_Click(object sender, EventArgs e)
        {
            try
            {
                cmd.CommandText = "INSERT INTO produtos(codigo_barras,tipo,nome,unidade,valor,valor_custo,quantidade)VALUES('" + txtBarra.Text + "','" + txtTipo.Text + "','" + txtNome.Text + "','" + txtUnidade.Text + "','" + txtValor.Text + "','" + txtValorCusto.Text + "','" + txtQuantidade.Text + "')";
                cmd.ExecuteNonQuery();
                cmd.Dispose();
                MessageBox.Show("Dados cadastrados com sucesso");
                Limpar();
                carregaDados();
            }
            catch (Exception)
            {
                MessageBox.Show("erro ");
            }
        }

        private void btnNovo_Click(object sender, EventArgs e)
        {
            Limpar();
            btnAlterar.Visible = false;
            btnCadastrar.Visible = true;
            btnExluir.Visible = false;
        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            carregaDados();

        }

        private void btnAlterar_Click(object sender, EventArgs e)
        {
            try
            {
                cmd.CommandText = "UPDATE produtos SET codigo_barras='" + txtBarra.Text + "', tipo='" + txtTipo.Text + "', nome='" + txtNome.Text + "', unidade='" + txtUnidade.Text + "', valor='" + txtValor.Text + "', valor_custo='" + txtValorCusto.Text + "', quantidade='" + txtQuantidade.Text + "' WHERE cod_prod='" + listView1.Items[listView1.FocusedItem.Index].SubItems[0].Text + "'";
                cmd.ExecuteNonQuery();
                MessageBox.Show("Dados atualizado com sucesso.");
                carregaDados();
                Limpar();
                btnCadastrar.Visible = true;
                btnAlterar.Visible = false;
                btnExluir.Visible = false;
            }
            catch (Exception)
            {
                MessageBox.Show("ERRO");
            }
        }

        private void btnExluir_Click(object sender, EventArgs e)
        {
            try{
            DialogResult x = MessageBox.Show("Deseja Excluir esse Contato?", "Excluir", MessageBoxButtons.YesNo);
                if (x == DialogResult.Yes)
                {
                    cmd.CommandText = "DELETE FROM produtos WHERE cod_prod='" + listView1.Items[listView1.FocusedItem.Index].SubItems[0].Text + "'";
                    cmd.ExecuteNonQuery();

                    MessageBox.Show("Dados Excluido com sucesso");
                    carregaDados();
                    Limpar();
                    btnCadastrar.Visible = true;
                    btnAlterar.Visible = false;
                    btnExluir.Visible = false;
                }

            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {
            try
            {
                txtBarra.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[1].Text;
                txtTipo.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[2].Text;
                txtNome.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[3].Text;
                txtUnidade.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[4].Text;
                txtValor.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[5].Text;
                txtValorCusto.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[6].Text;
                txtQuantidade.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[7].Text;
                
                btnAlterar.Visible = true;
                btnCadastrar.Visible = false;
                btnNovo.Visible = true;
                btnExluir.Visible = true;

            }
            catch (Exception)
            {
                MessageBox.Show("Não existem registros na lista");
            }
        }

    }
}
