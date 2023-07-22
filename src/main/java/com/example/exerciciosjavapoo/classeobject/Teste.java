package com.example.exerciciosjavapoo.classeobject;

public class Teste {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setCurso("Java");

        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "ksksksk";
        String s2 = "ksksksk";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("JavaScript");

        double[] notas2 = {10, 10, 8, 7};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));

    }
}
