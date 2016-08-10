/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.BO;

import br.com.gabrielmelo.storemusic.DAO.itensComprasDAO;
import br.com.gabrielmelo.storemusic.TO.ItensComprasTO;
import java.util.List;

/**
 *
 * @author Davi
 */
public class ItensCompraBO {
            itensComprasDAO gmcItensVenda;
    public ItensCompraBO() {
        gmcItensVenda = new itensComprasDAO();
    }
    public void salvar(ItensComprasTO c)
    {
        gmcItensVenda.salvar(c);
    } 
     public void Atualizar(ItensComprasTO c)
    {
        gmcItensVenda.Atualizar(c);
    } 
            public List<ItensComprasTO> getCompras(){
        return gmcItensVenda.buscar();
    }
      
    
}
