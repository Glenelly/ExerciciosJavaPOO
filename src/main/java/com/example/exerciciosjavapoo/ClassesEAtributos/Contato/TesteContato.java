package com.example.exerciciosjavapoo.ClassesEAtributos.Contato;

public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.nome = "Glenelly";
        contato.email = "glenelly@gmail.com";
        contato.endereco = "Rua um, 204";

        contato.telefones = new String[2];
        contato.telefones[0] = "81975869473";
        contato.telefones[1] = "81974839572";

        System.out.println("Nome: " + contato.nome);
        System.out.println("Email: " + contato.email);
        System.out.println("Endereço: " + contato.endereco);
        System.out.println("Telefone 1: " + contato.telefones[0]);
        System.out.println("Telefone 2: " + contato.telefones[1]);

    }
}
