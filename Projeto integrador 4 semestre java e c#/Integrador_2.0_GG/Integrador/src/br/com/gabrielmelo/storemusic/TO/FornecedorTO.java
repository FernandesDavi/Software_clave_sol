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
public class FornecedorTO {
    private int cod_forn;
    private String nome_fant;
    private String cnpj;
    private String inscricao_est;
    private String logradouro;
    private int numero;
    private String cep;
    private String complemento;
    private String telefone;
    private String celular;       

    public int getCod_forn() {
        return cod_forn;
    }

    public void setCod_forn(int cod_forn) {
        this.cod_forn = cod_forn;
    }

    public String getNome_fant() {
        return nome_fant;
    }

    public void setNome_fant(String nome_fant) {
        this.nome_fant = nome_fant;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricao_est() {
        return inscricao_est;
    }

    public void setInscricao_est(String inscricao_est) {
        this.inscricao_est = inscricao_est;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    
}
