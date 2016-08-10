/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gabrielmelo.storemusic.BO;

import br.com.gabrielmelo.storemusic.DAO.UsuarioDAO;
import br.com.gabrielmelo.storemusic.TO.UsuarioTO;
import java.util.List;

/**
 *
 * @author Gabriel Costa
 */
public class UsuarioBO {
    UsuarioDAO gmcUsuario;
    public UsuarioBO() {
        gmcUsuario = new UsuarioDAO();
    }
  
     public List<UsuarioTO> getUsuario(){
        return gmcUsuario.Consultar();
    }
     
    
}
