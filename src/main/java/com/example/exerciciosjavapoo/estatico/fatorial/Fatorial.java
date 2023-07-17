package com.example.exerciciosjavapoo.estatico.fatorial;

public class Fatorial {

    public static int fatorial(int num){

        if(num == 0){
            return 1;
        }

        int total = 1;
        for (int i = num; i > 1; i-- ){
            total *= i;
        }

        return total;
    }
}
