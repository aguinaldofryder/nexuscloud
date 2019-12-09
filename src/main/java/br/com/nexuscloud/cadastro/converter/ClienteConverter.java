package br.com.nexuscloud.cadastro.converter;

import javax.inject.Inject;

import br.com.nexuscloud.cadastro.dto.ClienteDTO;
import br.com.nexuscloud.cadastro.enumeration.TipoPessoa;
import br.com.nexuscloud.cadastro.orm.Cliente;

public class ClienteConverter extends AbstractConverter<Cliente, ClienteDTO> {

    @Inject
    private EnderecoConverter enderecoConverter;

    @Override
    public Cliente dtoToOrm(final ClienteDTO dto, final Cliente orm) {
	orm.setIdCliente(dto.getIdCliente());
	orm.setNmCliente(dto.getNmCliente());
	orm.setDtCadastro(dto.getDtCadastro());
	orm.setTpPesssoa(TipoPessoa.valueOf(dto.getTpPessoa()));
	orm.setDsDocumento(dto.getDsDocumento());
	orm.setEnderecoList(enderecoConverter.dtoListToOrmList(dto.getEnderecoList()));
	return orm;
    }

    @Override
    public ClienteDTO ormToDto(final Cliente orm, final ClienteDTO dto) {
	dto.setIdCliente(orm.getIdCliente());
	dto.setNmCliente(orm.getNmCliente());
	dto.setDtCadastro(orm.getDtCadastro());
	dto.setTpPessoa(orm.getTpPesssoa().ordinal());
	dto.setDsDocumento(orm.getDsDocumento());
	dto.setEnderecoList(enderecoConverter.ormListToDtoList(orm.getEnderecoList()));
	return dto;
    }

}
