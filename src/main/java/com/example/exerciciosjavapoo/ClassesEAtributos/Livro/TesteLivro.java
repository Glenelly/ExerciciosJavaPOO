package com.example.exerciciosjavapoo.ClassesEAtributos.Livro;

public class TesteLivro {

    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.nome = "Harry Potter e a Pedra Filosofal";
        livro.autor = "J.K. Rowling";
        livro.qtdPaginas = 208;
        livro.anoLancamento = 2017;

        System.out.println(livro.nome);
        System.out.println(livro.autor);
        System.out.println(livro.qtdPaginas);
        System.out.println(livro.anoLancamento);
    }
}
