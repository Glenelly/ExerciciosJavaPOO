package com.example.exerciciosjavapoo.exception;

public class CriandoException {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denom = {2, 0, 4, 8, 0, 2, 4};

        for(int i = 0; i < numeros.length; i++) {

            try {
                if(numeros[i] % 2 != 0){
                    //lançar a exception aqui
                    throw new ExceptionDivisaoNaoExata(numeros[i], denom[i]);
                }
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException | ExceptionDivisaoNaoExata exception) {
                System.out.println("Aconteceu um erro");
                exception.printStackTrace();
            }
        }
    }
}
