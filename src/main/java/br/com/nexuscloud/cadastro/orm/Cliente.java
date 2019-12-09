package br.com.nexuscloud.cadastro.orm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.com.nexuscloud.cadastro.enumeration.TipoPessoa;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;

    /**
     * Nome
     */
    @NotNull(message = "O nome do cliente não pode ser nulo")
    @Size(max = 100, message = "O nome do cliente não pode ter mais do que 100 caracteres")
    @Column(name = "nm_cliente", length = 100, nullable = false)
    private String nmCliente;

    /**
     * Tipo de pessoa 0 - Física 1 - Jurídica
     */
    @NotNull(message = "O tipo de pessoa não pode ser nulo")
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "tp_pessoa")
    private TipoPessoa tpPesssoa;

    /**
     * Data do cadastro
     */
    @NotNull(message = "A data de cadastro não pode ser nula")
    @Column(name = "dt_cadastro")
    private Date dtCadastro;

    /**
     * Número do documento
     */
    @NotNull(message = "O número do documento não pode ser nulo")
    @Size(max = 14, message = "O número do documento não pode ter mais do que 14 caracteres")
    @Column(name = "ds_documento")
    private String dsDocumento;

    /**
     * Lista de endereços
     */
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "cliente", orphanRemoval = true)
    private List<Endereco> enderecoList;

    public static long getSerialversionuid() {
	return serialVersionUID;
    }

    public String getDsDocumento() {
	return dsDocumento;
    }

    public Date getDtCadastro() {
	return dtCadastro;
    }

    public List<Endereco> getEnderecoList() {
	return enderecoList;
    }

    public Integer getIdCliente() {
	return idCliente;
    }

    public String getNmCliente() {
	return nmCliente;
    }

    public TipoPessoa getTpPesssoa() {
	return tpPesssoa;
    }

    public void setDsDocumento(final String dsDocumento) {
	this.dsDocumento = dsDocumento;
    }

    public void setDtCadastro(final Date dtCadastro) {
	this.dtCadastro = dtCadastro;
    }

    public void setEnderecoList(final List<Endereco> enderecoList) {

	this.enderecoList = enderecoList != null ? enderecoList : new ArrayList<>();
    }

    public void setIdCliente(final Integer idCliente) {
	this.idCliente = idCliente;
    }

    public void setNmCliente(final String nmCliente) {
	this.nmCliente = nmCliente;
    }

    public void setTpPesssoa(final TipoPessoa tpPesssoa) {
	this.tpPesssoa = tpPesssoa;
    }

}
