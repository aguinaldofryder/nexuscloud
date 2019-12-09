package br.com.nexuscloud.cadastro.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

import br.com.nexuscloud.cadastro.enumeration.TipoEndereco;

@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Integer idEndereco;

    /**
     * Cliente
     */
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;

    /**
     * CEP
     */
    @NotNull
    @Size(min = 8, max = 8, message = "O CEP precisa ter 8 caracteres")
    @Column(name = "ds_cep", length = 8, nullable = false)
    private String dsCep;

    /**
     * Nome da cidade
     */
    @NotNull
    @Size(max = 60, message = "O nome da cidade não pode ter mais do que 60 caracteres")
    @Column(name = "nm_cidade", length = 60, nullable = false)
    private String nmCidade;

    /**
     * Nome do logradouro
     */
    @NotNull
    @Size(max = 60, message = "O nome do logradouro não pode ter mais do que 60 caracteres")
    @Column(name = "nm_logradouro", length = 60, nullable = false)
    private String nmLogradouro;

    /**
     * Número
     */
    @NotNull
    @Size(max = 10, message = "O número não pode ter mais do que 10 caracteres")
    @Column(name = "ds_numero", length = 10, nullable = false)
    private String dsNumero;

    /**
     * Nome do bairro
     */
    @NotNull
    @Size(max = 30, message = "O nome do bairro não pode ter mais do que 30 caracteres")
    @Column(name = "nm_bairro", length = 30, nullable = false)
    private String nmBairro;

    /**
     * Complemento
     */
    @Size(max = 100, message = "O complemento não pode ter mais do que 100 caracteres")
    @Column(name = "ds_complemento", length = 60, nullable = true)
    private String dsComplemento;

    /**
     * Tipo do endereço
     */
    @NotNull
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "tp_endereco", nullable = false)
    private TipoEndereco tpEndereco;

    public Cliente getCliente() {
	return cliente;
    }

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

    public TipoEndereco getTpEndereco() {
	return tpEndereco;
    }

    public void setCliente(final Cliente cliente) {
	this.cliente = cliente;
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

    public void setTpEndereco(final TipoEndereco tpEndereco) {
	this.tpEndereco = tpEndereco;
    }

}
