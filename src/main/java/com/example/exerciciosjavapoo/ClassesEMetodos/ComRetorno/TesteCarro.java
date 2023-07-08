package com.example.exerciciosjavapoo.ClassesEMetodos.ComRetorno;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        double autonomiaVan = van.obterAutonomia();
        System.out.println("A autonomia da van é: " + autonomiaVan);
        System.out.println("A autonomia da van é: " + van.obterAutonomia());

        Carro fusca = new Carro();
        fusca.marca = "Volkwagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        double autonomiaFusca = fusca.obterAutonomia();
        System.out.println("A autonomia do fusca é: " + autonomiaFusca);
        System.out.println("A autonomia do fusca é: " + fusca.obterAutonomia());

    }
}
