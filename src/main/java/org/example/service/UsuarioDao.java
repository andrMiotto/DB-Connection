package org.example.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDao {

    public void inserirUser(String nome, String email) {
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.executeUpdate();

            System.out.println("Usuário inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void inserirAluno(String nomeAluno, String matricula, String curso) {
        String sql = "INSERT INTO alunos (nomeAluno, matricula, curso) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nomeAluno);
            stmt.setString(2, matricula);
            stmt.setString(3, curso);
            stmt.executeUpdate();

            System.out.println("Aluno(a) inserido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void inserirProduto(String nomeProduto, double precoProduto, int quantidadeProduto) {
        String sql = "INSERT INTO produtos (nomeProduto, precoProduto, quantidadeProduto) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nomeProduto);
            stmt.setDouble(2, precoProduto);
            stmt.setInt(3, quantidadeProduto);
            stmt.executeUpdate();

            System.out.println("Produto inserido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void inserirPedido(String nomeCliente, Date data_pedido, double total) {
        String sql = "INSERT INTO pedidos (cliente, data_pedido, total) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nomeCliente);
            stmt.setDate(2, data_pedido);
            stmt.setDouble(3, total);
            stmt.executeUpdate();

            System.out.println("Pedido inserido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}


