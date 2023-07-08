package com.example.exerciciosjavapoo.ClassesEMetodos;

public class TesteMetodoSimples {

    public static void main(String[] args) {

        MetodoSimples van = new MetodoSimples();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        van.exibirAtributos();

        MetodoSimples fusca = new MetodoSimples();
        fusca.marca = "Volkwagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        fusca.exibirAtributos();
    }
}
