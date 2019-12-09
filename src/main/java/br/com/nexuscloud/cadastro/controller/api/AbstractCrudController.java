package br.com.nexuscloud.cadastro.controller.api;

import java.util.List;

public interface AbstractCrudController<D> {

    /**
     * Exclui um registro pelo ID
     * 
     * @param id
     */
    void delete(Object id);

    /**
     * Busca todos os registros
     * 
     * @return
     */
    List<D> findAll();

    /**
     * Busca um registro pelo ID
     * 
     * @param id
     * @return
     */
    D findById(Object id);

    /**
     * Salva um novo registro
     * 
     * @param entity
     * @return
     */
    D save(D entity);

    /**
     * Atualiza um registro existente
     * 
     * @param entity
     * @return
     */
    D update(D entity);
}
