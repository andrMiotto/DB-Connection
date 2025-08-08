package org.example.service;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GerenciadorDados {
    Scanner sc = new Scanner(System.in);
    UsuarioDao dao = new UsuarioDao();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void gerenciarCadastros(int opcaoMenuEscolhida) {
        switch (opcaoMenuEscolhida) {

            case 1:
                System.out.println("Digite o nome do usuario: ");
                String nome = sc.nextLine();

                System.out.println("Digite o email do usuario: ");
                String email = sc.nextLine();

                dao.inserirUser(nome,email);
                break;
            case 2:
                System.out.println("Digite o nome do aluno: ");
                String nomeAluno = sc.nextLine();

                System.out.println("Digite a matricula do aluno: ");
                String matricula = sc.nextLine();

                System.out.println("Digite o curso do aluno: ");
                String curso = sc.nextLine();

                dao.inserirAluno(nomeAluno,matricula,curso);

                break;
            case 3:
                System.out.println("Digite o nome do produto: ");
                String nomeProduto = sc.nextLine();

                System.out.println("Digite preço do produto: ");
                double precoProduto = sc.nextDouble();

                System.out.println("Digite a quantidade do produto: ");
                int quantidadeProduto = sc.nextInt();

                dao.inserirProduto(nomeProduto,precoProduto,quantidadeProduto);

                break;
            case 4:
                System.out.println("Digite o nome do cliente");
                String nomeCliente = sc.nextLine();

                System.out.print("Digite a data do pedido no formato dd/MM/yyyy: ");
                String data_pedido = sc.nextLine();

                System.out.println("Digite o total");
                double total = sc.nextDouble();
                break;
            case 5:
                break;
            case 6:
                break;
            case 0:

                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
