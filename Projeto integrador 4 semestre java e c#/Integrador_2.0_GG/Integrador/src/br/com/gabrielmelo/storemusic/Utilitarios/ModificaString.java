/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.Utilitarios;

/**
 *
 * @author Gabriel Costa
 */
public class ModificaString {
    public int extrairCodigo(String dados)
    {
        int t = dados.length();
        int p = dados.indexOf("|");
        String c = dados.substring(p+2, t);
        
        return Integer.parseInt(c);
    }
    
   
}
