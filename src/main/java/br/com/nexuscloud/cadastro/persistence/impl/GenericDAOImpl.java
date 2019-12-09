package br.com.nexuscloud.cadastro.persistence.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import br.com.nexuscloud.cadastro.persistence.api.GenericDAO;

@Transactional
public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void delete(final Object id) {
	entityManager.remove(entityManager.getReference(getEntityClass(), id));
    }

    @Override
    public List<T> findAll() {
	final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
	final CriteriaQuery<T> query = builder.createQuery(getEntityClass());
	query.from(getEntityClass());

	return entityManager.createQuery(query).getResultList();
    }

    @Override
    public T findById(final Object id) {
	return entityManager.find(getEntityClass(), id);
    }

    @Override
    public T save(final T entity) {
	entityManager.persist(entity);
	return entity;
    }

    @Override
    public T update(final T entity) {
	return entityManager.merge(entity);
    }

    protected abstract Class<T> getEntityClass();

}
