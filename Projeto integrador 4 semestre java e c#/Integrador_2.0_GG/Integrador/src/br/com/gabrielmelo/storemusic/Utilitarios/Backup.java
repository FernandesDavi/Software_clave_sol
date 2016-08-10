/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.Utilitarios;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Gabriel Costa
 */
//Exemplo: C:\wamp\bin\mysql\mysql5.6.12\bin\mysqldump.exe -u root -proot Test_Music > D:\4Semestre\Java\Backup\testeBackup.sql
public class Backup {
    int cont = 0;
    
    public void realizaBackup(File caminho){
        cont++;
        //System.out.println("'"+cont+++"'");
        File diretorio = new File("G:/4Semestre/Java/Backup");
        //System.out.println("'"+cont+++"'");
        File arq = new File(""+caminho+"");
        System.out.println("'"+cont+++"'");
         if(!diretorio.isDirectory()) {  
               
               new File("G:/4Semestre/Java/Backup").mkdir();  
            } else {  
              
            }  
        
        try {  
                if(!arq.isFile()) {  
                    //PARA O FUNCIONAMENTO DO CÓDIGO TIRAR AS BARRAS DUPLAS
 Runtime.getRuntime().exec("cmd /c C://wamp/bin/mysql/mysql5.6.17/bin/mysqldump.exe -u root -proot Test_Music > "+caminho);  
 
                    //D:\\4Semestre\\Java\\Backup\\testeBackup1.sql
//C:\wamp\bin\mysql\mysql5.6.12\bin\mysqldump.exe -u root -proot Test_Music > G:\4Semestre\Java\Backup\testeBackup.sql
                    System.out.println("Backup Realizado com sucesso 1");
                } else {  
                    
                    while(arq.isFile()) {  
                        System.out.println("'"+cont+++"'");
                        cont++;  
                        arq = new File(""+caminho+"");  
                    }  
                    //PARA O FUNCIONAMENTO DO CÓDIGO TIRAR AS BARRAS DUPLAS
                    Runtime.getRuntime().exec("cmd /c C://wamp/bin/mysql/mysql5.6.17/bin/mysqldump.exe -u root -proot Test_Music > "+caminho);  
                    //C:\wamp\bin\mysql\mysql5.6.17\bin
                    System.out.println("Backup Realizado com sucesso 2");
                }  
                } catch (IOException ex) {  
                    ex.printStackTrace();  
                }  
         
         
    }
}
