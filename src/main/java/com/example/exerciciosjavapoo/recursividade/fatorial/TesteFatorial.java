package com.example.exerciciosjavapoo.recursividade.fatorial;


public class TesteFatorial {
    public static void main(String[] args) {

        int fatorialNR = Fatorial.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = Fatorial.fatorialRecursivo(5);
        System.out.println(fatorialR);

    }
}
