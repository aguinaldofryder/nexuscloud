package br.com.nexuscloud.cadastro.persistence.impl;

import javax.ejb.Stateless;

import br.com.nexuscloud.cadastro.orm.Cliente;
import br.com.nexuscloud.cadastro.persistence.api.ClienteDAO;

@Stateless
public class ClienteDAOImpl extends GenericDAOImpl<Cliente> implements ClienteDAO {

    @Override
    public Cliente save(final Cliente entity) {
	adjustRelationship(entity);
	return super.save(entity);
    }

    @Override
    public Cliente update(final Cliente entity) {
	adjustRelationship(entity);
	return super.update(entity);
    }

    @Override
    protected Class<Cliente> getEntityClass() {
	return Cliente.class;
    }

    /**
     * Ajusta os relacionamentos da entidade
     * 
     * @param cliente
     */
    private void adjustRelationship(final Cliente cliente) {
	cliente.getEnderecoList().stream().forEach(endereco -> endereco.setCliente(cliente));

    }

}
