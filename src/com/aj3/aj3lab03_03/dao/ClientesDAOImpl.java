/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package com.aj3.aj3lab03_03.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aj3.aj3lab03_03.beans.Cliente;
import com.aj3.aj3lab03_03.exception.GlobalcodeException;
import com.aj3.aj3lab03_03.util.ConnectionManager;

public class ClientesDAOImpl implements IClientesDAO {

	private final static String SALVAR_CLIENTE = "INSERT INTO clientes (nome,cpf,telefone) VALUES (?,?,?)";
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
	 * br.com.globalcode.aj3.dao.ClientesDAO#excluir(br.com.globalcode.beans
	 * .Cliente)
	 */
	public void excluir(String cpf) throws GlobalcodeException {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = ConnectionManager.getConnection();
			stmt = conn.createStatement();
			int numeroLinhas = stmt.executeUpdate(DELETE_CLIENTE + cpf + "'");
			System.out.println("Numero de clientes excluidos: " + numeroLinhas);
		} catch (SQLException e) {
			throw new GlobalcodeException("Erro ao excluir cliente: "
					+ DELETE_CLIENTE + cpf + "'", e);
		} finally {
			ConnectionManager.closeAll(conn, stmt);
		}
	}

	/*
	 * @see
	 * br.com.globalcode.aj3.dao.ClientesDAO#salvar(br.com.globalcode.beans.
	 * Cliente)
	 */
	public void salvar(Cliente cliente) throws GlobalcodeException {
	}

	/*
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getAllClientes()
	 */
	public List<Cliente> getAllClientes() throws GlobalcodeException {
		/* 
		 * Obter todos os clientes do banco de dados usando 
		 * a constante GET_ALL_CLIENTES
		 */

		// Criar uma variavel para a Connection
		Connection conn = null;
		// Criar uma variavel para o Statement
		Statement stmt = null;
		// Criar um ArrayList para armazenar os clientes
		List<Cliente> clientes = new ArrayList<>();
		ResultSet rs = null;
		try {
			// Abrir a conexao
			conn = ConnectionManager.getConnection();
			// Criar o Statement
			stmt = conn.createStatement();
			// Executar a consulta e guardar o resultado em um ResultSet
			rs = stmt.executeQuery(GET_ALL_CLIENTES);
			// Ler o ResultSet:
			while (rs.next()) {
				//	   a) obter dados retornados
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                String cpf = rs.getString("cpf");
				//     b) criar o cliente
				//     c) guardar o cliente na lista
                clientes.add(new Cliente(nome, telefone, cpf, id));
            }
			//retornar a lista com os clientes
		} catch (SQLException e) {
			throw new GlobalcodeException("Erro ao excluir cliente: "
			+ GET_ALL_CLIENTES, e);
		} finally {
			// Fechar a Connection, o Statement e ResultSet
			ConnectionManager.closeAll(conn, stmt, rs);
		}
		return clientes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getClienteByID(int)
	 */
	public Cliente getClienteByCPF(String cpf) throws GlobalcodeException {
		return null;
	}
}
