/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.BO;

import br.com.gabrielmelo.storemusic.DAO.FuncionarioDAO;
import br.com.gabrielmelo.storemusic.TO.FuncionarioTO;
import java.util.List;

/**
 *
 * @author Gabriel Costa
 */
public class FuncionarioBO {
    FuncionarioDAO gmcFuncionario;
    public FuncionarioBO() {
        gmcFuncionario = new FuncionarioDAO();
    }
    public void salvar(FuncionarioTO c)
    {
        gmcFuncionario.salvar(c);
    } 
     public List<FuncionarioTO> getFuncionario(){
        return gmcFuncionario.Consultar();
    }
     
    public void alterar(FuncionarioTO c)
    {
        gmcFuncionario.alterar(c);
    }  
    public void excluir(FuncionarioTO c)
    {
        gmcFuncionario.excluir(c);
    }
    
    public List<FuncionarioTO> getFuncionarioNome()
    {
        return gmcFuncionario.getFuncionarioNome();
    }
    
    public List<FuncionarioTO> getNomeId(FuncionarioTO c)
    {
        return gmcFuncionario.getNomeId(c);
    }
}


