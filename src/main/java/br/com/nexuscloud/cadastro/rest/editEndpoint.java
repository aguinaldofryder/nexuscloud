package br.com.nexuscloud.cadastro.rest;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sun.mail.iap.Response;

@Path("/edit")
public class editEndpoint {

	@PUT
	@Produces("text/plain")
	public Response edit() {
		
		
		return null;
	}
	
}
