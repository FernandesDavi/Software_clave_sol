/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.TO;

/**
 *
 * @author aluno
 */
public class CaixaTO {

    private int cod_caixa;
    private float valor;
    private int venda;
    private int compra;
    private float Vista;
    private float Prazo;
    private int status;
    private int parcela;

    public float getVista() {
        return Vista;
    }

    public void setVista(float Vista) {
        this.Vista = Vista;
    }

    public float getPrazo() {
        return Prazo;
    }

    public void setPrazo(float Prazo) {
        this.Prazo = Prazo;
    }

    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCod_caixa() {
        return cod_caixa;
    }

    public void setCod_caixa(int cod_caixa) {
        this.cod_caixa = cod_caixa;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }

}
