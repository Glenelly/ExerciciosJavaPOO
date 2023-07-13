package com.example.exerciciosjavapoo.ExerciciosConstrutoresEncapsulamentoSobrecarga.aluno;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno() {
        nomeDisciplinas = new String[3];
        notasDisciplinas = new double[3][4];
    }
    public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

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

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void mostrarInfo(){

        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome do curso: " + getNomeCurso());
        System.out.println("Notas: ");
        mostrarNotas();

    }

    private void mostrarNotas(){
        for(int i = 0; i < getNomeDisciplinas().length; i++){
            System.out.println("Nome das disciplinas: " + getNomeDisciplinas()[i]);

            for (int j = 0; j < getNotasDisciplinas()[i].length; j++){
                System.out.println(getNotasDisciplinas()[i][j] + " ");
            }
            System.out.println();
        }
    }

    private double obterMedia(int indice){

        double soma = 0;

        for (int i = 0; i < getNotasDisciplinas()[indice].length; i++){
            soma += getNotasDisciplinas()[indice][i];
        }
        double media = soma / 4;
        return media;
    }

    public boolean verificarAprovado(int indice){

        if(obterMedia(indice) >= 7) {
            return true;
        }
        return false;
    }

    public void setNomeDisciplinas(int posicao, String nomeDisciplina) {
        this.nomeDisciplinas[posicao] = nomeDisciplina;
    }

    public void setNotasIJ(int posicaoI ,int posicaoJ , double nota) {
        this.notasDisciplinas[posicaoI][posicaoJ] = nota;
    }
}
