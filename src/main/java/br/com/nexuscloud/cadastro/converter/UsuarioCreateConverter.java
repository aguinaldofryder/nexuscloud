package br.com.nexuscloud.cadastro.converter;

import javax.inject.Inject;

import br.com.nexuscloud.cadastro.dto.UsuarioCreateDTO;
import br.com.nexuscloud.cadastro.orm.Usuario;

public class UsuarioCreateConverter extends AbstractConverter<Usuario, UsuarioCreateDTO> {

    @Inject
    private UsuarioConverter usuarioConverter;

    @Override
    protected Usuario dtoToOrm(final UsuarioCreateDTO dto, final Usuario orm) {
	usuarioConverter.dtoToOrm(dto, orm);
	orm.setDsLogin(dto.getDsLogin());
	orm.setDsSenha(dto.getDsSenha());
	return orm;
    }

    @Override
    protected UsuarioCreateDTO ormToDto(final Usuario orm, final UsuarioCreateDTO dto) {
	usuarioConverter.ormToDto(orm, dto);
	dto.setDsLogin(orm.getDsLogin());
	dto.setDsSenha(orm.getDsSenha());
	return dto;
    }

}
