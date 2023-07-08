package com.example.exerciciosjavapoo.ClassesEMetodos.ComRetorno;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;

    }
}
