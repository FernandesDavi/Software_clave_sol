/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.BO;

import br.com.gabrielmelo.storemusic.DAO.CaixaDAO;
import br.com.gabrielmelo.storemusic.TO.CaixaTO;
import java.util.List;

/**
 *
 * @author aluno
 */
public class CaixaBO {

    CaixaDAO gmcCliente;

    public CaixaBO() {
        gmcCliente = new CaixaDAO();
    }

    public void salvar(CaixaTO c) {
        gmcCliente.salvar(c);
    }

    public void salvarCompra(CaixaTO c) {
        gmcCliente.salvarCompra(c);
    }

    public List<CaixaTO> ConsultarGenericoPrazo(String x) {
        return gmcCliente.ConsultarGenericoPrazo(x);
    }

    public List<CaixaTO> ConsultarGenericoVista(String x) {
        return gmcCliente.ConsultarGenericoVista(x);
    }
}
