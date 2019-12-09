package br.com.nexuscloud.cadastro.persistence.api;

import java.util.List;

public interface GenericDAO<T> {

    /**
     * Exclui um objeto pelo ID
     * 
     * @param id
     */
    void delete(Object id);

    /**
     * Busca todos os registro
     * 
     * @return
     */
    List<T> findAll();

    /**
     * Busca um registro pelo ID
     * 
     * @param id
     * @return
     */
    T findById(Object id);

    /**
     * Salva um objeto no banco de dados
     * 
     * @param entity
     * @return
     */
    T save(T entity);

    /**
     * Atualiza um objeto no banco de dados
     * 
     * @param entity
     * @return
     */
    T update(T entity);
}
