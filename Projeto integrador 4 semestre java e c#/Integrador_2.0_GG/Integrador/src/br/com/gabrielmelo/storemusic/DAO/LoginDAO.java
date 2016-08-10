/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.DAO;

import br.com.gabrielmelo.storemusic.TO.LoginTO;
import br.com.gabrielmelo.storemusic.TO.Nivel_AcessoTO;
import br.com.gabrielmelo.storemusic.Utilitarios.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class LoginDAO {
     LoginTO lTO = new LoginTO();
     Nivel_AcessoTO nTO= new Nivel_AcessoTO();
     Connection gmcconn;
     ResultSet rs;
     ResultSet rs2;
     String sessao = null;
     String login = null; String password = null;
     String nivel_acesso = null;int niv;
    public LoginDAO() {
        gmcconn = new Conexao().conectar();
        //conn = new GMCConexao().
    }
    
    public boolean login(String usuario,String senha){
        login = usuario;
        password = senha;
        boolean x = false;
        
        try{
            PreparedStatement ppStmt = gmcconn.prepareStatement("select * from usuario where usuario like '"+usuario+"' and senha like '"+senha+"'");
            rs = ppStmt.executeQuery();
            if(rs.next()){
                x = true;
                sessao = rs.getString("usuario");
                niv = rs.getInt("cod_niv");
                lTO.setSenha(senha);
                lTO.setUsuario(usuario);
                
                //System.out.println(""+sessao+"");
                //System.out.println(""+lTO.getUsuario()+"");
            }else{
                x = false;
            }
            
        }catch(SQLException e){
            System.out.println("Erro: "+e+"");
        }
    
        
        
        return x;
    }
    
    public String ValidaAcesso(){
        //Usado para cptura de um atributo do banco que irá restringir seu acesso a usuario ou adm
        try{
            PreparedStatement ppStmt2 = gmcconn.prepareStatement("select nivel_acesso from nivel_acesso inner join usuario where nivel_acesso.cod_Niv = '"+niv+"'");
            rs2 = ppStmt2.executeQuery();
                if(rs2.next()){
                    nivel_acesso = rs2.getString("nivel_acesso");
                    nTO.setNivel_acesso(nivel_acesso);
                    System.out.println(""+nivel_acesso+"");
                }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return nivel_acesso;
    }
    
    public String loginNome(){
        try{
            PreparedStatement ppStmt = gmcconn.prepareStatement("select * from usuario where usuario like '"+login+"' and senha like '"+password+"'");
            rs = ppStmt.executeQuery();
            rs.next();
            sessao = rs.getString("usuario");
                
                
            if(rs.next()){
                //x = true;
                sessao = rs.getString("usuario");
                //System.out.println(""+sessao+"");
                //lTO.setSenha(senha);
                //lTO.setUsuario(usuario);
                
            }else{
                //x = false;
            } 
        }catch(SQLException e){
            System.out.println("Erro: "+e+"");
        }
        return sessao;
    }
    
    
    
    /*
    public int getTotalClientes(){
        ResultSet rs;
        int total=0;
        
        try{
            PreparedStatement ppStmt = gmcconn.prepareStatement("SELECT count(*) AS total from funcionario");
            rs = ppStmt.executeQuery();
            
                while(rs.next()){
                    //rs.next();
                    total = rs.getInt("total");
                }
        }catch(SQLException ex){
        
        }
        return total;
    }
    
    */
        
}
