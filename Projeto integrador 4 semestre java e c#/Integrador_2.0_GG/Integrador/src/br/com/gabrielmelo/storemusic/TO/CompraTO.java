/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.TO;


/**
 *
 * @author Gabriel Costa
 */
public class CompraTO {
    private int cod_comp;
    private float valor_tot;
    private int cod_forn;
    private int cod_func;

    public int getCod_comp() {
        return cod_comp;
    }

    public void setCod_comp(int cod_comp) {
        this.cod_comp = cod_comp;
    }

    public float getValor_tot() {
        return valor_tot;
    }

    public void setValor_tot(float valor_tot) {
        this.valor_tot = valor_tot;
    }

    public int getCod_forn() {
        return cod_forn;
    }

    public void setCod_forn(int cod_forn) {
        this.cod_forn = cod_forn;
    }

    public int getCod_func() {
        return cod_func;
    }

    public void setCod_func(int cod_func) {
        this.cod_func = cod_func;
    }
}
