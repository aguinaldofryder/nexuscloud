package DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Pessoa;
import Model.PessoaFisica;
import Model.PessoaJuridica;

public class PessoaDAO {

	private ConexaoBanco conDB;
	private Connection con;
	private Statement stt;
	
	public PessoaDAO() {
		// instancia a classe responsavel pela conexao com o banco;
		this.conDB = new ConexaoBanco();
		
		// pega a conexao com o banco de dados
		this.con = conDB.getConnection();
		
		// cria a statement para executar a query
		try {
			this.stt = (Statement) con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Pessoa> buscarTodos() {
		return new ArrayList<>();
	}
	
	public void insertPessoa(PessoaFisica pessoaFisica) {
		
	}
	
	public void insertPessoa(PessoaJuridica pessoaJuridica) {
		
	}
}
