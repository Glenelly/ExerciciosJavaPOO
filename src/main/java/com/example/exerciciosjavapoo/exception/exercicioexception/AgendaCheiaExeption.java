package com.example.exerciciosjavapoo.exception.exercicioexception;

public class AgendaCheiaExeption extends Exception{

    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }
}
