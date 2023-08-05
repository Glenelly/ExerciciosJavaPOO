package com.example.exerciciosjavapoo.exception;

public class Finally {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++){

            try {
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
            }
            catch (ArithmeticException exception){
                System.out.println("Erro ao dividir por 0.");
                System.exit(0);
            }
            catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Posição do Array Inválida");
                System.exit(0);
            }
            finally {
                System.out.println("Essa linha sempre é impressa logo após o try ou o catch.");
                System.out.println();
            }
        }
    }
}
