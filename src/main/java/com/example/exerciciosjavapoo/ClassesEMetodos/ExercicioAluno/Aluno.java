package com.example.exerciciosjavapoo.ClassesEMetodos.ExercicioAluno;

public class Aluno {

    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];

    void mostrarInfo(){

        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for(int i = 0; i < nomeDisciplinas.length; i++){
            System.out.println("Nome das disciplinas: " + nomeDisciplinas[i]);

            for (int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    double obterMedia(int indice){

        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }
        double media = soma / 4;
        return media;
    }

    boolean verificarAprovado(int indice){

        if(obterMedia(indice) >= 7) {
            return true;
        }
        return false;
    }

}