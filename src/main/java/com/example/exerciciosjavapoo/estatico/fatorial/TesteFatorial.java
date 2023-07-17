package com.example.exerciciosjavapoo.estatico.fatorial;

import java.util.Scanner;

public class TesteFatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        do{
            System.out.println("Insira um número positivo");
            num = scan.nextInt();

            if( num < 0){
                System.out.println("Número inválido, insira novamente");
            }
        }while (num < 0);

        System.out.println(Fatorial.fatorial(num));
    }
}
