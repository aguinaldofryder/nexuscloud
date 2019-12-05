package br.com.nexuscloud.cadastro.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;


@Path("/hello")
public class HelloWorldEndpoint {
    @GET
    @Produces("text/plain")
    public Response doGet() {
        return Response.ok("Hello from Thorntai333l!").build();
    }
    
    @POST
    @Produces("text/plain")
    @Consumes("application/json")
    public Response doPost() throws SQLException {
    	Conexao conexao = new Conexao();
      return Response.ok("Hello from Thorntail POST!").build();
    }
    
    @PUT
    @Produces("text/plain")
    @Consumes("application/json")
    public Response doPut() {
      return Response.ok("Hello from Thorntail PUT!").build();
    }
    
    @DELETE
    @Produces("text/plain")
    @Consumes("application/json")
    public Response doDelete() {
      return Response.ok("Hello from Thorntail DELETE!").build();
    }
    
}
