package org.example.AulaSQL;
import org.example.service.GerenciadorDados;
import org.example.service.UsuarioDao;

import java.time.LocalDate;


import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        GerenciadorDados gerenciador = new GerenciadorDados();

        int opcaoMenuEscolhida;

        do {
            System.out.println("=----Cadastro----=");
            System.out.println("1- Usuario");
            System.out.println("2- Aluno");
            System.out.println("3- Produto");
            System.out.println("4- Cliente");
            System.out.println("5- Livros");
            System.out.println("6- Funcionarios");
            System.out.println("0- Sair");
            System.out.print("Escolha uma opção: ");

            opcaoMenuEscolhida = sc.nextInt();
            sc.nextLine();

            if (opcaoMenuEscolhida != 0) {
                gerenciador.gerenciarCadastros(opcaoMenuEscolhida);
            }
        } while (opcaoMenuEscolhida != 0);

        System.out.println("Sistema encerrado!");
        sc.close();
    }
}