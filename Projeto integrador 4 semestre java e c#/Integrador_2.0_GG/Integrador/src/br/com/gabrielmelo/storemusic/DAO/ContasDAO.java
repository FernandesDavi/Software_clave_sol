/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.DAO;

import br.com.gabrielmelo.storemusic.TO.ContasTO;
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
public class ContasDAO {
    Connection gmcconn;
    public ContasDAO() {
        gmcconn = new Conexao().conectar();
        //conn = new GMCConexao().
    }
    
    public void salvar(ContasTO c)
    {//logradouro,numero,cep,complemento,telefone,celular
        try 
        {
            PreparedStatement gmcstmt = gmcconn.prepareStatement("INSERT INTO contas(conta, valor, dtvenc,cod_cont,cod_func"
                    + ") values(?,?,?,?,?)");
            gmcstmt.setString(1, c.getConta());
            gmcstmt.setString(2, String.valueOf(c.getValor()));
            gmcstmt.setString(3, c.getDtvenc());
            gmcstmt.setInt(4, c.getCod_cont());
            gmcstmt.setInt(5, c.getCod_func());
            
            gmcstmt.execute();
              JOptionPane.showMessageDialog(null, "conta cadastrada");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
      
    public void alterar(ContasTO c)
    {
        try 
        {            
            PreparedStatement gmcstmt = gmcconn.prepareStatement("UPDATE contas SET conta=?, valor=?, dtvenc=?"
                    + " WHERE cod_conta = ?");
            gmcstmt.setString(1, c.getConta());
            gmcstmt.setString(2, String.valueOf(c.getValor()));
            gmcstmt.setString(3, c.getDtvenc());
            gmcstmt.setInt(4,c.getCod_conta());
            gmcstmt.execute();
              JOptionPane.showMessageDialog(null, "Conta atualizada");
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void excluir(ContasTO c)
    {
        try 
        {
            PreparedStatement stmt = gmcconn.prepareStatement("DELETE FROM contas WHERE cod_conta = ?");
            stmt.setInt(1, c.getCod_conta());
            stmt.execute();
              JOptionPane.showMessageDialog(null, "excluido com sucesso");
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
   
    public List<ContasTO> Consultar(){
        List<ContasTO> gmclstP = new LinkedList<>();
        ResultSet gmcrs;
        try{
            PreparedStatement ppStmt = gmcconn.prepareStatement("select contas.cod_conta, contas.conta,contas.valor,contas.dtvenc,funcionario.nome,contador.nome from contas inner join funcionario inner join contador \n" +
"    where contas.cod_func = funcionario.cod_func and contas.cod_cont = contador.cod_cont");
            gmcrs = ppStmt.executeQuery();
            while(gmcrs.next()){
                gmclstP.add(getContas2(gmcrs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    return gmclstP;
    }
    
    public List<ContasTO> getContasNome(ContasTO c)
    {
        List<ContasTO> lstC = new LinkedList<ContasTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM contas WHERE conta like ?");
            stmt.setString(1, c.getConta()+"%");
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getContas(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    }
   
    public List<ContasTO> getNomeId(ContasTO c)
    {
        List<ContasTO> lstC = new LinkedList<ContasTO>();
        ResultSet rs;
        try
        {
            
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM contas WHERE cod_conta = ?");
            stmt.setInt(1, c.getCod_conta());
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getContas(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    }
    
    public ContasTO getContas(ResultSet rs) throws SQLException{
        ContasTO gmcp = new ContasTO();
        gmcp.setCod_conta(rs.getInt("cod_conta"));
        gmcp.setConta(rs.getString("conta"));
        gmcp.setValor(rs.getFloat("valor"));
        gmcp.setDtvenc(rs.getString("dtvenc"));
        gmcp.setCod_cont(rs.getInt("cod_cont"));
        gmcp.setCod_func(rs.getInt("cod_func"));
        
            return gmcp;
    }
        public ContasTO getContas2(ResultSet rs) throws SQLException{
        ContasTO gmcp = new ContasTO();
        gmcp.setCod_conta(rs.getInt("cod_conta"));
        gmcp.setConta(rs.getString("conta"));
        gmcp.setValor(rs.getFloat("valor"));
        gmcp.setDtvenc(rs.getString("dtvenc"));
        //gmcp.setCod_cont(rs.getInt("cod_cont"));
        gmcp.setFunc(rs.getString("nome"));
        gmcp.setContador(rs.getString("nome"));
        
            return gmcp;
    }
}
