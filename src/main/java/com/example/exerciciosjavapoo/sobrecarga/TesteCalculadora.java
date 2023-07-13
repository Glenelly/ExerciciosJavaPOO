package com.example.exerciciosjavapoo.sobrecarga;

public class TesteCalculadora {
    public static void main(String[] args) {

        MinhaCalculadora calc = new MinhaCalculadora();

        System.out.println(calc.soma(1,2));
        System.out.println(calc.soma(1.0,2.0));
        System.out.println(calc.soma(3,5,9));
        System.out.println(calc.soma(4,6,8));

    }
}
