package com.example.exerciciosjavapoo.estatico;

public class TesteMinhaCalculadora {

    static int resultadoSoma;
    public static void main(String[] args) {

        resultadoSoma = MinhaCalculadora.soma(1,2);
        System.out.println(resultadoSoma);

        //MinhaCalculadora calc = new MinhaCalculadora();

        System.out.println(MinhaCalculadora.soma(1,2));

        System.out.println(soma2Valores(1,2));

    }
    static int soma2Valores(int num1_, int num2){
        return MinhaCalculadora.soma(num1_,num2);
    }
}
