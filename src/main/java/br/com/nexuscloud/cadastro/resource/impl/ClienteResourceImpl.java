package br.com.nexuscloud.cadastro.resource.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.nexuscloud.cadastro.controller.api.AbstractCrudController;
import br.com.nexuscloud.cadastro.controller.api.ClienteController;
import br.com.nexuscloud.cadastro.dto.ClienteDTO;
import br.com.nexuscloud.cadastro.resource.api.ClienteResource;

@Stateless
public class ClienteResourceImpl extends AbstractCrudResourceImpl<ClienteDTO> implements ClienteResource {

    @Inject
    private ClienteController controller;

    @Override
    protected AbstractCrudController<ClienteDTO> getController() {
	return controller;
    }

}
