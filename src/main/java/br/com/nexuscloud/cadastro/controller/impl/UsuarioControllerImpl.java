package br.com.nexuscloud.cadastro.controller.impl;

import javax.inject.Inject;

import br.com.nexuscloud.cadastro.controller.api.UsuarioController;
import br.com.nexuscloud.cadastro.converter.AbstractConverter;
import br.com.nexuscloud.cadastro.converter.UsuarioConverter;
import br.com.nexuscloud.cadastro.converter.UsuarioCreateConverter;
import br.com.nexuscloud.cadastro.dto.UsuarioCreateDTO;
import br.com.nexuscloud.cadastro.dto.UsuarioDTO;
import br.com.nexuscloud.cadastro.orm.Usuario;
import br.com.nexuscloud.cadastro.persistence.api.GenericDAO;
import br.com.nexuscloud.cadastro.persistence.api.UsuarioDAO;

public class UsuarioControllerImpl extends AbstractCrudControllerImpl<Usuario, UsuarioDTO>
        implements UsuarioController {

    @Inject
    private UsuarioConverter usuarioConverter;

    @Inject
    UsuarioCreateConverter usuarioCreateConverter;

    @Inject
    private UsuarioDAO dao;

    @Override
    public UsuarioDTO save(final UsuarioCreateDTO usuario) {
	final Usuario orm = usuarioCreateConverter.dtoToOrm(usuario);
	return usuarioConverter.ormToDto(dao.save(orm));

    }

    @Override
    protected AbstractConverter<Usuario, UsuarioDTO> getConverter() {
	return usuarioConverter;
    }

    @Override
    protected GenericDAO<Usuario> getDao() {
	return dao;
    }

}
