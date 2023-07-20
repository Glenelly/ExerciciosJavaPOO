package com.example.exerciciosjavapoo.relacionamentoentreclasses.curso;

import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o nome do curso:");
        String nome = scan.nextLine();

        System.out.println("Insira o horário do curso: ");
        String horario = scan.nextLine();

        System.out.println("Insira o nome do professor: ");
        String nomeProfessor = scan.nextLine();

        System.out.println("Insira o departamento: ");
        String departamento = scan.nextLine();

        System.out.println("Insira o email: ");
        String email = scan.nextLine();

        Curso curso = new Curso();

        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();

        professor.setNome(nomeProfessor);
        professor.setDepartamento(departamento);
        professor.setEmail(email);

        System.out.println("-------Alunos-------");

        Alunos[] alunos = new Alunos[5];

        for (int i = 0; i < 5; i++) {

            scan.nextLine();

            System.out.println("Informe o nome do aluno " + (i + 1) + ": ");
            String nomeAluno = scan.nextLine();

            System.out.println("Insira a matricula do aluno " + (i + 1) + ": ");
            String matricula = scan.nextLine();

            double[] notas = new double[4];

            for (int j = 0; j < 4; j++) {
                System.out.println("Informe as nota " + (j + 1) + ": ");
                notas[j] = scan.nextDouble();
            }

            Alunos aluno = new Alunos();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matricula);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }
        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());
    }
}









        /*String alunos = " ";
        double notas = 0;
        double media = 0;
        String nomes = " ";
        double soma = 0;

        soma += notas;
        media = soma / 4;
        System.out.println(media);*/
