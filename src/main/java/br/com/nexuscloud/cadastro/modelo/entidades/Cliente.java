package br.com.nexuscloud.cadastro.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	private String numero;
	private String complemento;

    @Column(nullable = false)
    private String nome;
	private List<String> tipoCliente;
	private Date dataCadastro;
	private String cnpjOuCpf;
	private String endereco;
	private String CEP;
	private String cidade;
	private String logradouro;
	private String bairro;
	private String tipoEndereco;
	
    @Deprecated
    public Cliente() { }
 
    public Cliente(Long id, String nome, List<String> tipoCliente, Date dataCadastro, String cnpjOuCpf, String endereco,
    		String CEP, String cidade, String logradouro, String bairro, String tipoEndereco, String numero, String complemento) {
        this.setId(id);
        this.setNome(nome);
        this.setTipoCliente(tipoCliente);
        this.setData(dataCadastro);
        this.setCnpjOuCpf(cnpjOuCpf);
        this.setEndereco(endereco);
        this.setCEP(CEP);
        this.setCidade(cidade);
        this.setLogradouro(logradouro);
        this.setBairro(bairro);
        this.setTipoEndereco(tipoEndereco);
        this.setNumero(numero);
        this.setComplemento(complemento);
    }

	private void setData(Date dataCadastro2) {
		// TODO Auto-generated method stub
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(List<String> tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getCnpjOuCpf() {
		return cnpjOuCpf;
	}

	public void setCnpjOuCpf(String cnpjOuCpf) {
		this.cnpjOuCpf = cnpjOuCpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
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

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

        
}