/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.BO;

import br.com.gabrielmelo.storemusic.DAO.ComprasDAO;
import br.com.gabrielmelo.storemusic.TO.CompraTO;
import java.util.List;

/**
 *
 * @author Davi
 */
public class ComprasBO {
      ComprasDAO gmcCompras;
    public ComprasBO() {
        gmcCompras = new ComprasDAO();
    }
     public void salvar(CompraTO c)
    {
        gmcCompras.salvar(c);
    } 
 
   
}
