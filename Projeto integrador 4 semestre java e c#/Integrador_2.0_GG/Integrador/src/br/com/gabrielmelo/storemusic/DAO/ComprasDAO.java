/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.DAO;

import br.com.gabrielmelo.storemusic.TO.CompraTO;
import br.com.gabrielmelo.storemusic.TO.VendasTO;
import br.com.gabrielmelo.storemusic.Utilitarios.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Davi
 */
public class ComprasDAO {
        Connection gmcconn;
    public ComprasDAO() {
        gmcconn = new Conexao().conectar();
        //conn = new GMCConexao().
    }
    
     public void salvar(CompraTO c)
    {
        try 
        {
            SimpleDateFormat d = new SimpleDateFormat();
            PreparedStatement gmcstmt = gmcconn.prepareStatement("INSERT INTO Compra(valor_tot, cod_func, cod_forn) values(?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);            
            gmcstmt.setFloat(1, c.getValor_tot());
            gmcstmt.setInt(2, c.getCod_func());
            gmcstmt.setInt(3, c.getCod_forn());
                        
            gmcstmt.execute();
            
            ResultSet chave = gmcstmt.getGeneratedKeys();
            
            while (chave.next())  c.setCod_comp(chave.getInt(1));
            
            System.out.println("Cadastrou!");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
     
     public CompraTO getcompras(ResultSet rs) throws SQLException{
        CompraTO gmcp = new CompraTO();
        gmcp.setCod_forn(rs.getInt("cod_forn"));
        gmcp.setValor_tot(rs.getFloat("valor_tot"));
        gmcp.setCod_func(rs.getInt("cod_func"));
       
        return gmcp;
    }
    
}
