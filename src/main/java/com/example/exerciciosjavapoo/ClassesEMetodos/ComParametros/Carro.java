package com.example.exerciciosjavapoo.ClassesEMetodos.ComParametros;

public class Carro {
        String marca;
        String modelo;
        int numPassageiros;
        double capCombustivel;
        double consumoCombustivel;

        double calcularCombustivel(double km){
                double qtdCombustivel = (km / consumoCombustivel);
                return qtdCombustivel;
        }
}
