/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.BO;

import br.com.gabrielmelo.storemusic.DAO.FornecedorDAO;
import br.com.gabrielmelo.storemusic.TO.FornecedorTO;
import java.util.List;

/**
 *
 * @author Gabriel Costa
 */
public class FornecedorBO {
    FornecedorDAO gmcFornecedor;
    public FornecedorBO() {
        gmcFornecedor = new FornecedorDAO();
    }
    public void salvar(FornecedorTO c)
    {
        gmcFornecedor.salvar(c);
    } 
     public List<FornecedorTO> getFornecedor(){
        return gmcFornecedor.Consultar();
    }
     
    public void alterar(FornecedorTO c)
    {
        gmcFornecedor.alterar(c);
    }  
    public void excluir(FornecedorTO c)
    {
        gmcFornecedor.excluir(c);
    }
    
    public List<FornecedorTO> getFornecedorNome(FornecedorTO c)
    {
        return gmcFornecedor.getFornecedorNome(c);
    }
    
    public List<FornecedorTO> getNomeId(FornecedorTO c)
    {
        return gmcFornecedor.getNomeId(c);
    }
}
