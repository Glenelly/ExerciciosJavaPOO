package com.example.exerciciosjavapoo.estatico.calculadora;

public class Calculadora {

    public static int somar (int num1, int num2){
        return num1 + num2;
    }
    public static int subtrair (int num1, int num2){
        return num1 - num2;
    }
    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    public static int dividir(int num1, int num2){
        return num1 / num2;
    }
    public static int potencia(int num1, int num2){

        int total = num1;
        for (int i = 1; i < num2; i++){
            total *= num1;
        }
        return total;
    }
}
