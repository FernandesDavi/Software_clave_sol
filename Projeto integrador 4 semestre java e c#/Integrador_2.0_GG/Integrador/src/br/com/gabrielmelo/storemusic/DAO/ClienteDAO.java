/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.DAO;
import br.com.gabrielmelo.storemusic.TO.ClienteTO;
import br.com.gabrielmelo.storemusic.Utilitarios.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Costa
 */
public class ClienteDAO {
    Connection gmcconn;
    public ClienteDAO() {
        gmcconn = new Conexao().conectar();
        //conn = new GMCConexao().
    }
    
    public void salvar(ClienteTO c)
    {//logradouro,numero,cep,complemento,telefone,celular
        try 
        {
            PreparedStatement gmcstmt = gmcconn.prepareStatement("INSERT INTO cliente(nome_cli, cpf, rg, dtnasc,"
                    + "logradouro,numero,cep,complemento,telefone,celular) values(?,?,?,?,?,?,?,?,?,?)");
            gmcstmt.setString(1, c.getNome());
            gmcstmt.setString(2, c.getCpf());
            gmcstmt.setString(3, c.getRg());
            gmcstmt.setString(4, c.getData());
            gmcstmt.setString(5,c.getLogradouro());
            gmcstmt.setInt(6, c.getNumero());
            gmcstmt.setString(7, c.getCep());
            gmcstmt.setString(8, c.getComplemento());
            gmcstmt.setString(9, c.getTelefone());
            gmcstmt.setString(10,c.getCelular());
            gmcstmt.execute();
            
            JOptionPane.showMessageDialog(null, "Cliente cadasttrado com sucesso");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
      
    public void alterar(ClienteTO c)
    {
        try 
        {            
            PreparedStatement gmcstmt = gmcconn.prepareStatement("UPDATE cliente SET nome_cli=?, cpf=?, rg=?, dtnasc=?,"
                    + "logradouro=?,numero=?,cep=?,complemento=?,telefone=?,celular=? WHERE cod_cli = ?");
            gmcstmt.setString(1, c.getNome());
            gmcstmt.setString(2, c.getCpf());
            gmcstmt.setString(3, c.getRg());
            gmcstmt.setString(4, c.getData());
            gmcstmt.setString(5,c.getLogradouro());
            gmcstmt.setInt(6, c.getNumero());
            gmcstmt.setString(7, c.getCep());
            gmcstmt.setString(8, c.getComplemento());
            gmcstmt.setString(9, c.getTelefone());
            gmcstmt.setString(10,c.getCelular());
            gmcstmt.setInt(11,c.getCod_cli());
            gmcstmt.execute();
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void excluir(ClienteTO c)
    {
        try 
        {
            PreparedStatement stmt = gmcconn.prepareStatement("DELETE FROM cliente WHERE cod_cli = ?");
            stmt.setInt(1, c.getCod_cli());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cliente Excluido com sucesso");
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
   
    public List<ClienteTO> Consultar(){
        List<ClienteTO> gmclstP = new LinkedList<>();
        ResultSet gmcrs;
        try{
            PreparedStatement ppStmt = gmcconn.prepareStatement("SELECT * FROM Cliente;");
            gmcrs = ppStmt.executeQuery();
            while(gmcrs.next()){
                gmclstP.add(getCliente(gmcrs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    return gmclstP;
    }
    
    public List<ClienteTO> getClienteNome(ClienteTO c)
    {
        List<ClienteTO> lstC = new LinkedList<ClienteTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM cliente WHERE nome_cli like ?");
            stmt.setString(1, c.getNome()+"%");
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getCliente(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    }
    
    public List<ClienteTO> getNomeId(ClienteTO c)
    {
        List<ClienteTO> lstC = new LinkedList<ClienteTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM cliente WHERE cod_cli = ?");
            stmt.setInt(1, c.getCod_cli());
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getCliente(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    }
       public List<ClienteTO> getCpf(ClienteTO c)
    {
        List<ClienteTO> lstC = new LinkedList<ClienteTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM cliente WHERE cpf = ?");
            stmt.setString(1, c.getCpf());
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getCliente(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    }
    
    public ClienteTO getCliente(ResultSet rs) throws SQLException{
        ClienteTO gmcp = new ClienteTO();
        gmcp.setCod_cli(rs.getInt("cod_cli"));
        gmcp.setNome(rs.getString("nome_cli"));
        gmcp.setCpf(rs.getString("cpf"));
        gmcp.setRg(rs.getString("rg"));
        gmcp.setData(rs.getString("dtnasc"));
        gmcp.setLogradouro(rs.getString("logradouro"));
        gmcp.setNumero(rs.getInt("numero"));
        gmcp.setCep(rs.getString("cep"));
        gmcp.setComplemento(rs.getString("complemento"));
        gmcp.setTelefone(rs.getString("telefone"));
        gmcp.setCelular(rs.getString("celular"));
            return gmcp;
    }
    
}
//select count(*) from funcionario;