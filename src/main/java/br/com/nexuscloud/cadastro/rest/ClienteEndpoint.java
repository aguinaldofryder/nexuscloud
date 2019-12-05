package br.com.nexuscloud.cadastro.rest;

import java.net.URI;

import javax.ejb.Stateless;
import javax.inject.Inject;
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
 
import br.com.nexuscloud.cadastro.modelo.entidades.Cliente;
import br.com.nexuscloud.cadastro.repositorio.implm.Clientes;
 
@Path("/clientes")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClienteEndpoint {
     
    @Inject
    private Clientes clientes;
     
    @POST
    public Response novo(Cliente cliente) {
         
        clientes.adicionar(cliente);
         
        return Response.created(URI.create("/clientes/" + cliente.getId()))
                       .entity(cliente)
                       .build();
    }
     
    @PUT
    public Response atualiza(Cliente cliente) {
        clientes.atualizar(cliente);
        return Response.ok().build();
    }
     
    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
    	clientes.remover(clientes.comId(id));
        return Response.ok().build();
    }
     
    @GET
    public Response todos() {
        return Response.ok(clientes.todos()).build();
    }
 
}