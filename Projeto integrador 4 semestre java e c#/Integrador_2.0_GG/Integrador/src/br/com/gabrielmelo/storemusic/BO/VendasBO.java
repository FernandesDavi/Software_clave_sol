/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.BO;

import br.com.gabrielmelo.storemusic.DAO.VendasDAO;
import br.com.gabrielmelo.storemusic.TO.VendasTO;

/**
 *
 * @author aluno
 */
public class VendasBO {
    VendasDAO gmcVendas;
    public VendasBO() {
        gmcVendas = new VendasDAO();
    }
    public void salvar(VendasTO c)
    {
        gmcVendas.salvar(c);
    } 
}
