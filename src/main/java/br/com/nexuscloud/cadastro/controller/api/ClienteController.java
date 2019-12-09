package br.com.nexuscloud.cadastro.controller.api;

import javax.ejb.Local;

import br.com.nexuscloud.cadastro.dto.ClienteDTO;

@Local
public interface ClienteController extends AbstractCrudController<ClienteDTO> {

}
