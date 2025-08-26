package org.example.service;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.example.model.Usuario;
import org.example.View.Menu;

public class GerenciadorDados {
    private Scanner sc;
    private UsuarioDao dao;
    private Menu menu;
    private DateTimeFormatter formatter;

    public GerenciadorDados() {
        sc = new Scanner(System.in);
        dao = new UsuarioDao();
        menu = new Menu();
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    public void executarSistema() {
        int opcaoMenuPrincipal;
        
        do {
            opcaoMenuPrincipal = menu.menuPrincipal();
            
            switch (opcaoMenuPrincipal) {
                case 1:
                    gerenciarCadastros();
                    break;
                case 2:
                    gerenciarAtualizacoes();
                    break;
                case 3:
                    gerenciarExclusoes();
                    break;
                case 4:
                    gerenciarListagens();
                    break;
                case 0:
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    if (opcaoMenuPrincipal != -1) {
                        System.out.println("Opção inválida!");
                    }
                    break;
            }
        } while (opcaoMenuPrincipal != 0);
        
        menu.fecharScanner();
        sc.close();
    }

    private void gerenciarCadastros() {
        int opcao;
        do {
            opcao = menu.menuCadastros();
            
            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    cadastrarAluno();
                    break;
                case 3:
                    cadastrarProduto();
                    break;
                case 4:
                    cadastrarPedido();
                    break;
                case 5:
                    cadastrarLivro();
                    break;
                case 6:
                    cadastrarFuncionario();
                    break;
                case 0:
                    break;
                default:
                    if (opcao != -1) {
                        System.out.println("Opção inválida!");
                    }
                    break;
            }
        } while (opcao != 0);
    }

    private void gerenciarAtualizacoes() {
        int opcao;
        do {
            opcao = menu.menuAtualizacoes();
            
            switch (opcao) {
                case 1:
                    atualizarEmailUsuario();
                    break;
                case 2:
                    atualizarCursoAluno();
                    break;
                case 3:
                    atualizarPrecoProduto();
                    break;
                case 4:
                    atualizarValorPedido();
                    break;
                case 5:
                    atualizarAutorLivro();
                    break;
                case 6:
                    atualizarSalarioFuncionario();
                    break;
                case 0:
                    break;
                default:
                    if (opcao != -1) {
                        System.out.println("Opção inválida!");
                    }
                    break;
            }
        } while (opcao != 0);
    }

    private void gerenciarExclusoes() {
        int opcao;
        do {
            opcao = menu.menuExclusoes();
            
            switch (opcao) {
                case 1:
                    deletarUsuario();
                    break;
                case 2:
                    deletarAluno();
                    break;
                case 3:
                    deletarProduto();
                    break;
                case 4:
                    deletarPedido();
                    break;
                case 5:
                    deletarLivro();
                    break;
                case 6:
                    deletarFuncionario();
                    break;
                case 0:
                    break;
                default:
                    if (opcao != -1) {
                        System.out.println("Opção inválida!");
                    }
                    break;
            }
        } while (opcao != 0);
    }

    private void gerenciarListagens() {
        int opcao;
        do {
            opcao = menu.menuListagens();
            
            switch (opcao) {
                case 1:
                    dao.listarTodosUsuarios();
                    break;
                case 2:
                    listarUsuarioPorId();
                    break;
                case 3:
                    dao.listarPorEmail();
                    break;
                case 4:
                    dao.contarUsuario();
                    break;
                case 0:
                    break;
                default:
                    if (opcao != -1) {
                        System.out.println("Opção inválida!");
                    }
                    break;
            }
        } while (opcao != 0);
    }

    // Métodos de Cadastro
    private void cadastrarUsuario() {
        System.out.println("Digite o nome do usuário: ");
        String nome = sc.nextLine();
        System.out.println("Digite o email do usuário: ");
        String email = sc.nextLine();
        dao.inserirUser(nome, email);
    }

    private void cadastrarAluno() {
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();
        System.out.println("Digite a matrícula do aluno: ");
        String matricula = sc.nextLine();
        System.out.println("Digite o curso do aluno: ");
        String curso = sc.nextLine();
        dao.inserirAluno(nomeAluno, matricula, curso);
    }

    private void cadastrarProduto() {
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();
        System.out.println("Digite o preço do produto: ");
        double precoProduto = sc.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        int quantidadeProduto = sc.nextInt();
        sc.nextLine();
        dao.inserirProduto(nomeProduto, precoProduto, quantidadeProduto);
    }

