package br.divus.aj3.cap3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexaoJDBC {
    private static final String NOME_BANCO = "cambio_service";
    private static final String STR_CON = "jdbc:mysql://127.0.0.1:3306/" + NOME_BANCO;
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
            System.out.println("Conectado!");
            conn.close();
        } catch (SQLException e) {
            System.err.println("Erro ao obter a conexão!");
            e.printStackTrace();
        }
    }
}
