package br.com.nexuscloud.cadastro.controller.api;

import javax.ejb.Local;

import br.com.nexuscloud.cadastro.dto.UsuarioCreateDTO;
import br.com.nexuscloud.cadastro.dto.UsuarioDTO;

@Local
public interface UsuarioController extends AbstractCrudController<UsuarioDTO> {

    /**
     * Cria um novo usuário
     * 
     * @param entity
     * @return
     */
    UsuarioDTO save(UsuarioCreateDTO entity);

}
