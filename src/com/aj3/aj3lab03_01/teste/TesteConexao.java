/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package com.aj3.aj3lab03_01.teste;

import java.sql.Connection;

import com.aj3.aj3lab03_01.exception.GlobalcodeException;
import com.aj3.aj3lab03_01.util.ConnectionManager;

public class TesteConexao {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = ConnectionManager.getConnection();
		} catch (GlobalcodeException ge) {
			System.out.println("---> " + ge.getMessage());
			System.out.println("---> Detalhamento do erro: ");
			ge.printStackTrace();
		} finally {
			ConnectionManager.closeAll(conn);
		}
	}

}
