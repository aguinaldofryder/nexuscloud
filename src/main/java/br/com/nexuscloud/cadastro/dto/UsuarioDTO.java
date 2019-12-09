package br.com.nexuscloud.cadastro.dto;

/**
 * DTO base utilizado para listagem de usuário
 * 
 * @author aguinaldo
 *
 */
public class UsuarioDTO {
    /**
     * ID
     */
    private Integer idUsuario;

    /**
     * Nome
     */
    private String nmUsuario;

    public Integer getIdUsuario() {
	return idUsuario;
    }

    public String getNmUsuario() {
	return nmUsuario;
    }

    public void setIdUsuario(final Integer idUsuario) {
	this.idUsuario = idUsuario;
    }

    public void setNmUsuario(final String nmUsuario) {
	this.nmUsuario = nmUsuario;
    }

}
