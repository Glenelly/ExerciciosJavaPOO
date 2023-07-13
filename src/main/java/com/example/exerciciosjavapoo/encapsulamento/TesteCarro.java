package com.example.exerciciosjavapoo.encapsulamento;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("Fiat");
        carro.setModelo("Ducato");
        carro.setNumPassageiros(10);
        carro.setCapCombustivel(100);
        carro.setConsumoCombustivel(0.2);

        System.out.println(carro.getMarca() + " " + carro.getModelo()
                + " " + carro.getNumPassageiros() + " " + carro.getCapCombustivel()
                + " " + carro.getConsumoCombustivel());

    }


}
