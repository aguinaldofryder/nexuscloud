package br.com.nexuscloud.cadastro.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import br.com.nexuscloud.cadastro.model.Pessoa;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/hello")
public class HelloWorldEndpoint extends Pessoa{
    @GET
    @Produces("text/plain")
    public Response doGet() {
    	
        return Response.ok("Hello from Thorntail!").build();
    }
}
