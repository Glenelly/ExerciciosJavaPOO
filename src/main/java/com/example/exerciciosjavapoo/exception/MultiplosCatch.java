package com.example.exerciciosjavapoo.exception;

public class MultiplosCatch {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++){

            try {
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
            }
            catch (ArithmeticException exception){
                System.out.println("Erro ao dividir por 0.");
            }
            catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("Posição do Array Inválida");
            }
        }
    }
    /*
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++){

            try {
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
            }
            catch (ArithmeticException exception){
                System.out.println("Erro ao dividir por 0.");
            }
            catch (Throwable exception){
                System.out.println("Ocorreu um erro.");
            }
        }
    }
    */
    /*
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++){

            try {
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException exception){
                System.out.println("Ocorreu um erro.");
            }
        }
    }
    */
}
