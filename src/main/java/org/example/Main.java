package org.example;
import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("digite seu nome");
            String nome = sc.nextLine();

            System.out.println("digite seu email");
            String email = sc.nextLine();


      UsuarioDao dao = new UsuarioDao();


      dao.inserir(nome,email);
    }
}