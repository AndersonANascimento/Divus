package br.divus.aj3.cap3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
    private static final String NOME_BANCO = "aj";
    private static final String STR_CON = "jdbc:mysql://127.0.0.1:3306/" + NOME_BANCO;
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static Connection getConexao() throws GlobalcodeException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
            System.out.println("Conectado!");
            // conn.close();
        } catch (SQLException e) {
            throw new GlobalcodeException("Erro ao obter a conexão!", e);
        }
        return conn;  
    }

    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection conn, Statement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionManager.close(conn);
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionManager.close(conn, stmt);
    }
}
