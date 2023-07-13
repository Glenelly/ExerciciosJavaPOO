package com.example.exerciciosjavapoo.Construtores;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro(){
        System.out.println("Classe carro foi instanciada!!");
        numPassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustive_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustive_;
    }

    double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;

    }
}
