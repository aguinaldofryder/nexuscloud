package br.com.nexuscloud.cadastro.rest.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.nexuscloud.cadastro.rest.entitie.Cliente;

public class modelCliente {

	EntityManagerFactory emf;
	EntityManager em;
	
	
	public modelCliente() {
		emf = Persistence.createEntityManagerFactory("nexus");
		em = emf.createEntityManager();
		
	}
	
	public void addCliente(Cliente cliente) {
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
		emf.close();
	}

	public Cliente updateCliente(int id) {
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, id);
		em.getTransaction().commit();
		emf.close();
		return cliente;
	}
	
	public void removeCliente(Cliente cliente) {
		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
		emf.close();
	}
	
	public List<Cliente> listCliente(){
		em.getTransaction().begin();
		Query query = em.createQuery("SELECT cliente FROM Cliente cliente");
		
		@SuppressWarnings("unchecked")
		List<Cliente> clientes = query.getResultList();
		em.getTransaction().commit();
		emf.close();
		
		return clientes;
	}
	
}
