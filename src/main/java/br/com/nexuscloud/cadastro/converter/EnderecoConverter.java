package br.com.nexuscloud.cadastro.converter;

import br.com.nexuscloud.cadastro.dto.EnderecoDTO;
import br.com.nexuscloud.cadastro.enumeration.TipoEndereco;
import br.com.nexuscloud.cadastro.orm.Endereco;

public class EnderecoConverter extends AbstractConverter<Endereco, EnderecoDTO> {

    @Override
    protected Endereco dtoToOrm(final EnderecoDTO dto, final Endereco orm) {
	orm.setIdEndereco(dto.getIdEndereco());
	orm.setDsCep(dto.getDsCep());
	orm.setDsComplemento(dto.getDsComplemento());
	orm.setDsNumero(dto.getDsNumero());
	orm.setNmBairro(dto.getNmBairro());
	orm.setNmCidade(dto.getNmCidade());
	orm.setNmLogradouro(dto.getNmLogradouro());
	orm.setTpEndereco(TipoEndereco.valueOf(dto.getTpEndereco()));
	return orm;
    }

    @Override
    protected EnderecoDTO ormToDto(final Endereco orm, final EnderecoDTO dto) {
	dto.setIdEndereco(orm.getIdEndereco());
	dto.setDsCep(orm.getDsCep());
	dto.setDsComplemento(orm.getDsComplemento());
	dto.setDsNumero(orm.getDsNumero());
	dto.setNmBairro(orm.getNmBairro());
	dto.setNmCidade(orm.getNmCidade());
	dto.setNmLogradouro(orm.getNmLogradouro());
	dto.setTpEndereco(orm.getTpEndereco().ordinal());
	return dto;
    }

}
