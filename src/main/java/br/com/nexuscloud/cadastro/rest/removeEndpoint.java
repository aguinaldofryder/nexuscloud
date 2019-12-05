package br.com.nexuscloud.cadastro.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sun.mail.iap.Response;

@Path("/remove")
public class removeEndpoint {

	@DELETE
	@Produces("text/plain")
	public Response delete() {
		
		return null;
	}
	
}
