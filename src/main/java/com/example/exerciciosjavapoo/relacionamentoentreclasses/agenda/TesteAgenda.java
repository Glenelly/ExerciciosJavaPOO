package com.example.exerciciosjavapoo.relacionamentoentreclasses.agenda;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o nome da agenda: ");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda();
        agenda.setNome(nome);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < 3; i++) {

            System.out.println("Insira as informações do contato " + (i + 1) + ": ");
            Contato c = new Contato();

            System.out.println("Insira o nome: ");
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Insira o telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Insira o email: ");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }

        agenda.setContato(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }
    }
}
