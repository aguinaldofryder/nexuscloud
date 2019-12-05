package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
* 
* CREATE DATABASE cadastro; 
*   
* CREATE TABLE IF NOT EXISTS pessoa (
*	id_pessoa int constraint pk_pessoa_id primary key,
*	nome varchar(100) not null,
*	tipo_pessoa varchar(10) not null,
*	data_cadastro date not null,
*	cpf_cnpj varchar(14) not null
*	)
*
*	CREATE TABLE IF NOT EXISTS endereco(
*	cep varchar(8) not null,
*	cidade varchar(60) not null,
*	logradouro varchar(60) not null,
*	numero varchar(10),
*	bairro varchar(30) not null,
*	complemento varchar(100) not null,
*	tipo_endereco varchar(50) not null
*	)
*/

public class ConexaoBanco{

	/**
	 * Inicia a conexao com o banco de dados
	 * @return
	 */
	public Connection getConnection() {
		String driver = "org.postgresql.Driver";
        String user   = "postgres";
        String senha = "mn089190";
        String url      = "jdbc:postgresql://localhost:5432/cadastro";


        Connection con = null;
        try{
            Class.forName(driver);

            con = (Connection) DriverManager.getConnection(url, user, senha);

        }catch (ClassNotFoundException ex){
            System.err.print(ex.getMessage());
        }catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        
        return con;
	}
	
	/**
	 * Encerra a conexao com o banco de dados
	 * @param con
	 */
	public void closeConnection(Connection  con) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}