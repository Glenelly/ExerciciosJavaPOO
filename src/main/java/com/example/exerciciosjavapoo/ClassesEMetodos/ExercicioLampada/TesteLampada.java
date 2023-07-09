package com.example.exerciciosjavapoo.ClassesEMetodos.ExercicioLampada;

public class TesteLampada {

    /*
    Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos	para ligar,	desligar a lampada
    */

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();

    }
}
