package br.com.nexuscloud.cadastro.resource.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

import br.com.nexuscloud.cadastro.controller.api.AbstractCrudController;
import br.com.nexuscloud.cadastro.controller.api.UsuarioController;
import br.com.nexuscloud.cadastro.dto.UsuarioCreateDTO;
import br.com.nexuscloud.cadastro.dto.UsuarioDTO;
import br.com.nexuscloud.cadastro.resource.api.UsuarioResource;

@Stateless
public class UsuarioResourceImpl extends AbstractCrudResourceImpl<UsuarioDTO> implements UsuarioResource {

    @Inject
    private UsuarioController controller;

    @Override
    public Response save(final UsuarioCreateDTO entity) {
	final UsuarioDTO data = controller.save(entity);
	return Response.ok(data).build();
    }

    @Override
    protected AbstractCrudController<UsuarioDTO> getController() {
	return controller;
    }

}
