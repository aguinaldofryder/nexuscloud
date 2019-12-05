package br.com.nexuscloud.cadastro.rest;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.arjuna.ats.internal.arjuna.recovery.Connection;

public class Conexao {
	
	public Conexao() throws SQLException {
		createConnection();
	}
	public static Connection createConnection() throws SQLException {
		String url = "jdbc:postgresql://localhost/postgres";
		Properties props = new Properties();
		props.setProperty("user","postgres");
		props.setProperty("password","ifpr");
		Connection conn = (Connection) DriverManager.getConnection(url, props);




		return conn;
	}
}
