/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.DAO;

import br.com.gabrielmelo.storemusic.TO.CaixaTO;
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
 * @author aluno
 */
public class CaixaDAO {

    Connection gmcconn;

    public CaixaDAO() {
        gmcconn = new Conexao().conectar();
        //conn = new GMCConexao().
    }

    public void salvar(CaixaTO c) {//logradouro,numero,cep,complemento,telefone,celular
        try {
            PreparedStatement gmcstmt = gmcconn.prepareStatement("INSERT INTO caixa(valor, cod_venda, status, parcela) values(?,?,?,?)");
            gmcstmt.setFloat(1, c.getValor());
            gmcstmt.setInt(2, c.getVenda());
            gmcstmt.setInt(3, c.getStatus());
            gmcstmt.setInt(4, c.getParcela());

            gmcstmt.execute();
          
            System.out.println("Cadastrou!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void salvarCompra(CaixaTO c) {//logradouro,numero,cep,complemento,telefone,celular
        try {
            PreparedStatement gmcstmt = gmcconn.prepareStatement("INSERT INTO caixa(valor, cod_comp, status, parcela) values(?,?,?,?)");
            gmcstmt.setFloat(1, c.getValor());
            gmcstmt.setInt(2, c.getCompra());
            gmcstmt.setInt(3, c.getStatus());
            gmcstmt.setInt(4, c.getParcela());

            gmcstmt.execute();
            System.out.println("Cadastrou!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<CaixaTO> ConsultarGenericoPrazo(String rs) {
        List<CaixaTO> gmclstP = new LinkedList<>();
        ResultSet gmcrs;
        try {
            PreparedStatement ppStmt = gmcconn.prepareStatement(rs);
            gmcrs = ppStmt.executeQuery();
            while (gmcrs.next()) {
                gmclstP.add(getCaixaPrazo(gmcrs));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return gmclstP;
    }

    public List<CaixaTO> ConsultarGenericoVista(String rs) {
        List<CaixaTO> gmclstP = new LinkedList<>();
        ResultSet gmcrs;
        try {
            PreparedStatement ppStmt = gmcconn.prepareStatement(rs);
            gmcrs = ppStmt.executeQuery();
            while (gmcrs.next()) {
                gmclstP.add(getCaixaVista(gmcrs));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return gmclstP;
    }

    public CaixaTO getCaixaVista(ResultSet rs) throws SQLException {
        CaixaTO gmcC = new CaixaTO();
        gmcC.setVista(rs.getFloat("x"));

        return gmcC;
    }

    public CaixaTO getCaixaPrazo(ResultSet rs) throws SQLException {
        CaixaTO gmcC = new CaixaTO();
        gmcC.setPrazo(rs.getFloat("y"));

        return gmcC;
    }

}
