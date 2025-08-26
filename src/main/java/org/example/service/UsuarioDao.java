package org.example.service;

import java.sql.*;
import org.example.model.Usuario;

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

    public void inserirLivro(String tituloLivro, String autorLivro, Date ano_publicacaoLivro) {
        String sql = "INSERT INTO livros (tituloLivro, autorLivro, ano_publicacaoLivro) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, tituloLivro);
            stmt.setString(2, autorLivro);
            stmt.setDate(3, ano_publicacaoLivro);
            stmt.executeUpdate();

            System.out.println("Livro inserido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void inserirFuncionarios(String nomeFuncionario, String cargoFuncionario, double salarioFuncionario) {
        String sql = "INSERT INTO funcionarios (nomeFuncionario, cargoFuncionario, salarioFuncionario) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nomeFuncionario);
            stmt.setString(2, cargoFuncionario);
            stmt.setDouble(3, salarioFuncionario);
            stmt.executeUpdate();

            System.out.println("Funcionario inserido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void atualizarEmail(String nome, String novoEmail) {
        String sql = "UPDATE usuarios SET email = ? WHERE nome = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoEmail);
            stmt.setString(2, nome);
            stmt.executeUpdate();

            System.out.println("Email atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarCurso(String matricula, String novoCurso) {
        String sql = "UPDATE alunos SET novoCurso = ? WHERE matricula = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoCurso);
            stmt.setString(2, matricula);
            stmt.executeUpdate();

            System.out.println("Curso atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarPrecoProduto(String nomeProduto, double novoPreco) {
        String sql = "UPDATE produtos SET novoPreco = ? WHERE nomeProduto = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, novoPreco);
            stmt.setString(2, nomeProduto);
            stmt.executeUpdate();

            System.out.println("Preço atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarValorPedido(int id, double novoValorTotal) {
        String sql = "UPDATE pedidos SET novoValorTotal = ? WHERE id = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, novoValorTotal);
            stmt.setInt(2, id);
            stmt.executeUpdate();

            System.out.println("Valor total atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarAutorLivro(String tituloLivro, String novoAutorLivro) {
        String sql = "UPDATE livros SET novoAutorLivro = ? WHERE tituloLivro = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoAutorLivro);
            stmt.setString(2, tituloLivro);
            stmt.executeUpdate();

            System.out.println("Autor atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarSalarioFuncionario(String nomeFuncionario, double novoSalarioFuncionario) {
        String sql = "UPDATE funcionarios SET novoSalarioFuncionario = ? WHERE nomeFuncionario = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, novoSalarioFuncionario);
            stmt.setString(2, nomeFuncionario);
            stmt.executeUpdate();

            System.out.println("Salario atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //deletar

    public void deletarUsuario(String nome) {
        String sql = "DELETE FROM usuarios WHERE nome = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.executeUpdate();

            System.out.println("Usuário deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarAluno(String matricula) {
        String sql = "DELETE FROM alunos WHERE matricula = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, matricula);
            stmt.executeUpdate();

            System.out.println("Aluno deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarProduto (String nomeProduto) {
        String sql = "DELETE FROM produtos WHERE nomeProduto = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nomeProduto);
            stmt.executeUpdate();

            System.out.println("Produto deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void deletarPedido (int id) {
        String sql = "DELETE FROM pedidos WHERE id = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

            System.out.println("Pedido deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarLivro ( String tituloLivro) {
        String sql = "DELETE FROM livros WHERE tituloLivro = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, tituloLivro);
            stmt.executeUpdate();

            System.out.println("Livro deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarFuncionario (String nomeFuncionario) {
        String sql = "DELETE FROM funcionarios WHERE nomeFuncionario = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nomeFuncionario);
            stmt.executeUpdate();

            System.out.println("Funcionario deletado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarTodosUsuarios() {
        String sql = "SELECT * FROM usuarios";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\nLista de Usuários:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("--------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Usuario listarPorId(int id) {
        String sql = "SELECT id, nome, email FROM usuarios WHERE id = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int newId = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                return new Usuario(newId, nome, email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    public void listarPorEmail() {
        String sql = "SELECT * FROM usuarios WHERE email LIKE '%@email.com';";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\nLista de Usuários:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("--------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    public void contarUsuario() {
        String sql = "SELECT COUNT(*) AS totalUsuarios FROM usuarios";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) {
                int total = rs.getInt("totalUsuarios");
                System.out.println("\nTotal de usuários cadastrados: " + total);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}


