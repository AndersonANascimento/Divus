/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package com.aj3.aj3lab03_02.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.aj3.aj3lab03_02.beans.Cliente;
import com.aj3.aj3lab03_02.exception.GlobalcodeException;
import com.aj3.aj3lab03_02.util.ConnectionManager;

public class ClientesDAOImpl implements IClientesDAO {

	private final static String SALVAR_CLIENTE = "INSERT INTO clientes (nome,cpf,telefone) VALUES ('?','?','?')";
	private final static String CREATE_TABLE = "CREATE TABLE  IF NOT EXISTS  clientes (id int(3) NOT NULL AUTO_INCREMENT   PRIMARY KEY, nome VARCHAR(20) NOT NULL, cpf varchar(20) NOT NULL, telefone varchar(20) NOT NULL)";
	private final static String DELETE_CLIENTE = "DELETE FROM clientes WHERE cpf = '";
	private final static String GET_ALL_CLIENTES = "SELECT * FROM clientes";
	private final static String GET_CLIENTE_BY_CPF = "SELECT * FROM clientes WHERE cpf = ?";

	public void createTable() throws GlobalcodeException {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = ConnectionManager.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(CREATE_TABLE);
		} catch (SQLException e) {
			throw new GlobalcodeException(
					"Erro ao criar a tabela de clientes : " + CREATE_TABLE, e);
		} finally {
			ConnectionManager.closeAll(conn, stmt);
		}
	}

	/*
	 * @see
	 * br.com.globalcode.aj3.dao.ClientesDAO#excluir(br.com.globalcode.beans.Cliente)
	 */
	public void excluir(String cpf) throws GlobalcodeException {
		/* Faca a exclusao de um cliente do banco de dados usando o seu cpf
		 A instrucao SQL esta na constante DELETE_CLIENTE no inicio desta classe.
		 */

		// Criar uma variavel para a Connection
		Connection conn = null;
		// Criar uma variavel para o Statement
		Statement stmt = null;
		try {
			// Abrir a conexao
			conn = ConnectionManager.getConnection();
			// Criar o Statement
			stmt = conn.createStatement();
			// Executar a instrucao de delete recuperando o numero de linhas alteradas (executeUpdate)
			int ct = stmt.executeUpdate(DELETE_CLIENTE + cpf + "'");
			// Imprimir o numero de linhas alteradas
			System.out.println("" + ct + " registro(s) deletados!");
			// Fechar a Connection e o Statement
			ConnectionManager.closeAll(conn, stmt);
		} catch (Exception e) {
			throw new GlobalcodeException("Erro ao realizar exclusão : " + DELETE_CLIENTE + cpf + "'", e);
		}
	}

	/*
	 * @see
	 * br.com.globalcode.aj3.dao.ClientesDAO#salvar(br.com.globalcode.beans.
	 * Cliente)
	 */
	public void salvar(Cliente cliente) throws GlobalcodeException{
		Connection conn = null;
		Statement stmt = null;
		String sql = SALVAR_CLIENTE;
		sql = sql.replaceFirst("\\?", cliente.getNome());
		sql = sql.replaceFirst("\\?", cliente.getCpf());
		sql = sql.replaceFirst("\\?", cliente.getTelefone());

		try {
			conn = ConnectionManager.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			throw new GlobalcodeException(
					"Erro ao criar a tabela de clientes : " + sql, e);
		} finally {
			ConnectionManager.closeAll(conn, stmt);
		}
	}

	/*
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getAllClientes()
	 */
	public List<Cliente> getAllClientes() throws GlobalcodeException{
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getClienteByID(int)
	 */
	public Cliente getClienteByCPF(String cpf) throws GlobalcodeException{
		return null;
	}
}
