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
    public partial class Cad_Conta : Form
    {
        MySqlConnection conn = new MySqlConnection();
        MySqlCommand cmd = new MySqlCommand();
        MySqlDataReader reader;
        public Cad_Conta()
        {
            InitializeComponent();
            conn.ConnectionString = "server=localhost;database=test_music;uid=root;pwd=root";
            conn.Open();
            cmd.Connection = conn;
            carregaCombo();
            carregaDados();
        }

        public void carregaDados()
        {
            try
            {
                listView1.Items.Clear();
                if (txtBuscar.Text == "")
                {
                    cmd.CommandText = "SELECT ct.cod_conta, ct.conta, ct.valor, ct.dtvenc, c.nome, f.nome, ct.data_hora, ct.cod_cont, ct.cod_func FROM contas ct, contador c, funcionario f " + 
                    "WHERE c.cod_cont = ct.cod_cont AND f.cod_func = ct.cod_func";
                }
                else
                {
                    cmd.CommandText = "SELECT ct.cod_conta, ct.conta, ct.valor, ct.dtvenc, c.nome, f.nome, ct.data_hora, ct.cod_cont, ct.cod_func FROM contas ct, contador c, funcionario f " +
                    "WHERE c.cod_cont = ct.cod_cont AND f.cod_func = ct.cod_func AND ct.conta LIKE'" + txtBuscar.Text + "%'";
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
     
                    listView1.Items.AddRange(new ListViewItem[] { list });
                }
                reader.Close();
            }
            catch (Exception ex) { MessageBox.Show(ex.ToString()); }
        }

        public void Limpar()
        {
            txtConta.Clear();
            txtValor.Clear();
            txtVenc.Clear();
            cbxContador.SelectedIndex = 0;
            cbxFunc.SelectedIndex = 0;
            
        }

        public void carregaCombo ()
        {
            //Contadores
            cmd.CommandText = "SELECT CONCAT (cod_cont, ' - ',nome) FROM contador";
            reader = cmd.ExecuteReader();

            while (reader.Read())
            {
                cbxContador.Items.Add(reader[0]);

            }

            reader.Close();

            //Funcionários
            cmd.CommandText = "SELECT CONCAT (cod_func, ' - ',nome) FROM funcionario";
            reader = cmd.ExecuteReader();

            while (reader.Read())
            {
                cbxFunc.Items.Add(reader[0]);
               
            }
            reader.Close();
        }

        private void Cad_Conta_Load(object sender, EventArgs e)
        {
           
        }

        public int pegaCodigo(String cb)
        {
            int ind = cb.IndexOf(' ');

            return Convert.ToInt32(cb.Substring(0, ind));
        }

        private void btnCadastrar_Click(object sender, EventArgs e)
        {
             try
            {
                string agora = DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss");
                
                cmd.CommandText = "INSERT INTO contas(conta, valor, dtvenc, cod_cont, cod_func, data_hora)VALUES('" + txtConta.Text + "','" + txtValor.Text + "','" + txtVenc.Text + "','" + pegaCodigo(cbxContador.Text) + "','" + pegaCodigo(cbxFunc.Text) + "','" + agora + "')";
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
                cmd.CommandText = "UPDATE contas SET conta='" + txtConta.Text + "', valor='" + txtValor.Text + "', dtvenc='" + txtVenc.Text + "', cod_cont='" + pegaCodigo(cbxContador.Text) + "', cod_func='" + pegaCodigo(cbxFunc.Text) + "' WHERE cod_conta='" + listView1.Items[listView1.FocusedItem.Index].SubItems[0].Text + "'";
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

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {
            txtConta.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[1].Text;
            txtValor.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[2].Text;
            txtVenc.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[3].Text;

            cbxContador.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[7].Text + " - " + listView1.Items[listView1.FocusedItem.Index].SubItems[4].Text;
            cbxFunc.Text = listView1.Items[listView1.FocusedItem.Index].SubItems[8].Text + " - " + listView1.Items[listView1.FocusedItem.Index].SubItems[5].Text;
           
          
            btnAlterar.Visible = true;
            btnCadastrar.Visible = false;
            btnNovo.Visible = true;
            btnExluir.Visible = true;
        }

        private void btnNovo_Click(object sender, EventArgs e)
        {
            Limpar();
            btnAlterar.Visible = false;
            btnCadastrar.Visible = true;
            btnExluir.Visible = false;
        }

        private void btnExluir_Click(object sender, EventArgs e)
        {
            DialogResult x = MessageBox.Show("Deseja Excluir esse Contato?", "Excluir", MessageBoxButtons.YesNo);
            if (x == DialogResult.Yes)
            {
                cmd.CommandText = "DELETE FROM contas WHERE cod_conta='" + listView1.Items[listView1.FocusedItem.Index].SubItems[0].Text + "'";
                cmd.ExecuteNonQuery();

                MessageBox.Show("Dados Excluido com sucesso");
                carregaDados();
                Limpar();
                btnCadastrar.Visible = true;
                btnAlterar.Visible = false;
                btnExluir.Visible = false;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            carregaDados();
        }
       
    }
}
