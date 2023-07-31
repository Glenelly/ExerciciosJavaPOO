package com.example.exerciciosjavapoo.castinginstanceof;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        /*
        //upcasting
        Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno;

        Pessoa aluno2 = (Pessoa) new Aluno();

        //downcasting

        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3; //Da erro
        */

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        if(pessoa instanceof Pessoa){
            System.out.println("É do tipo Pessoa");
        }
        if(aluno instanceof Aluno){
            System.out.println("É do tipo Aluno");
        }
        if(professor instanceof Professor){
            System.out.println("É do tipo Professor");
        }
    }
}
