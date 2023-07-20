package com.example.exerciciosjavapoo.relacionamentoentreclasses.curso;

public class Alunos {
    private String nome;
    private String matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfo(){
        String info = "Nome do aluno: " + nome + "\n";
        info += "Matricula: " + matricula + "\n";
        info += "Notas: ";

        int soma = 0;
        for(double nota : notas){
            soma += nota;
            info += nota + " ";
        }
        double media = soma / 4.0;
        info += "Média: " + "\n";
        if (media < 7){
            info += "O aluno está REPROVADO!!";
            System.out.println();
        }else {
            info += "O aluno está APROVADO!!";
            System.out.println();
        }

        return info;
    }

    public double obterMedia(){
        int soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return soma / 4.0;
    }
}