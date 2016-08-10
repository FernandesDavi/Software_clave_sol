/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.DAO;

import br.com.gabrielmelo.storemusic.TO.ClienteTO;
import br.com.gabrielmelo.storemusic.TO.ContadorTO;
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
public class ContadorDAO {
    Connection gmcconn;
    public ContadorDAO() {
        gmcconn = new Conexao().conectar();
        //conn = new GMCConexao().
    }
    
    public void salvar(ContadorTO c)
    {//logradouro,numero,cep,complemento,telefone,celular
        try 
        {
            PreparedStatement gmcstmt = gmcconn.prepareStatement("INSERT INTO contador(nome, cnpj, ie,"
                    + "logradouro,numero,cep,complemento,telefone,celular) values(?,?,?,?,?,?,?,?,?)");
            gmcstmt.setString(1, c.getNome());
            gmcstmt.setString(2, c.getCnpj());
            gmcstmt.setString(3, c.getIe());
            //gmcstmt.setString(4, c.getData());
            gmcstmt.setString(4,c.getLogradouro());
            gmcstmt.setInt(5, c.getNumero());
            gmcstmt.setString(6, c.getCep());
            gmcstmt.setString(7, c.getComplemento());
            gmcstmt.setString(8, c.getTelefone());
            gmcstmt.setString(9,c.getCelular());
            gmcstmt.execute();
            JOptionPane.showMessageDialog(null,"Contador cadastrado com sucesso!");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
      
    public void alterar(ContadorTO c)
    {
        try 
        {            
            PreparedStatement gmcstmt = gmcconn.prepareStatement("UPDATE contador SET nome=?, cnpj=?, ie=?,"
                    + "logradouro=?,numero=?,cep=?,complemento=?,telefone=?,celular=? WHERE cod_cont = ?");
            gmcstmt.setString(1, c.getNome());
            gmcstmt.setString(2, c.getCnpj());
            gmcstmt.setString(3, c.getIe());
            gmcstmt.setString(4,c.getLogradouro());
            gmcstmt.setInt(5, c.getNumero());
            gmcstmt.setString(6, c.getCep());
            gmcstmt.setString(7, c.getComplemento());
            gmcstmt.setString(8, c.getTelefone());
            gmcstmt.setString(9,c.getCelular());
            gmcstmt.setInt(10,c.getCod_cont());
            gmcstmt.execute();
            JOptionPane.showMessageDialog(null,"Contador Alterado com sucesso!");
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void excluir(ContadorTO c)
    {
        try 
        {
            PreparedStatement stmt = gmcconn.prepareStatement("DELETE FROM contador WHERE cod_cont = ?");
            stmt.setInt(1, c.getCod_cont());
            stmt.execute();
            JOptionPane.showMessageDialog(null,"Contador Excluido com sucesso!");

            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
   
    public List<ContadorTO> Consultar(){
        List<ContadorTO> gmclstP = new LinkedList<>();
        ResultSet gmcrs;
        try{
            PreparedStatement ppStmt = gmcconn.prepareStatement("SELECT * FROM Contador;");
            gmcrs = ppStmt.executeQuery();
            while(gmcrs.next()){
                gmclstP.add(getContador(gmcrs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    return gmclstP;
    }
    
    public List<ContadorTO> getContadorNome()
    {
        List<ContadorTO> lstC = new LinkedList<ContadorTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM contador");
            
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getContador(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    }
    
    public List<ContadorTO> getNomeId(ContadorTO c)
    {
        List<ContadorTO> lstC = new LinkedList<ContadorTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM contador WHERE cod_cont = ?");
            stmt.setInt(1, c.getCod_cont());
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getContador(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    }
    

    
    public ContadorTO getContador(ResultSet rs) throws SQLException{
        ContadorTO gmcp = new ContadorTO();
        gmcp.setCod_cont(rs.getInt("cod_cont"));
        gmcp.setNome(rs.getString("nome"));
        gmcp.setCnpj(rs.getString("cnpj"));
        gmcp.setIe(rs.getString("ie"));
        gmcp.setLogradouro(rs.getString("logradouro"));
        gmcp.setNumero(rs.getInt("numero"));
        gmcp.setCep(rs.getString("cep"));
        gmcp.setComplemento(rs.getString("complemento"));
        gmcp.setTelefone(rs.getString("telefone"));
        gmcp.setCelular(rs.getString("celular"));
            return gmcp;
    }
}
