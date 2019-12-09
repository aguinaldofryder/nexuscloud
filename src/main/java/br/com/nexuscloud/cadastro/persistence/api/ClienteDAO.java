package br.com.nexuscloud.cadastro.persistence.api;

import javax.ejb.Local;

import br.com.nexuscloud.cadastro.orm.Cliente;

@Local
public interface ClienteDAO extends GenericDAO<Cliente> {

}
