package org.example.View;

import java.util.Scanner;

public class Menu {

    static Scanner input;

    public Menu() {
        input = new Scanner(System.in);
    }


    public int menuPrincipal(){
        int opcaoMenu = 0;

        System.out.println("-------- Atividades --------");
        System.out.println("");
        System.out.println("1 - Cadastrar usuario");
        System.out.println("2 - Cadastrar aluno");
        System.out.println("0 - Sair");
        System.out.println("");
        System.out.print("-------> ");

        opcaoMenu = input.nextInt();
        input.nextLine();

        if (opcaoMenu < 0 || opcaoMenu > 2) {
            System.out.println("Código inválido");
        }

        return opcaoMenu;
    }


}
