package com.example.exerciciosjavapoo.exception;

public class ExceptionDivisaoNaoExata extends Exception{
    private int num;
    private int denom;

    public ExceptionDivisaoNaoExata(int num, int denom) {
        super();
        this.num = num;
        this.denom = denom;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + " / " + denom + " não é um inteiro!";
    }
}
