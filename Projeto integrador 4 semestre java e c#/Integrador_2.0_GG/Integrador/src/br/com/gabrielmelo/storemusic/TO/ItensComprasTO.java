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
public class ItensComprasTO {

    private int cod_item;
    private float quantidade;       
    private int situacao;       
    private int cod_comp;      
    private int cod_prod;   
    private String nome;
    private String barras;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBarras() {
        return barras;
    }

    public void setBarras(String barras) {
        this.barras = barras;
    }

    public int getCod_item() {
        return cod_item;
    }

    public void setCod_item(int cod_item) {
        this.cod_item = cod_item;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public int getCod_comp() {
        return cod_comp;
    }

    public void setCod_comp(int cod_comp) {
        this.cod_comp = cod_comp;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }
            
}
