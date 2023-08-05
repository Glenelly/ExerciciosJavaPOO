package com.example.exerciciosjavapoo.exception;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {

        System.out.println("Informe um número: ");
        try {
            double num = leNumero();
            System.out.println("Você digitou: " + num);
        }
        catch (Exception e) {
            System.out.println("Entrada Inválida!");
            throw new RuntimeException(e);
        }
    }

    public static double leNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();

        return num;
    }
}
