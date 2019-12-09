package br.com.nexuscloud.cadastro.resource.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface AbstractCrudResouce<D> {

    /**
     * Exclui um registro pelo ID
     * 
     * @param id
     */
    @DELETE
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response delete(@PathParam("id") Integer id);

    /**
     * Busca todos os registros
     * 
     * @return
     */
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response findAll();

    /**
     * Busca um registro pelo ID
     * 
     * @param id
     * @return
     */
    @GET
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response findById(@PathParam("id") Integer id);

    /**
     * Salva um novo registro
     * 
     * @param entity
     * @return
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response save(D entity);

    /**
     * Atualiza um registro existente
     * 
     * @param entity
     * @return
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response update(D entity);

}
