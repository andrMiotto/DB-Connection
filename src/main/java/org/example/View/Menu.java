package org.example.View;

import java.util.Scanner;

public class Menu {

    private Scanner input;

    public Menu() {
        input = new Scanner(System.in);
    }

    public int menuPrincipal() {
        System.out.println("=== SISTEMA DE GERENCIAMENTO ===");
        System.out.println("1 - Cadastros");
        System.out.println("2 - Atualizações");
        System.out.println("3 - Exclusões");
        System.out.println("4 - Listagens");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");

        int opcao = input.nextInt();
        input.nextLine(); // Consumir quebra de linha

        if (opcao < 0 || opcao > 4) {
            System.out.println("Opção inválida!");
            return -1;
        }

        return opcao;
    }

    public int menuCadastros() {
        System.out.println("\n=== MENU DE CADASTROS ===");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Cadastrar aluno");
        System.out.println("3 - Cadastrar produto");
        System.out.println("4 - Cadastrar pedido");
        System.out.println("5 - Cadastrar livro");
        System.out.println("6 - Cadastrar funcionário");
        System.out.println("0 - Voltar ao menu principal");
        System.out.print("Escolha uma opção: ");

        int opcao = input.nextInt();
        input.nextLine();

        if (opcao < 0 || opcao > 6) {
            System.out.println("Opção inválida!");
            return -1;
        }

        return opcao;
    }

    public int menuAtualizacoes() {
        System.out.println("\n=== MENU DE ATUALIZAÇÕES ===");
        System.out.println("1 - Atualizar email do usuário");
        System.out.println("2 - Atualizar curso do aluno");
        System.out.println("3 - Atualizar preço do produto");
        System.out.println("4 - Atualizar valor total do pedido");
        System.out.println("5 - Atualizar autor do livro");
        System.out.println("6 - Atualizar salário do funcionário");
        System.out.println("0 - Voltar ao menu principal");
        System.out.print("Escolha uma opção: ");

        int opcao = input.nextInt();
        input.nextLine();

        if (opcao < 0 || opcao > 6) {
            System.out.println("Opção inválida!");
            return -1;
        }

        return opcao;
    }

    public int menuExclusoes() {
        System.out.println("\n=== MENU DE EXCLUSÕES ===");
        System.out.println("1 - Deletar usuário pelo nome");
        System.out.println("2 - Deletar aluno pela matrícula");
        System.out.println("3 - Deletar produto pelo nome");
        System.out.println("4 - Deletar pedido pelo ID");
        System.out.println("5 - Deletar livro pelo título");
        System.out.println("6 - Deletar funcionário pelo nome");
        System.out.println("0 - Voltar ao menu principal");
        System.out.print("Escolha uma opção: ");

        int opcao = input.nextInt();
        input.nextLine();

        if (opcao < 0 || opcao > 6) {
            System.out.println("Opção inválida!");
            return -1;
        }

        return opcao;
    }

    public int menuListagens() {
        System.out.println("\n=== MENU DE LISTAGENS ===");
        System.out.println("1 - Listar todos os usuários");
        System.out.println("2 - Listar usuário por ID");
        System.out.println("3 - Listar usuários por email (@email.com)");
        System.out.println("4 - Contar total de usuários");
        System.out.println("0 - Voltar ao menu principal");
        System.out.print("Escolha uma opção: ");

        int opcao = input.nextInt();
        input.nextLine();

        if (opcao < 0 || opcao > 4) {
            System.out.println("Opção inválida!");
            return -1;
        }

        return opcao;
    }

    public void fecharScanner() {
        if (input != null) {
            input.close();
        }
    }
}
