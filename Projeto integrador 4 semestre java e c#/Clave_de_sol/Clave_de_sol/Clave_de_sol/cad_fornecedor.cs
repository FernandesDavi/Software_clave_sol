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
    public partial class cad_fornecedor : Form
    {
        MySqlConnection conn = new MySqlConnection();
        MySqlCommand cmd = new MySqlCommand();
        MySqlDataReader reader;
        public void carregaDados()
        {
            try
            {
                listView1.Items.Clear();
                if (txtBuscar.Text == "")
                {
                    cmd.CommandText = "SELECT * FROM fornecedor";
                }
                else
                {
                    cmd.CommandText = "SELECT * FROM fornecedor  WHERE nome_fant LIKE '" + txtBuscar.Text + "%'";
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
                    list.SubItems.Add(reader[8].ToString());
                    list.SubItems.Add(reader[9].ToString());
                    list.SubItems.Add(reader[10].ToString());
                    listView1.Items.AddRange(new ListViewItem[] { list });
                }
                reader.Close();
            }
            catch (Exception ex) { MessageBox.Show(ex.ToString()); }
        }
        public void Limpar()
        {
            txtCelular.Clear();
            txtCep.Clear();
            txtComplemento.Clear();
            txtCnpj.Clear();
            txtIe.Clear();
            txtLogradouro.Clear();
            txtNome.Clear();
            txtNumero.Clear();
            txtTelefone.Clear();

        }
        public cad_fornecedor()
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

        private void txtNumero_TextChanged(object sender, EventArgs e)
        {

        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {
            try
            {
                txtNome.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[1].Text;
                txtCnpj.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[2].Text;
                txtIe.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[3].Text;
                txtLogradouro.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[4].Text;
                txtNumero.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[5].Text;
                txtCep.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[6].Text;
                txtComplemento.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[7].Text;
                txtTelefone.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[8].Text;
                txtCelular.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[9].Text;
                btnAlterar.Visible = true;
                btnCadastrar.Visible = false;
                btnNovo.Visible = true;
                btnExluir.Visible = true;
            }
            catch (Exception)
            {

            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            carregaDados();
        }

        private void btnNovo_Click(object sender, EventArgs e)
        {
            Limpar();
            btnAlterar.Visible = false;
            btnCadastrar.Visible = true;
            btnExluir.Visible = false;
        }

        private void btnCadastrar_Click(object sender, EventArgs e)
        {
            try
            {
                cmd.CommandText = "INSERT INTO fornecedor(nome_fant,cnpj,inscricao_est,logradouro,numero,cep,complemento,telefone,celular)VALUES('" + txtNome.Text + "','" + txtCnpj.Text + "','" + txtIe.Text + "','" + txtLogradouro.Text + "','" + txtNumero.Text + "','" + txtCep.Text + "','" + txtComplemento.Text + "','" + txtTelefone.Text + "','" + txtCelular.Text + "')";
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

        private void btnAlterar_Click(object sender, EventArgs e)
        {
            try
            {
                cmd.CommandText = "UPDATE fornecedor SET nome_fant='" + txtNome.Text + "', cnpj='" + txtCnpj.Text + "', inscricao_est='" + txtIe.Text + "', logradouro='" + txtLogradouro.Text + "', numero='" + txtNumero.Text + "', cep='" + txtCep.Text + "', complemento='" + txtComplemento.Text + "' , telefone='" + txtTelefone.Text + "', celular='" + txtCelular.Text + "' WHERE cod_forn='" + listView1.Items[listView1.FocusedItem.Index].SubItems[0].Text + "'";
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

            DialogResult x = MessageBox.Show("Deseja Excluir esse Contato?", "Excluir", MessageBoxButtons.YesNo);
            if (x == DialogResult.Yes)
            {
                cmd.CommandText = "DELETE FROM fornecedor WHERE cod_forn='" + listView1.Items[listView1.FocusedItem.Index].SubItems[0].Text + "'";
                cmd.ExecuteNonQuery();

                MessageBox.Show("Dados Excluido com sucesso");
                carregaDados();
                Limpar();
                btnCadastrar.Visible = true;
                btnAlterar.Visible = false;
                btnExluir.Visible = false;
            }
        }

    }
}
