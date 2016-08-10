/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.BO;

import br.com.gabrielmelo.storemusic.DAO.ProdutosDAO;
import br.com.gabrielmelo.storemusic.TO.ProdutosTO;
import java.util.List;

/**
 *
 * @author Gabriel Costa
 */
public class ProdutosBO {
    ProdutosDAO gmcProdutos;
    public ProdutosBO() {
        gmcProdutos = new ProdutosDAO();
    }
    public void salvar(ProdutosTO c)
    {
        gmcProdutos.salvar(c);
    } 
     public List<ProdutosTO> getProdutos(){
        return gmcProdutos.getProdutosNome();
    }
        public List<ProdutosTO> getProdutos2(){
        return gmcProdutos.Consultar();
    }
    public void alterar(ProdutosTO c)
    {
        gmcProdutos.alterar(c);
    }  
    
    public void AtualizaEstoque(ProdutosTO c)
    {
        gmcProdutos.AtualizaEstoque(c);
    }
     public void AtualizaEstoqueCompra(ProdutosTO c)
    {
        gmcProdutos.AtualizaEstoqueCompras(c);
    }
    
    public void excluir(ProdutosTO c)
    {
        gmcProdutos.excluir(c);
    }
    
//    public List<ProdutosTO> getProdutosNome(ProdutosTO c)
//    {
//        return gmcProdutos.getProdutosNome(c);
//    }
    public List<ProdutosTO> getNomeId(ProdutosTO c)
    {
        return gmcProdutos.getNomeId(c);
    }
   
    public List<ProdutosTO> getDadosProd(ProdutosTO c){
        return gmcProdutos.getDadosProd(c);
    }
    
     public List<ProdutosTO> getQtdId(ProdutosTO c)
    {
        return gmcProdutos.getQtdId(c);
    }
}
