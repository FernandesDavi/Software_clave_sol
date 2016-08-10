/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.BO;

import br.com.gabrielmelo.storemusic.DAO.ClienteDAO;
import br.com.gabrielmelo.storemusic.TO.ClienteTO;
import java.util.List;

/**
 *
 * @author Gabriel Costa
 */
public class ClienteBO {
    ClienteDAO gmcCliente;
    public ClienteBO() {
        gmcCliente = new ClienteDAO();
    }
    public void salvar(ClienteTO c)
    {
        gmcCliente.salvar(c);
    } 
     public List<ClienteTO> getCliente(){
        return gmcCliente.Consultar();
    }
     
    public void alterar(ClienteTO c)
    {
        gmcCliente.alterar(c);
    }  
    public void excluir(ClienteTO c)
    {
        gmcCliente.excluir(c);
    }
    
    public List<ClienteTO> getClienteNome(ClienteTO c)
    {
        return gmcCliente.getClienteNome(c);
    }
    
    public List<ClienteTO> getNomeId(ClienteTO c)
    {
        return gmcCliente.getNomeId(c);
    }
    public List<ClienteTO> getCpf(ClienteTO c)
    {
        return gmcCliente.getCpf(c);
    }
}

