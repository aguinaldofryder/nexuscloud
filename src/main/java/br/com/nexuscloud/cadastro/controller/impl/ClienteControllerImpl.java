package br.com.nexuscloud.cadastro.controller.impl;

import java.util.Date;
import java.util.Objects;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.ValidationException;

import br.com.nexuscloud.cadastro.controller.api.ClienteController;
import br.com.nexuscloud.cadastro.converter.AbstractConverter;
import br.com.nexuscloud.cadastro.converter.ClienteConverter;
import br.com.nexuscloud.cadastro.dto.ClienteDTO;
import br.com.nexuscloud.cadastro.dto.EnderecoDTO;
import br.com.nexuscloud.cadastro.enumeration.TipoEndereco;
import br.com.nexuscloud.cadastro.orm.Cliente;
import br.com.nexuscloud.cadastro.persistence.api.ClienteDAO;
import br.com.nexuscloud.cadastro.persistence.api.GenericDAO;

@Stateless
public class ClienteControllerImpl extends AbstractCrudControllerImpl<Cliente, ClienteDTO> implements ClienteController {

    @Inject
    private ClienteConverter converter;

    @Inject
    private ClienteDAO dao;

    @Override
    public ClienteDTO save(final ClienteDTO entity) {
	validate(entity);
	entity.setDtCadastro(new Date());
	return super.save(entity);
    }

    @Override
    public ClienteDTO update(final ClienteDTO entity) {
	validate(entity);
	return super.update(entity);
    }

    @Override
    protected AbstractConverter<Cliente, ClienteDTO> getConverter() {
	return converter;
    }

    @Override
    protected GenericDAO<Cliente> getDao() {
	return dao;
    }

    /**
     * Valida o registro
     * 
     * @param entity
     */
    private void validate(final ClienteDTO entity) {
	final long nrEnderecoPrincipal = entity.getEnderecoList()
	        .stream()
	        .map(EnderecoDTO::getTpEndereco)
	        .filter(Objects::nonNull)
	        .filter(item -> item.equals(TipoEndereco.PRINCIPAL.ordinal()))
	        .count();

	if (nrEnderecoPrincipal == 0) {
	    throw new ValidationException("É obrigatório ter um endereço principal");
	} else if (nrEnderecoPrincipal > 1) {
	    throw new ValidationException("Apenas um endereço pode ser definido como principal");
	}
    }
}
