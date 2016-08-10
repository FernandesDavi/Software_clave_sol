/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.DAO;

import br.com.gabrielmelo.storemusic.TO.ItensComprasTO;
import br.com.gabrielmelo.storemusic.TO.ProdutosTO;
import br.com.gabrielmelo.storemusic.Utilitarios.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Davi
 */
public class itensComprasDAO {
       Connection gmcconn;
    public itensComprasDAO() {
        gmcconn = new Conexao().conectar();
        //conn = new GMCConexao().
    }
    
        public void salvar(ItensComprasTO ic)
    {
        try 
        {
            PreparedStatement gmcstmt = gmcconn.prepareStatement("INSERT INTO item_compra(quantidade, cod_prod, cod_comp, situacao) values(?,?,?,?)");
            gmcstmt.setDouble(1, ic.getQuantidade());
            gmcstmt.setInt(2, ic.getCod_prod());
            gmcstmt.setInt(3, ic.getCod_comp());
            gmcstmt.setInt(4, ic.getSituacao());
            
            gmcstmt.execute();
            //System.out.println("Cadastrou!");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
        public void Atualizar(ItensComprasTO ic)
    {
        try 
        {
            PreparedStatement gmcstmt = gmcconn.prepareStatement("UPDATE item_compra set situacao=? where cod_item=?");
          
             gmcstmt.setInt(1, ic.getSituacao());
            gmcstmt.setInt(2, ic.getCod_item());

            
            gmcstmt.execute();
            System.out.println(gmcstmt);
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
        
    public List<ItensComprasTO> buscar(){
        List<ItensComprasTO> gmclstP = new LinkedList<>();
        ResultSet gmcrs;
        try{
            PreparedStatement ppStmt = gmcconn.prepareStatement("select   produtos.nome, produtos.codigo_barras, item_compra.cod_item, item_compra.quantidade, item_compra.situacao, item_compra.cod_comp from item_compra inner join\n" +
"produtos where item_compra.cod_item = produtos.cod_prod and situacao = 0;");
            gmcrs = ppStmt.executeQuery();
            while(gmcrs.next()){
                gmclstP.add(getItensCompras(gmcrs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    return gmclstP;
    }
    
      public ItensComprasTO getItensCompras(ResultSet rs) throws SQLException{
        ItensComprasTO gmcp = new ItensComprasTO();
          ProdutosTO gmp = new ProdutosTO();
        gmcp.setQuantidade(rs.getInt("quantidade"));
        //gmcp.setCod_prod(rs.getInt("cod_prod"));
        gmcp.setCod_comp(rs.getInt("cod_comp"));  
         gmcp.setSituacao(rs.getInt("situacao")); 
         gmcp.setCod_item(rs.getInt("cod_item"));
         gmcp.setNome(rs.getString("nome"));
         gmcp.setBarras(rs.getString("codigo_barras"));
     
            return gmcp;
    }
}
