/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.TO;

import java.sql.Time;
import sun.util.calendar.LocalGregorianCalendar.Date;

/**
 *
 * @author Gabriel Costa
 */
public class VendasTO {
    
    private int cod_venda;
    private float valtotal;
    private Date data;
    private Time hora;
    private int cod_func;       
    private int cod_cli;       

    public int getCod_venda() {
        return cod_venda;
    }

    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }

    public float getValtotal() {
        return valtotal;
    }

    public void setValtotal(float valtotal) {
        this.valtotal = valtotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getCod_func() {
        return cod_func;
    }

    public void setCod_func(int cod_func) {
        this.cod_func = cod_func;
    }

    public int getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(int cod_cli) {
        this.cod_cli = cod_cli;
    }
}
