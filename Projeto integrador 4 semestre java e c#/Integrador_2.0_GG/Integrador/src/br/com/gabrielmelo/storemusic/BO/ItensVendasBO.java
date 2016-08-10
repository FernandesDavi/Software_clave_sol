/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.BO;

import br.com.gabrielmelo.storemusic.DAO.ItensVendasDAO;
import br.com.gabrielmelo.storemusic.TO.ItensVendaTO;

/**
 *
 * @author Davi
 */
public class ItensVendasBO {
        ItensVendasDAO gmcItensVenda;
    public ItensVendasBO() {
        gmcItensVenda = new ItensVendasDAO();
    }
    public void salvar(ItensVendaTO c)
    {
        gmcItensVenda.salvar(c);
    } 
}

