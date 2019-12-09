package br.com.nexuscloud.cadastro.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    /**
     * Nome
     */
    @Column(name = "nm_usuario")
    private String nmUsuario;

    /**
     * Login
     */
    @Column(name = "ds_login")
    private String dsLogin;

    /**
     * Senha
     */
    @Column(name = "ds_senha")
    private String dsSenha;

    public String getDsLogin() {
	return dsLogin;
    }

    public String getDsSenha() {
	return dsSenha;
    }

    public Integer getIdUsuario() {
	return idUsuario;
    }

    public String getNmUsuario() {
	return nmUsuario;
    }

    public void setDsLogin(final String dsLogin) {
	this.dsLogin = dsLogin;
    }

    public void setDsSenha(final String dsSenha) {
	this.dsSenha = dsSenha;
    }

    public void setIdUsuario(final Integer idUsuario) {
	this.idUsuario = idUsuario;
    }

    public void setNmUsuario(final String nmUsuario) {
	this.nmUsuario = nmUsuario;
    }

}
