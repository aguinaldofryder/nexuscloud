/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nexuscloud.cadastro.rest.controller;

import br.com.nexuscloud.cadastro.rest.CadastroCliente;
import br.com.nexuscloud.cadastro.rest.controller.exceptions.NonexistentEntityException;
import br.com.nexuscloud.cadastro.rest.controller.exceptions.RollbackFailureException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;

/**
 *
 * @author Bruno
 */
public class CadastroClienteJpaController implements Serializable {

    public CadastroClienteJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CadastroCliente cadastroCliente) throws RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            em.persist(cadastroCliente);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CadastroCliente cadastroCliente) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            cadastroCliente = em.merge(cadastroCliente);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = cadastroCliente.getId();
                if (findCadastroCliente(id) == null) {
                    throw new NonexistentEntityException("The cadastroCliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            CadastroCliente cadastroCliente;
            try {
                cadastroCliente = em.getReference(CadastroCliente.class, id);
                cadastroCliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cadastroCliente with id " + id + " no longer exists.", enfe);
            }
            em.remove(cadastroCliente);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CadastroCliente> findCadastroClienteEntities() {
        return findCadastroClienteEntities(true, -1, -1);
    }

    public List<CadastroCliente> findCadastroClienteEntities(int maxResults, int firstResult) {
        return findCadastroClienteEntities(false, maxResults, firstResult);
    }

    private List<CadastroCliente> findCadastroClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CadastroCliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public CadastroCliente findCadastroCliente(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CadastroCliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getCadastroClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CadastroCliente> rt = cq.from(CadastroCliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
