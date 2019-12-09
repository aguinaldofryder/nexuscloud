package br.com.nexuscloud.cadastro.resource.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import br.com.nexuscloud.cadastro.controller.api.AbstractCrudController;
import br.com.nexuscloud.cadastro.resource.api.AbstractCrudResouce;

public abstract class AbstractCrudResourceImpl<D> implements AbstractCrudResouce<D> {

    @Override
    public Response delete(final Integer id) {
	getController().delete(id);
	return Response.ok().build();
    }

    @Override
    public Response findAll() {
	final List<D> data = getController().findAll();
	return Response.ok(data).build();
    }

    @Override
    public Response findById(final Integer id) {
	final D data = getController().findById(id);
	return Response.ok(data).build();
    }

    @Override
    public Response save(final D entity) {
	final D data = getController().save(entity);
	return Response.ok(data).build();
    }

    @Override
    public Response update(final D entity) {
	final D data = getController().update(entity);
	return Response.ok(data).build();
    }

    protected abstract AbstractCrudController<D> getController();

}
