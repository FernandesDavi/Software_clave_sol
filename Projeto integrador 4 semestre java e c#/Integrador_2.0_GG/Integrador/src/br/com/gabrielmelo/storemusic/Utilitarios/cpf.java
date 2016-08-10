/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.Utilitarios;

/**
 *
 * @author Davi
 */
public class cpf {
     public String cpfcnpj(String cpfCnpj){
       
cpfCnpj = cpfCnpj.replace(".",""); // substitui o ponto por uma String vazia    
cpfCnpj = cpfCnpj.replace("-",""); // substitui o traço por uma String vazia    
cpfCnpj = cpfCnpj.replace("/",""); // substitui a barra por uma String vazia  

return cpfCnpj;
    }
    
}
