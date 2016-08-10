/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.DAO;

import br.com.gabrielmelo.storemusic.TO.ProdutosTO;
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
public class ProdutosDAO {
    Connection gmcconn;
    public ProdutosDAO() {
        gmcconn = new Conexao().conectar();
        //conn = new GMCConexao().
    }
    
    public void salvar(ProdutosTO c)
    {
        try 
        {
            PreparedStatement gmcstmt = gmcconn.prepareStatement("INSERT INTO produtos(codigo_barras,tipo, nome, unidade, valor, valor_custo"
                    + ",quantidade) values(?,?,?,?,?,?,?)");
            gmcstmt.setString(1,c.getCod_barras());
            gmcstmt.setString(2, c.getTipo());
            gmcstmt.setString(3, c.getNome());
            gmcstmt.setFloat(4, c.getUnidade());
            gmcstmt.setFloat(5, c.getValor());
            gmcstmt.setFloat(6, c.getValor_custo());
            gmcstmt.setInt(7,c.getQuantidade());
            

            
            gmcstmt.execute();
                        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");

        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
      
    public void alterar(ProdutosTO c)
    {
        try 
        {            
            PreparedStatement gmcstmt = gmcconn.prepareStatement("UPDATE produtos SET tipo=?, nome=?, unidade=?, valor=?, quantidade=?, codigo_barras=? WHERE cod_prod = ?");
            gmcstmt.setString(1, c.getTipo());
            gmcstmt.setString(2, c.getNome());
            gmcstmt.setFloat(3, c.getUnidade());
            gmcstmt.setFloat(4, c.getValor());
            gmcstmt.setInt(5,c.getQuantidade());
            gmcstmt.setString(6,c.getCod_barras());
            gmcstmt.setInt(7,c.getCod_prod());
            gmcstmt.execute();
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");

            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void excluir(ProdutosTO c)
    {
        try 
        {
            PreparedStatement stmt = gmcconn.prepareStatement("DELETE FROM produtos WHERE cod_prod = ?");
            stmt.setInt(1, c.getCod_prod());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso");
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
   
    public List<ProdutosTO> Consultar(){
        List<ProdutosTO> gmclstP = new LinkedList<>();
        ResultSet gmcrs;
        try{
            PreparedStatement ppStmt = gmcconn.prepareStatement("SELECT * FROM produtos where quantidade > 0");
            gmcrs = ppStmt.executeQuery();
            while(gmcrs.next()){
                gmclstP.add(getProdutos(gmcrs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    return gmclstP;
    }
    
    public List<ProdutosTO> getProdutosNome()
    {
        List<ProdutosTO> lstC = new LinkedList<ProdutosTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM produtos");
            //stmt.setString(1, c.getNome()+"%");
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getProdutos(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    }
    
    public List<ProdutosTO> getDadosProd(ProdutosTO c){
        List<ProdutosTO> lstC = new LinkedList<ProdutosTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM produtos WHERE cod_prod = ?");
            stmt.setInt(1, c.getCod_prod());
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getProdutos(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    
    }
    
    public List<ProdutosTO> getNomeId(ProdutosTO c)
    {
        List<ProdutosTO> lstC = new LinkedList<ProdutosTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM produtos WHERE codigo_barras = ?");
            stmt.setString(1, c.getCod_barras());
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getProdutos(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    }
    
    
    public List<ProdutosTO> getQtdId(ProdutosTO c)
    {
        List<ProdutosTO> lstC = new LinkedList<ProdutosTO>();
        ResultSet rs;
        try
        {
            PreparedStatement stmt = gmcconn.prepareStatement("SELECT * FROM produtos WHERE cod_prod = ?");
            stmt.setInt(1, c.getCod_prod());
            rs = stmt.executeQuery();
            while(rs.next())
            {
                lstC.add(getProdutos(rs));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return lstC;
    }
    
    public void AtualizaEstoque(ProdutosTO p)
    {
        try 
        {            
            PreparedStatement gmcstmt = gmcconn.prepareStatement("UPDATE produtos SET quantidade = quantidade - ? WHERE cod_prod = ?");
            gmcstmt.setInt(1, p.getQuantidade());
            gmcstmt.setInt(2, p.getCod_prod());
            gmcstmt.execute();
            System.out.println("Alterou!");
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
        public void AtualizaEstoqueCompras(ProdutosTO p)
    {
        try 
        {            
            PreparedStatement gmcstmt = gmcconn.prepareStatement("UPDATE produtos SET quantidade = quantidade + ? WHERE cod_prod = ?");
            gmcstmt.setInt(1, p.getQuantidade());
            gmcstmt.setInt(2, p.getCod_prod());
            gmcstmt.execute();
            System.out.println("Alterou!");
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    public ProdutosTO getProdutos(ResultSet rs) throws SQLException{
        ProdutosTO gmcp = new ProdutosTO();
        gmcp.setCod_prod(rs.getInt("cod_prod"));
        gmcp.setCod_barras(rs.getString("codigo_barras"));
        gmcp.setTipo(rs.getString("tipo"));
        gmcp.setNome(rs.getString("nome"));
        gmcp.setUnidade(rs.getFloat("unidade"));
        gmcp.setValor(rs.getFloat("valor"));
        gmcp.setValor_custo(rs.getFloat("valor_custo"));
        gmcp.setQuantidade(rs.getInt("quantidade"));
        
        
            return gmcp;
    }
}
