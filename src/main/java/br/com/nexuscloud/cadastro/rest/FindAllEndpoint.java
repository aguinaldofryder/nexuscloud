package br.com.nexuscloud.cadastro.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sun.mail.iap.Response;

import DAO.PessoaDAO;
import Model.Pessoa;

@Path("/findAll")
public class FindAllEndpoint {
	
	
	@GET
	@Produces("text/plain")
	public Response findAll() {
		
		PessoaDAO pd = new PessoaDAO();
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas = pd.buscarTodos();
		
		return new Response("ok");
		
	} 
	
	
}
