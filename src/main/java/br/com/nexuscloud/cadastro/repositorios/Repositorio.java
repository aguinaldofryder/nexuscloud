package br.com.nexuscloud.cadastro.repositorios;

import java.lang.reflect.ParameterizedType;
import java.util.List;
 
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public abstract class Repositorio<T> {
 
    protected Class<T> tipo = retornaTipo();
 
    @PersistenceContext(unitName = "cliente-unit")
    protected EntityManager em;
 
    public void adicionar(T entidade) {
        em.persist(entidade);
    }
 
    public void remover(T entidade) {
        em.remove(entidade);
    }
 
    @SuppressWarnings("unchecked")
    public List<T> todos() {
        CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(tipo));
        return (List<T>) em.createQuery(cq).getResultList();
    }
 
    @SuppressWarnings("unchecked")
    public List<T> todosPaginado(int total, int pg) {
        CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(tipo));
 
        Query busca = em.createQuery(cq);
 
        busca.setFirstResult(pg * total);
        busca.setMaxResults(total);
 
        return (List<T>) busca.getResultList();
    }
 
    public T comId(long id) {
        return em.find(tipo, id);
    }
 
    public T atualizar(T entidade) {
        return em.merge(entidade);
    }
 
    public long contaTodos() {
        CriteriaBuilder qb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = qb.createQuery(Long.class);
        cq.select(qb.count(cq.from(tipo)));
        return em.createQuery(cq).getSingleResult();
    }
 
    @SuppressWarnings({ "unchecked" })
    private Class<T> retornaTipo() {
        Class<?> clazz = this.getClass();
 
        while (!clazz.getSuperclass().equals(Repositorio.class)) {
            clazz = clazz.getSuperclass();
        }
 
        ParameterizedType tipoGenerico = (ParameterizedType) clazz.getGenericSuperclass();
        return (Class<T>) tipoGenerico.getActualTypeArguments()[0];
    }
}