package com.example.exerciciosjavapoo.heranca.classeabstrata;

public class Teste {
    public static void main(String[] args) {

        //Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        //pessoa.setEndereco("Rua um, N° 01");
        aluno.setEndereco("Rua dois, N° 02");
        professor.setEndereco("Rua três, N° 03");

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();

    }
}
