/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.Utilitarios;

import java.util.Date;
import sun.util.calendar.LocalGregorianCalendar;

/**
 *
 * @author Gabriel Costa
 */
public class Relogio {
    Date data = new Date();
    int hora;
    int minuto;
    int segundo;
    
    public int hora(){
        hora = data.getHours();
        return hora;
    }
    
    public int minuto(){
        minuto = data.getMinutes();
        return minuto;
    }
    
    public int segundo(){
        segundo = data.getSeconds();
        return segundo;
    }
    
}
