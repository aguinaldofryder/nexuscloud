package br.com.nexuscloud.cadastro.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDAO {
	public void inserirDados(Contato contato) {

	  try {
          Connection conexao = ConnectionFactory.createConnectionToMySQL();

          String sql = "insert into tbNome(nome) values (?,?,?)";
          PreparedStatement insert = conexao.prepareStatement(sql);
          insert.setString( nome.getNome());
          insert.execute();
          conexao.commit();
          conexao.close();

          System.out.println("Inserido com sucesso");

      } catch (SQLException e) {
          e.printStackTrace();
          System.out.println("Erro Ao inserir");
          
      }		
	  try {
          Connection conexao = ConnectionFactory.createConnectionToMySQL();

          String sql = "insert into tbtipoPessoa(fisica, juridica) values (?,?,?)";
          PreparedStatement insert = conexao.prepareStatement(sql);
          insert.setString( tipoPessoa.getFisica());
          insert.setString(tipoPessoa.getJuridica());
          insert.execute();
          conexao.commit();
          conexao.close();

          System.out.println("Inserido com sucesso");

      } catch (SQLException e) {
          e.printStackTrace();
          System.out.println("Erro Ao inserir");
          
          try {
              Connection conexao = ConnectionFactory.createConnectionToMySQL();

              String sql = "insert into tbdataCadastro() values (?,?,?)";
              PreparedStatement insert = conexao.prepareStatement(sql);
              insert.setString( dataCadastro.get());
              insert.execute();
              conexao.commit();
              conexao.close();

              System.out.println("Inserido com sucesso");

          } catch (SQLException e) {
              e.printStackTrace();
              System.out.println("Erro Ao inserir");
	
				
              try {
                  Connection conexao = ConnectionFactory.createConnectionToMySQL();

                  String sql = "insert into tbCPF(cpf) values (?,?,?)";
                  PreparedStatement insert = conexao.prepareStatement(sql);
                  insert.setString( CPF.getcpf());
                  insert.execute();
                  conexao.commit();
                  conexao.close();

                  System.out.println("Inserido com sucesso");

              } catch (SQLException e) {
                  e.printStackTrace();
                  System.out.println("Erro Ao inserir");
				
	}
              try {
                  Connection conexao = ConnectionFactory.createConnectionToMySQL();

                  String sql = "insert into tbCNPJ(cnpj) values (?,?,?)";
                  PreparedStatement insert = conexao.prepareStatement(sql);
                  insert.setString( CNPJ.getcnpj());
                  insert.execute();
                  conexao.commit();
                  conexao.close();

                  System.out.println("Inserido com sucesso");

              } catch (SQLException e) {
                  e.printStackTrace();
                  System.out.println("Erro Ao inserir");
}
              
              try {
                  Connection conexao = ConnectionFactory.createConnectionToMySQL();

                  String sql = "insert into tbCEP(cep) values (?,?,?)";
                  PreparedStatement insert = conexao.prepareStatement(sql);
                  insert.setString( cep.getcep());
                  insert.execute();
                  conexao.commit();
                  conexao.close();

                  System.out.println("Inserido com sucesso");

              } catch (SQLException e) {
                  e.printStackTrace();
                  System.out.println("Erro Ao inserir");
                  
                  
                  try {
                      Connection conexao = ConnectionFactory.createConnectionToMySQL();

                      String sql = "insert into tbNome(nome) values (?,?,?)";
                      PreparedStatement insert = conexao.prepareStatement(sql);
                      insert.setString( nome.getNome());
                      insert.execute();
                      conexao.commit();
                      conexao.close();

                      System.out.println("Inserido com sucesso");

                  } catch (SQLException e) {
                      e.printStackTrace();
                      System.out.println("Erro Ao inserir");
