/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.DAO;

import br.com.gabrielmelo.storemusic.TO.ItensVendaTO;
import br.com.gabrielmelo.storemusic.Utilitarios.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Davi
 */
public class ItensVendasDAO {
      Connection gmcconn;
    public ItensVendasDAO() {
        gmcconn = new Conexao().conectar();
    }
    
    public void salvar(ItensVendaTO iv)
    {
        try 
        {
            PreparedStatement gmcstmt = gmcconn.prepareStatement("INSERT INTO itens_venda(quantidade, cod_prod, cod_venda) values(?,?,?)");
            gmcstmt.setDouble(1, iv.getQuantidade());
            gmcstmt.setInt(2, iv.getCod_prod());
            gmcstmt.setInt(3, iv.getCod_venda());
          
            
            gmcstmt.execute();
            //System.out.println("Cadastrou!");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
      public ItensVendaTO getItensVenda(ResultSet rs) throws SQLException{
        ItensVendaTO gmcp = new ItensVendaTO();
        gmcp.setQuantidade(rs.getDouble("quantidade"));
        gmcp.setCod_prod(rs.getInt("cod_prod"));
        gmcp.setCod_venda(rs.getInt("cod_venda"));      
            return gmcp;
    }
}
