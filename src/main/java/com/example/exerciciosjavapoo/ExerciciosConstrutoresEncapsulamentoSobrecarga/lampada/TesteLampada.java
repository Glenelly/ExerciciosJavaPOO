package com.example.exerciciosjavapoo.ExerciciosConstrutoresEncapsulamentoSobrecarga.lampada;

public class TesteLampada {

/*
    Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos	para ligar,	desligar a lampada.
*/
    public static void main(String[] args) {

        lampada lampada = new lampada("A60", "Bivolt", 7, "Amarela", 12, true);

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();

        System.out.println();

        System.out.println("Modelo: " + lampada.getModelo());
        System.out.println("Tensão: " + lampada.getTensao());
        System.out.println("Potência: " + lampada.getPotencia());
        System.out.println("Tipo de luz: " + lampada.getTipoLuz());
        System.out.println("Garantia: " + lampada.getGarantiaMeses());
    }
}
