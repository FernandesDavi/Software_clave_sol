/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.TO;

import sun.util.calendar.LocalGregorianCalendar.Date;

/**
 *
 * @author Gabriel Costa
 */
public class ContasTO {
    private int cod_conta;
    private String conta;
    private float valor;
    private String dtvenc;        
    private int cod_cont;        
    private int cod_func;      
    private String func;
    private String contador;

    public String getContador() {
        return contador;
    }

    public void setContador(String contador) {
        this.contador = contador;
    }
    
    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }
    
    public int getCod_conta() {
        return cod_conta;
    }

    public void setCod_conta(int cod_conta) {
        this.cod_conta = cod_conta;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDtvenc() {
        return dtvenc;
    }

    public void setDtvenc(String dtvenc) {
        this.dtvenc = dtvenc;
    }

    public int getCod_cont() {
        return cod_cont;
    }

    public void setCod_cont(int cod_cont) {
        this.cod_cont = cod_cont;
    }

    public int getCod_func() {
        return cod_func;
    }

    public void setCod_func(int cod_func) {
        this.cod_func = cod_func;
    }
}
