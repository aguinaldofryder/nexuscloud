package br.com.nexuscloud.cadastro.persistence.impl;

import javax.ejb.Stateless;

import br.com.nexuscloud.cadastro.orm.Usuario;
import br.com.nexuscloud.cadastro.persistence.api.UsuarioDAO;

@Stateless
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario> implements UsuarioDAO {

    @Override
    protected Class<Usuario> getEntityClass() {
	return Usuario.class;
    }

}
