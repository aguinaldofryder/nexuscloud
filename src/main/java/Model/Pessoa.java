package Model;

import java.util.List;
import java.util.Date;

public class Pessoa {
	
	private String nome;
	private Date dataCadastro;
	private String tipoPessoa;
	private List<Endereco> enderecos;
		
	public Pessoa(String nome, String tipoPessoa) {
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
		this.dataCadastro = new Date();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
}
