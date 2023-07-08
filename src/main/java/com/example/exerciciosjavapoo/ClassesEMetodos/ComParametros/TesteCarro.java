package com.example.exerciciosjavapoo.ClassesEMetodos.ComParametros;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        double qtdCombustivelVan = van.calcularCombustivel(10);

        System.out.println("A autonomia da van é: " + van.capCombustivel * van.consumoCombustivel);
        System.out.println("Quantidade de combustivel da van: " + qtdCombustivelVan);

        Carro fusca = new Carro();
        fusca.marca = "Volkwagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;
        double qtdCombustivelFusca = fusca.calcularCombustivel(15);

        System.out.println("A autonomia do fusca é: " + fusca.capCombustivel * fusca.consumoCombustivel);
        System.out.println("Quantidade de combustivel dao fusca: " + qtdCombustivelFusca);
    }
}
