/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.BO;

import br.com.gabrielmelo.storemusic.DAO.LoginDAO;
import br.com.gabrielmelo.storemusic.TO.LoginTO;

/**
 *
 * @author aluno
 */
public class LoginBO {
    LoginDAO gmcLogin;
    public LoginBO() {
        gmcLogin = new LoginDAO();
    }
    
    public boolean login(String usuario,String senha){
      boolean resul =  gmcLogin.login(usuario,senha);
        return resul;
    }
            
    public String validaAcesso(){
         String nivelAcesso = gmcLogin.ValidaAcesso();
        return nivelAcesso;
    }   
    
    /*
            
            
             public void salvar(ProdutosTO c)
    {
        gmcProdutos.salvar(c);
    } 
            
            */
}
