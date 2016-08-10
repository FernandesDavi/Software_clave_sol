/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.Utilitarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Grafico {
    Connection gmcconn;
    ResultSet gmcrs;
    int total = 0; 
    public Grafico() {
        gmcconn = new Conexao().conectar();
        //conn = new GMCConexao().
    } 
    
    public int getTotalFuncionario(){
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
    
    public int getTotalCliente(){
        ResultSet rs;
        int total=0;
        
        try{
            PreparedStatement ppStmt = gmcconn.prepareStatement("SELECT count(*) AS total from cliente");
            rs = ppStmt.executeQuery();
            
                while(rs.next()){
                    //rs.next();
                    total = rs.getInt("total");
                }
        }catch(SQLException ex){
        
        }
        return total;
    }
    
    public float getTotalContas(float mes){
        ResultSet rs;
        float total=0;
        
        try{
            PreparedStatement ppStmt = gmcconn.prepareStatement("select dtvenc,valor as val from contas where month(dtvenc)  = "+mes+"");
            rs = ppStmt.executeQuery();
            
                while(rs.next()){
                    //rs.next();
                    total = total + rs.getFloat("val");
                    
                }
        }catch(SQLException ex){
        
        }
        return total;
    }
}
