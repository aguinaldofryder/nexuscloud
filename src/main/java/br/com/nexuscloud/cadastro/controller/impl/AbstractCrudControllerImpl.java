package br.com.nexuscloud.cadastro.controller.impl;

import java.util.List;

import br.com.nexuscloud.cadastro.controller.api.AbstractCrudController;
import br.com.nexuscloud.cadastro.converter.AbstractConverter;
import br.com.nexuscloud.cadastro.persistence.api.GenericDAO;

public abstract class AbstractCrudControllerImpl<O, D> implements AbstractCrudController<D> {

    @Override
    public void delete(final Object id) {
	getDao().delete(id);

    }

    @Override
    public List<D> findAll() {
	final List<O> ormList = getDao().findAll();
	return getConverter().ormListToDtoList(ormList);
    }

    @Override
    public D findById(final Object id) {
	return getConverter().ormToDto(getDao().findById(id));
    }

    @Override
    public D save(final D entity) {
	final O orm = getConverter().dtoToOrm(entity);
	return getConverter().ormToDto(getDao().save(orm));
    }

    @Override
    public D update(final D entity) {
	final O orm = getConverter().dtoToOrm(entity);
	return getConverter().ormToDto(getDao().update(orm));
    }

    protected abstract AbstractConverter<O, D> getConverter();

    protected abstract GenericDAO<O> getDao();

}
