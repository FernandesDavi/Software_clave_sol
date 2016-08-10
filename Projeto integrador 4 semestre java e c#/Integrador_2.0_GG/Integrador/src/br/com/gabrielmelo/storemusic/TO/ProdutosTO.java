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
public class ProdutosTO {
    private int cod_prod;
    private String tipo;
    private String nome;
    private float unidade;       
    private float valor;  
    private float valor_custo;
    private int quantidade;  
    private float subtotal; 
    private String cod_barras;

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public float getValor_custo() {
        return valor_custo;
    }

    public void setValor_custo(float valor_custo) {
        this.valor_custo = valor_custo;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getUnidade() {
        return unidade;
    }

    public void setUnidade(float unidade) {
        this.unidade = unidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
