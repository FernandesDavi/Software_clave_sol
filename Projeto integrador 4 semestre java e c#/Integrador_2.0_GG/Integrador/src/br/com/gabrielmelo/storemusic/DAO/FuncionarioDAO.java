/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.DAO;

import br.com.gabrielmelo.storemusic.TO.ClienteTO;
import br.com.gabrielmelo.storemusic.TO.FuncionarioTO;
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
public class FuncionarioDAO {
    Connection gmcconn;
    public FuncionarioDAO() {
        gmcconn = new Conexao().conectar();
        //conn = new GMCConexao().
    }
    
    public void salvar(FuncionarioTO c)
    {
        try 
        {
            PreparedStatement gmcstmt = gmcconn.prepareStatement("INSERT INTO funcionario(nome, cpf, rg, dtnasc"
                    + ",logradouro,numero,cep,complemento,telefone,celular) values(?,?,?,?,?,?,?,?,?,?)");
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
              JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
      
    public void alterar(FuncionarioTO c)
    {
        try 
        {            
            PreparedStatement gmcstmt = gmcconn.prepareStatement("UPDATE funcionario SET nome=?, cpf=?, rg=?, dtnasc=?,"
                    + "logradouro=?,numero=?,cep=?,complemento=?,telefone=?,celular=? WHERE cod_func = ?");
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
            gmcstmt.setInt(11,c.getCod_func());
            gmcstmt.execute();
      JOptionPane.showMessageDialog(null, "Funcionario alterado com sucesso");

            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void excluir(FuncionarioTO c)
    {
        try 
        {
            PreparedStatement stmt = gmcconn.prepareStatement("DELETE FROM funcionario WHERE cod_func = ?");
            stmt.setInt(1, c.getCod_func());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Funcionario excluido com sucesso");

            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
   
    public List<FuncionarioTO> Consultar(){
        List<FuncionarioTO> gmclstP = new LinkedList<>();
        ResultSet gmcrs;
        try{
            PreparedStatement ppStmt = gmcconn.prepareStatement("SELECT * FROM funcionario;");
            gmcrs = ppStmt.executeQuery();
            while(gmcrs.next()){
                gmclstP.add(getFuncionario(gmcrs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    return gmclstP;
    }
    
    public List<FuncionarioTO> getFuncionarioNome(){
        List<FuncionarioTO> lstC = new LinkedList<FuncionarioTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM funcionario ");
            
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getFuncionario(rs));
            }
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
            return lstC;
    }
    
    public List<FuncionarioTO> getNomeId(FuncionarioTO c)
    {
        List<FuncionarioTO> lstC = new LinkedList<FuncionarioTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM funcionario WHERE cod_func = ?");
            stmt.setInt(1, c.getCod_func());
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getFuncionario(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    }
    
    public FuncionarioTO getFuncionario(ResultSet rs) throws SQLException{
        FuncionarioTO gmcp = new FuncionarioTO();
            gmcp.setCod_func(rs.getInt("cod_func"));
            gmcp.setNome(rs.getString("nome"));
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
