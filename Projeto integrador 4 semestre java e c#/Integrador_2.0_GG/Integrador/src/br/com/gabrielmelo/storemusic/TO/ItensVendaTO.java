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
public class ItensVendaTO {
    private int cod_item;
    private double quantidade;
    private int cod_prod;
    private int cod_venda;

    public int getCod_item() {
        return cod_item;
    }

    public void setCod_item(int cod_item) {
        this.cod_item = cod_item;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public int getCod_venda() {
        return cod_venda;
    }

    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }
}
