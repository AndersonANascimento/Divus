package br.divus.aj3.cap3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDB {
    public void createTable() throws GlobalcodeException {
        Connection conn = ConnectionManager.getConexao();
        Statement stmt = null;
        String sql = "CREATE TABLE IF NOT EXISTS aj.produtos";
        sql += " (id int(3) NOT NULL AUTO_INCREMENT,";
        sql += " nome VARCHAR(20) NOT NULL,";
        sql += " preco int(10) NOT NULL, PRIMARY KEY (id))";

        try {
            stmt = conn.createStatement();
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            System.out.println("Tabela de Produtos criada com sucesso!");
        } catch (SQLException e) {
            throw new GlobalcodeException("Erro na criação da tabela Produtos", e);
        } finally {
            ConnectionManager.close(conn, stmt);
        }
    }

    public Produto save(Produto produto) throws GlobalcodeException {
        Statement stmt = null;
        String sql = null;

        if (produto.getId() == 0) {
            sql = "INSERT INTO aj.produtos (nome, preco) ";
            sql += " VALUES('" + produto.getNome() + "', " + produto.getPreco() + ")";
        } else {
            sql = "UPDATE aj.produtos SET nome = '" + produto.getNome() + "',";
            sql += " preco = " + produto.getPreco();
            sql += " WHERE id = " + produto.getId();
        }

        Connection conn = ConnectionManager.getConexao();
        try {
            stmt = conn.createStatement();
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            if (produto.getId() == 0) {
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int id = generatedKeys.getInt(1);
                    produto.setId(id);
                }
            }
            return produto;
        } catch (SQLException e) {
            throw new GlobalcodeException("Erro na execução da query!", e);
        } finally {
            ConnectionManager.close(conn, stmt);
        }
    }

    public Produto getProduto(int id) throws GlobalcodeException {
        String sql = "SELECT * FROM produtos WHERE id = " + id;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Produto produto = null;
        try {
            conn = ConnectionManager.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                String nome = rs.getString("nome");
                int preco = rs.getInt("preco");
                produto = new Produto(id, nome, preco);
            }
            return produto;
        } catch (SQLException e) {
            throw new GlobalcodeException("Erro na execução da query: " + sql, e);
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
    }

    public List<Produto> getAllProdutos() throws GlobalcodeException {
        String sql = "SELECT * FROM produtos";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Produto> produtos = null;
        try {
            conn = ConnectionManager.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            produtos = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int preco = rs.getInt("preco");
                produtos.add(new Produto(id, nome, preco));
            }
            return produtos;
        } catch (SQLException e) {
            throw new GlobalcodeException("Erro na execução da query: " + sql, e);
        } finally {
            ConnectionManager.close(conn, stmt, rs);
        }
    }

    public int delete(int id) throws GlobalcodeException {
        Connection conn = null;
        PreparedStatement stmt = null;
        String sql = "DELETE FROM produtos WHERE id = ?";
        int qtdDelete = 0;
        try {
            conn = ConnectionManager.getConexao();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            qtdDelete = stmt.executeUpdate();
            return qtdDelete;
        } catch (SQLException e) {
            throw new GlobalcodeException("Erro na execução da query: " + sql, e);
        } finally {
            ConnectionManager.close(conn, stmt);
        }
    }
}
