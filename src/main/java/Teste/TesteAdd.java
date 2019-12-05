package Teste;

import br.com.nexuscloud.cadastro.rest.entitie.Cliente;
import br.com.nexuscloud.cadastro.rest.model.modelCliente;

public class TesteAdd {

	public static void main(String[] args) {
		
		modelCliente mc = new modelCliente();
		Cliente cliente = new Cliente();
		
		cliente.setNome("Bruno");
		cliente.setIdade(30);
		
		mc.addCliente(cliente);
	}

}
