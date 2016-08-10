/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.BO;

import br.com.gabrielmelo.storemusic.DAO.ContadorDAO;
import br.com.gabrielmelo.storemusic.TO.ContadorTO;
import java.util.List;

/**
 *
 * @author Gabriel Costa
 */

public class ContadorBO {
    ContadorDAO gmcContador;
    public ContadorBO() {
        gmcContador = new ContadorDAO();
    }
    public void salvar(ContadorTO c)
    {
        gmcContador.salvar(c);
    } 
     public List<ContadorTO> getContador(){
        return gmcContador.Consultar();
    }
     
    public void alterar(ContadorTO c)
    {
        gmcContador.alterar(c);
    }  
    public void excluir(ContadorTO c)
    {
        gmcContador.excluir(c);
    }
    
    public List<ContadorTO> getContadorNome()
    {
        
        return gmcContador.getContadorNome();
        
    }
    
    public List<ContadorTO> getNomeId(ContadorTO c)
    {
        return gmcContador.getNomeId(c);
    }
}