    private void cadastrarPedido() {
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Digite a data do pedido no formato dd/MM/yyyy: ");
        String dataString = sc.nextLine();
        System.out.println("Digite o total: ");
        double total = sc.nextDouble();
        sc.nextLine();
        
        try {
            java.time.LocalDate localDate = java.time.LocalDate.parse(dataString, formatter);
            java.sql.Date dataPedido = java.sql.Date.valueOf(localDate);
            dao.inserirPedido(nomeCliente, dataPedido, total);
        } catch (Exception e) {
            System.out.println("Erro no formato da data. Use dd/MM/yyyy");
        }
    }

    private void cadastrarLivro() {
        System.out.println("Digite o título do livro: ");
        String tituloLivro = sc.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autorLivro = sc.nextLine();
        System.out.println("Digite o ano de publicação no formato dd/MM/yyyy: ");
        String dataString = sc.nextLine();
        
        try {
            java.time.LocalDate localDate = java.time.LocalDate.parse(dataString, formatter);
            java.sql.Date dataPublicacao = java.sql.Date.valueOf(localDate);
            dao.inserirLivro(tituloLivro, autorLivro, dataPublicacao);
        } catch (Exception e) {
            System.out.println("Erro no formato da data. Use dd/MM/yyyy");
        }
    }

    private void cadastrarFuncionario() {
        System.out.println("Digite o nome do funcionário: ");
        String nomeFuncionario = sc.nextLine();
        System.out.print("Digite o cargo do funcionário: ");
        String cargoFuncionario = sc.nextLine();
        System.out.println("Digite o salário do funcionário: ");
        Double salarioFuncionario = sc.nextDouble();
        sc.nextLine();
        dao.inserirFuncionarios(nomeFuncionario, cargoFuncionario, salarioFuncionario);
    }


    private void atualizarEmailUsuario() {
        System.out.print("Digite o nome do usuário: ");
        String nome = sc.nextLine();
        System.out.println("Digite o novo email do usuário: ");
        String novoEmail = sc.nextLine();
        dao.atualizarEmail(nome, novoEmail);
    }

    private void atualizarCursoAluno() {
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();
        System.out.println("Digite o novo curso do aluno: ");
        String novoCurso = sc.nextLine();
        dao.atualizarCurso(nomeAluno, novoCurso);
    }

    private void atualizarPrecoProduto() {
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();
        System.out.println("Digite o novo preço do produto: ");
        double novoPreco = sc.nextDouble();
        sc.nextLine(); 
        dao.atualizarPrecoProduto(nomeProduto, novoPreco);
    }

    private void atualizarValorPedido() {
        System.out.print("Digite o ID do pedido: ");
        int id = sc.nextInt();
        System.out.println("Digite o novo valor total do pedido: ");
        double novoValorTotal = sc.nextDouble();
        sc.nextLine(); 
        dao.atualizarValorPedido(id, novoValorTotal);
    }

    private void atualizarAutorLivro() {
        System.out.print("Digite o título do livro: ");
        String tituloLivro = sc.nextLine();
        System.out.println("Digite o novo autor do livro: ");
        String novoAutorLivro = sc.nextLine();
        dao.atualizarAutorLivro(tituloLivro, novoAutorLivro);
    }

    private void atualizarSalarioFuncionario() {
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = sc.nextLine();
        System.out.println("Digite o novo salário do funcionário: ");
        Double novoSalarioFuncionario = sc.nextDouble();
        sc.nextLine();
        dao.atualizarSalarioFuncionario(nomeFuncionario, novoSalarioFuncionario);
    }

    // Métodos de Exclusão
    private void deletarUsuario() {
        System.out.print("Digite o nome do usuário: ");
        String nome = sc.nextLine();
        dao.deletarUsuario(nome);
    }

    private void deletarAluno() {
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = sc.nextLine();
        dao.deletarAluno(matricula);
    }

    private void deletarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();
        dao.deletarProduto(nomeProduto);
    }

    private void deletarPedido() {
        System.out.print("Digite o ID do pedido: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        dao.deletarPedido(id);
    }

    private void deletarLivro() {
        System.out.print("Digite o título do livro: ");
        String tituloLivro = sc.nextLine();
        dao.deletarLivro(tituloLivro);
    }

    private void deletarFuncionario() {
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = sc.nextLine();
        dao.deletarFuncionario(nomeFuncionario);
    }

    // Métodos de Listagem
    private void listarUsuarioPorId() {
        System.out.print("Digite o ID do usuário: ");
        int idUsuario = sc.nextInt();
        sc.nextLine(); 
        
        Usuario usuario = dao.listarPorId(idUsuario);
        if (usuario != null) {
            System.out.println("\nUsuário encontrado:");
            System.out.println("ID: " + usuario.getId());
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Email: " + usuario.getEmail());
        } else {
            System.out.println("Usuário com ID " + idUsuario + " não encontrado!");
        }
    }
}
