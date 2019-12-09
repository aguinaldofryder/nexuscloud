package br.com.nexuscloud.cadastro.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClienteDTO {
    /**
     * ID
     */
    private Integer idCliente;

    /**
     * Nome
     */
    private String nmCliente;

    /**
     * Tipo de pessoa 0 - Física 1 - Jurídica
     */
    private Integer tpPessoa;

    /**
     * Data do cadastro
     */
    private Date dtCadastro;

    /**
     * CNPJ
     */
    private String dsDocumento;

    /**
     * Lista de endereços
     */
    private List<EnderecoDTO> enderecoList = new ArrayList<>();

    public String getDsDocumento() {
	return dsDocumento;
    }

    public Date getDtCadastro() {
	return dtCadastro;
    }

    public List<EnderecoDTO> getEnderecoList() {
	return enderecoList;
    }

    public Integer getIdCliente() {
	return idCliente;
    }

    public String getNmCliente() {
	return nmCliente;
    }

    public Integer getTpPessoa() {
	return tpPessoa;
    }

    public void setDsDocumento(final String dsDocumento) {
	this.dsDocumento = dsDocumento;
    }

    public void setDtCadastro(final Date dtCadastro) {
	this.dtCadastro = dtCadastro;
    }

    public void setEnderecoList(final List<EnderecoDTO> enderecoList) {
	this.enderecoList = enderecoList;
    }

    public void setIdCliente(final Integer idCliente) {
	this.idCliente = idCliente;
    }

    public void setNmCliente(final String nmCliente) {
	this.nmCliente = nmCliente;
    }

    public void setTpPessoa(final Integer tpPessoa) {
	this.tpPessoa = tpPessoa;
    }

}
