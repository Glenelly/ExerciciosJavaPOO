package com.example.exerciciosjavapoo.This;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    public Carro(String marca, String modelo, int numPassageiros,
                 double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
    public Carro() {}
    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando contrutor com 3 parâmetros");
    }
    public Carro(String marca, String modelo) {
        this("Fiat", "Ducato", 10);
        System.out.println("Chamando contrutor com 2 parâmetros");
    }
    double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel;
    }
    double calcularCombustivel(double km){
        double qtdCombustivel = (km / this.consumoCombustivel);
        return qtdCombustivel;
    }


}
