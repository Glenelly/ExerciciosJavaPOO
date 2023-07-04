package com.example.exerciciosjavapoo.ClassesEAtributos.Lampada;

public class TesteLampada {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.potencia = 7;
        lampada.tipoLuz = "Amarela";
        lampada.garantiaMeses = 12;

        System.out.println(lampada.modelo);
        System.out.println(lampada.tensao);
        System.out.println(lampada.potencia);
        System.out.println(lampada.tipoLuz);
        System.out.println(lampada.garantiaMeses);
    }
}
