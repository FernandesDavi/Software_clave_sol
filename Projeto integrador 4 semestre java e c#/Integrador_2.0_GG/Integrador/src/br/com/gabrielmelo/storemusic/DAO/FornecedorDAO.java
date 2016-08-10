/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.DAO;

import br.com.gabrielmelo.storemusic.TO.FornecedorTO;
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
public class FornecedorDAO {
    Connection gmcconn;
    public FornecedorDAO() {
        gmcconn = new Conexao().conectar();
        //conn = new GMCConexao().
    }
    
    public void salvar(FornecedorTO c)
    {//logradouro,numero,cep,complemento,telefone,celular
        try 
        {
            PreparedStatement gmcstmt = gmcconn.prepareStatement("INSERT INTO fornecedor(nome_fant, cnpj, inscricao_est,"
                    + "logradouro,numero,cep,complemento,telefone,celular) values(?,?,?,?,?,?,?,?,?)");
            gmcstmt.setString(1, c.getNome_fant());
            gmcstmt.setString(2, c.getCnpj());
            gmcstmt.setString(3, c.getInscricao_est());
            gmcstmt.setString(4,c.getLogradouro());
            gmcstmt.setInt(5, c.getNumero());
            gmcstmt.setString(6, c.getCep());
            gmcstmt.setString(7, c.getComplemento());
            gmcstmt.setString(8, c.getTelefone());
            gmcstmt.setString(9,c.getCelular());
            gmcstmt.execute();
            
            JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
      
    public void alterar(FornecedorTO c)
    {
        try 
        {            
            PreparedStatement gmcstmt = gmcconn.prepareStatement("UPDATE fornecedor SET nome_fant=?, cnpj=?, inscricao_est=?,"
                    + "logradouro=?,numero=?,cep=?,complemento=?,telefone=?,celular=? WHERE cod_forn = ?");
            gmcstmt.setString(1, c.getNome_fant());
            gmcstmt.setString(2, c.getCnpj());
            gmcstmt.setString(3, c.getInscricao_est());
            gmcstmt.setString(4,c.getLogradouro());
            gmcstmt.setInt(5, c.getNumero());
            gmcstmt.setString(6, c.getCep());
            gmcstmt.setString(7, c.getComplemento());
            gmcstmt.setString(8, c.getTelefone());
            gmcstmt.setString(9,c.getCelular());
            gmcstmt.setInt(10,c.getCod_forn());
            gmcstmt.execute();
            
            JOptionPane.showMessageDialog(null, "Fornecedor alterado com sucesso");
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void excluir(FornecedorTO c)
    {
        try 
        {
            PreparedStatement stmt = gmcconn.prepareStatement("DELETE FROM fornecedor WHERE cod_forn = ?");
            stmt.setInt(1, c.getCod_forn());
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Fornecedor excluido com sucesso");
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
   
    public List<FornecedorTO> Consultar(){
        List<FornecedorTO> gmclstP = new LinkedList<>();
        ResultSet gmcrs;
        try{
            PreparedStatement ppStmt = gmcconn.prepareStatement("SELECT * FROM fornecedor;");
            gmcrs = ppStmt.executeQuery();
            while(gmcrs.next()){
                gmclstP.add(getFornecedor(gmcrs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    return gmclstP;
    }
    
    public List<FornecedorTO> getFornecedorNome(FornecedorTO c)
    {
        List<FornecedorTO> lstC = new LinkedList<FornecedorTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM fornecedor WHERE nome_fant like ?");
            stmt.setString(1, c.getNome_fant()+"%");
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getFornecedor(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    }
    
    public List<FornecedorTO> getNomeId(FornecedorTO c)
    {
        List<FornecedorTO> lstC = new LinkedList<FornecedorTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM fornecedor WHERE cod_forn = ?");
            stmt.setInt(1, c.getCod_forn());
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getFornecedor(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    }
    
    public FornecedorTO getFornecedor(ResultSet rs) throws SQLException{
        FornecedorTO gmcp = new FornecedorTO();
        gmcp.setCod_forn(rs.getInt("cod_forn"));
        gmcp.setNome_fant(rs.getString("nome_fant"));
        gmcp.setCnpj(rs.getString("cnpj"));
        gmcp.setInscricao_est(rs.getString("inscricao_est"));
        gmcp.setLogradouro(rs.getString("logradouro"));
        gmcp.setNumero(rs.getInt("numero"));
        gmcp.setCep(rs.getString("cep"));
        gmcp.setComplemento(rs.getString("complemento"));
        gmcp.setTelefone(rs.getString("telefone"));
        gmcp.setCelular(rs.getString("celular"));
            return gmcp;
    }
}
