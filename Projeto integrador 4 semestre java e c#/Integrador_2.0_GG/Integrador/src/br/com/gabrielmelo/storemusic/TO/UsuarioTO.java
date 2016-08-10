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
public class UsuarioTO {

    private int cod_user;
    private String usuario;
    private String senha;
    private int cod_niv;
    private int cod_func;

    
    public int getCod_user() {
        return cod_user;
    }

    public void setCod_user(int cod_user) {
        this.cod_user = cod_user;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCod_niv() {
        return cod_niv;
    }

    public void setCod_niv(int cod_niv) {
        this.cod_niv = cod_niv;
    }

    public int getCod_func() {
        return cod_func;
    }

    public void setCod_func(int cod_func) {
        this.cod_func = cod_func;
    }
    
}
