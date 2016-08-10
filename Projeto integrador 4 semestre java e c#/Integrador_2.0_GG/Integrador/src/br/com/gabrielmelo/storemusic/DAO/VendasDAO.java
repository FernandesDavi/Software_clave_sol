package br.com.gabrielmelo.storemusic.DAO;

import br.com.gabrielmelo.storemusic.TO.ClienteTO;
import br.com.gabrielmelo.storemusic.TO.VendasTO;
import br.com.gabrielmelo.storemusic.Utilitarios.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;
import sun.java2d.pipe.SpanShapeRenderer;

public class VendasDAO {
        Connection gmcconn;
    public VendasDAO() {
        gmcconn = new Conexao().conectar();
    }
    
    public void salvar(VendasTO c)
    {
        try 
        {
            SimpleDateFormat d = new SimpleDateFormat();
            PreparedStatement gmcstmt = gmcconn.prepareStatement("INSERT INTO vendas(valtotal, cod_func, cod_cli) values(?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);            
            gmcstmt.setFloat(1, c.getValtotal());
            gmcstmt.setInt(2, c.getCod_func());
            gmcstmt.setInt(3, c.getCod_cli());
                        
            gmcstmt.execute();
            
            ResultSet chave = gmcstmt.getGeneratedKeys();
            
            while (chave.next())  c.setCod_venda(chave.getInt(1));
            
            System.out.println("Cadastrou!");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
     public VendasTO getVendas(ResultSet rs) throws SQLException{
        VendasTO gmcp = new VendasTO();
        gmcp.setValtotal(rs.getFloat("valtotal"));
        gmcp.setCod_func(rs.getInt("cod_func"));
        gmcp.setCod_cli(rs.getInt("cod_cli"));
        return gmcp;
    }
}
