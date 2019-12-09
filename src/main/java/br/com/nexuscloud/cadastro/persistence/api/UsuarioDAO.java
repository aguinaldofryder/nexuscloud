package br.com.nexuscloud.cadastro.persistence.api;

import javax.ejb.Local;

import br.com.nexuscloud.cadastro.orm.Usuario;

@Local
public interface UsuarioDAO extends GenericDAO<Usuario> {

}
