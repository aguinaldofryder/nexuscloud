package br.com.nexuscloud.cadastro.dto;

/**
 * DTO utilizado na criação de usuários
 * 
 * @author aguinaldo
 *
 */
public class UsuarioCreateDTO extends UsuarioDTO {

    /**
     * Login
     */
    private String dsLogin;

    /**
     * Senha
     */
    private String dsSenha;

    public String getDsLogin() {
	return dsLogin;
    }

    public String getDsSenha() {
	return dsSenha;
    }

    public void setDsLogin(final String dsLogin) {
	this.dsLogin = dsLogin;
    }

    public void setDsSenha(final String dsSenha) {
	this.dsSenha = dsSenha;
    }
}
