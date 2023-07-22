package com.example.exerciciosjavapoo.heranca.polimorfismo;

public class Teste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 1, N° 01");
        aluno.setEndereco("Rua 2, N° 02");
        professor.setEndereco("Rua 3, N° 03");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());




    }
}
