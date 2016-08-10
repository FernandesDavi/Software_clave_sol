/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.DAO;

import br.com.gabrielmelo.storemusic.TO.UsuarioTO;
import br.com.gabrielmelo.storemusic.Utilitarios.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gabriel Costa
 */
public class UsuarioDAO {
    Connection gmcconn;
    public UsuarioDAO() {
        gmcconn = new Conexao().conectar();
        //conn = new GMCConexao().
    }
    
    public List<UsuarioTO> Consultar(){
        List<UsuarioTO> gmclstP = new LinkedList<>();
        ResultSet gmcrs;
        try{
            PreparedStatement ppStmt = gmcconn.prepareStatement("SELECT * FROM usuario;");
            gmcrs = ppStmt.executeQuery();
            while(gmcrs.next()){
                gmclstP.add(getProdutos(gmcrs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    return gmclstP;
    }
    
    public UsuarioTO getProdutos(ResultSet rs) throws SQLException{
        UsuarioTO gmcp = new UsuarioTO();
        gmcp.setCod_user(rs.getInt("cod_user"));
        gmcp.setUsuario(rs.getString("usuario"));
        gmcp.setSenha(rs.getString("senha"));
        
            return gmcp;
    }
}
