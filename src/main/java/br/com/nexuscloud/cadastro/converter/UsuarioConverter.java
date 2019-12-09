package br.com.nexuscloud.cadastro.converter;

import br.com.nexuscloud.cadastro.dto.UsuarioDTO;
import br.com.nexuscloud.cadastro.orm.Usuario;

public class UsuarioConverter extends AbstractConverter<Usuario, UsuarioDTO> {

    @Override
    protected Usuario dtoToOrm(final UsuarioDTO dto, final Usuario orm) {
	orm.setIdUsuario(dto.getIdUsuario());
	orm.setNmUsuario(dto.getNmUsuario());
	return orm;
    }

    @Override
    protected UsuarioDTO ormToDto(final Usuario orm, final UsuarioDTO dto) {
	dto.setIdUsuario(orm.getIdUsuario());
	dto.setNmUsuario(orm.getNmUsuario());
	return dto;
    }

}
