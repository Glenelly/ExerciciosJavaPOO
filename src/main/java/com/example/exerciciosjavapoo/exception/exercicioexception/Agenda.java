package com.example.exerciciosjavapoo.exception.exercicioexception;

import java.util.Arrays;

public class Agenda {

    private Contato[] contatos;

    public Agenda(){
        contatos = new Contato[5];
    }

    public boolean adicionarContato(Contato c) throws AgendaCheiaExeption {
        boolean cheia = true;
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i] == null){
                contatos[i] = c;
                cheia = false;
                break;
            }
        }
        if(cheia){
            throw new AgendaCheiaExeption();
        }
        return false;
    }

    public int consultaContatoPorNome(String nome) throws ContatoNaoExisteException {

        for(int i = 0; i < contatos.length; i++ ){
            if (contatos[i] != null){
                if(contatos[i].getNome().equalsIgnoreCase(nome)){
                    return i;
                }
            }
        }
        throw new ContatoNaoExisteException(nome);

    }

    @Override
    public String toString() {
        String s = "";
        for(Contato c : contatos){
            if (c != null){
                s += c.toString() + "\n";
            }
        }
        return s;
    }
}
