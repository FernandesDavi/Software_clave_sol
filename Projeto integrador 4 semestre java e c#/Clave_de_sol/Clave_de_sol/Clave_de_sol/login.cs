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
using System.Data.SqlClient;


namespace Clave_de_sol
{
    public partial class login : Form
    {
        MySqlConnection conn = new MySqlConnection();
        MySqlCommand cmd = new MySqlCommand();
        MySqlDataReader reader;
        public login()
        {
            InitializeComponent();
            conn.ConnectionString = "server=localhost;database=test_music;uid=root;pwd=root";
           
        }
        public bool busca() { 
            bool result = false;
            try
            {
                conn.Open();
                cmd.Connection = conn;
                cmd.CommandText = "SELECT * FROM usuario WHERE usuario LIKE '" + txtLogin.Text + "'and senha='" + txtSenha.Text + "'";
                MySqlDataReader dados = cmd.ExecuteReader();
                
                result = dados.HasRows;
            }
            catch (SqlException e) { 
               
            }
            conn.Close();
            return result;

        } 
        private void btnEntrar_Click(object sender, EventArgs e)
        {
            
            bool x = busca();
            if (x == true)
            {
                this.Hide();
                
                menu mn = new menu();
                mn.Show();
                
                MessageBox.Show("bem vindo");
            }
            else {
                MessageBox.Show("Usuario ou senhas invalidos");
                txtLogin.Focus();
                txtLogin.Clear();
                txtSenha.Clear();
            }
        }

        private void login_Load(object sender, EventArgs e)
        {

        }
    }
}
