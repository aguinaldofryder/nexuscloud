package br.com.nexuscloud.cadastro.dto;

public class EnderecoDTO {
    /**
     * ID
     */
    private Integer idEndereco;

    /**
     * CEP
     */
    private String dsCep;

    /**
     * Nome da cidade
     */
    private String nmCidade;

    /**
     * Nome do logradouro
     */
    private String nmLogradouro;

    /**
     * Número
     */
    private String dsNumero;

    /**
     * Nome do bairro
     */
    private String nmBairro;

    /**
     * Complemento
     */
    private String dsComplemento;

    /**
     * Tipo do endereço
     */
    private Integer tpEndereco;

    public String getDsCep() {
	return dsCep;
    }

    public String getDsComplemento() {
	return dsComplemento;
    }

    public String getDsNumero() {
	return dsNumero;
    }

    public Integer getIdEndereco() {
	return idEndereco;
    }

    public String getNmBairro() {
	return nmBairro;
    }

    public String getNmCidade() {
	return nmCidade;
    }

    public String getNmLogradouro() {
	return nmLogradouro;
    }

    public Integer getTpEndereco() {
	return tpEndereco;
    }

    public void setDsCep(final String dsCep) {
	this.dsCep = dsCep;
    }

    public void setDsComplemento(final String dsComplemento) {
	this.dsComplemento = dsComplemento;
    }

    public void setDsNumero(final String dsNumero) {
	this.dsNumero = dsNumero;
    }

    public void setIdEndereco(final Integer idEndereco) {
	this.idEndereco = idEndereco;
    }

    public void setNmBairro(final String nmBairro) {
	this.nmBairro = nmBairro;
    }

    public void setNmCidade(final String nmCidade) {
	this.nmCidade = nmCidade;
    }

    public void setNmLogradouro(final String nmLogradouro) {
	this.nmLogradouro = nmLogradouro;
    }

    public void setTpEndereco(final Integer tpEndereco) {
	this.tpEndereco = tpEndereco;
    }

}
