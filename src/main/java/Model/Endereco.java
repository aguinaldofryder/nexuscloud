package Model;

public class Endereco {
	
	private String cep;
	private String cidade;
	private String logradouro;
	private String numero;
	private String bairro;
	private String complemento;
	
	
	public Endereco() {
		
	}

	public Endereco(String cep, String cidade, String logradouro, String numero, String bairro, String complemento) {
		this.cep = cep;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
