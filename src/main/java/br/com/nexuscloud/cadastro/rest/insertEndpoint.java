package br.com.nexuscloud.cadastro.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sun.mail.iap.Response;

import DAO.PessoaDAO;
import Model.Endereco;
import Model.PessoaFisica;
import Model.PessoaJuridica;



@Path("/insert")
public class insertEndpoint {

	@POST
	@Produces("text/plain")
	public Response insert(String parametros) {
		
		//A variavel "parametros" recebe os dados fornecidos e abaixo a mesma sera processada para adicionar os dados no objeto
		
		// 0 = Nome
		// 1 = TipoPessoa
		// 2 = CPF/CNPJ
		// 3 = CEP
		// 4 = Cidade
		// 5 = Logradouro
		// 6 = Numero
		// 7 = Bairro
		// 8 = Complemento
		
		String[] dados = parametros.split(";");
		

		// Cria uma lista com os enderecos 
		List<Endereco> enderecos = new ArrayList<>();
		enderecos.add(new Endereco(dados[3], dados[4], dados[5], dados[6], dados[7], dados[8]));
		
		if(dados[1].contentEquals("Fisica")) {
			PessoaFisica pessoaFisica = new PessoaFisica(dados[0], dados[2]);
			
			pessoaFisica.setEnderecos(enderecos);
			
			PessoaDAO pd = new PessoaDAO();
			pd.insertPessoa(pessoaFisica);
		}else if(dados[1].contentEquals("Juridica")) {
			PessoaJuridica pessoaJuridica = new PessoaJuridica(dados[1]);
			
			pessoaJuridica.setEnderecos(enderecos);
			
			PessoaDAO pd = new PessoaDAO();
			pd.insertPessoa(pessoaJuridica);
		}else {
			return Response.byeResponse(new Exception("Tipo Pessoa informado invalido!"));
		}
		
		
		
		return new Response("Sucess");
		
	} 
	
	
}
