package br.com.nexuscloud.cadastro.model;

import java.util.ArrayList;
import java.util.List;
import br.com.nexuscloud.cadastro.model.tiposPessoas;

public class Pessoa {
	public int id;
	public String nome;
	public String cep;
	public String cidade;
	public String logradouro;
	public String numero;
	public String bairro;
	public String complemento;
	private List<tiposPessoas> tiposPessoas = new ArrayList<>();
	
	
	public Pessoa(String nome, String cep, String cidade, String logradouro, String numero, String bairro,
			String complemento, String enderecoTipo, List<tiposPessoas> tiposPessoa) {
		super();
		this.nome = nome;
		this.cep = cep;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.tiposPessoas = tiposPessoa;
	}
	public Pessoa() {

	}
	public String getNome() {
		return nome;
	}
	public String getId() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setId(int id) {
		this.id =id;
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
	public List<tiposPessoas> getTiposPessoa() {
		return tiposPessoas;
	}
	public void setTiposPessoa(List<tiposPessoas> tiposPessoa) {
		this.tiposPessoas = tiposPessoa;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + id;
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((tiposPessoas == null) ? 0 : tiposPessoas.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (id != other.id)
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (tiposPessoas == null) {
			if (other.tiposPessoas != null)
				return false;
		} else if (!tiposPessoas.equals(other.tiposPessoas))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cep=" + cep + ", cidade=" + cidade + ", logradouro="
				+ logradouro + ", numero=" + numero + ", bairro=" + bairro + ", complemento=" + complemento
				+  ", tiposPessoa=" + tiposPessoas + "]";
	}
	

}

