/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.BO;

import br.com.gabrielmelo.storemusic.DAO.ContasDAO;
import br.com.gabrielmelo.storemusic.TO.ContasTO;
import java.util.List;

/**
 *
 * @author Gabriel Costa
 */
public class ContasBO {
    ContasDAO gmcContas;
    public ContasBO() {
        gmcContas = new ContasDAO();
    }
    public void salvar(ContasTO c)
    {
        gmcContas.salvar(c);
    } 
     public List<ContasTO> getContas(){
        return gmcContas.Consultar();
    }
     
    public void alterar(ContasTO c)
    {
        gmcContas.alterar(c);
    }  
    public void excluir(ContasTO c)
    {
        gmcContas.excluir(c);
    }
    
    public List<ContasTO> getContasNome(ContasTO c)
    {
        return gmcContas.getContasNome(c);
    }
    public List<ContasTO> getNomeId(ContasTO c)
    {
        return gmcContas.getNomeId(c);
    }
}
