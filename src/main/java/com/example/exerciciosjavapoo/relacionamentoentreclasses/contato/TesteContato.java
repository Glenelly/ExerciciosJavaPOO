package com.example.exerciciosjavapoo.relacionamentoentreclasses.contato;

public class TesteContato {
    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Glenelly");

        //relacionamento tem-um endereço

        Endereco end = new Endereco();

        end.setNomeRua("Rua um");
        end.setNumero("n/a");
        end.setComplemento("casa");
        end.setCidade("Recife");
        end.setEstado("Pernambuco");
        end.setCep("87964030");

        contato.setEndereco(end);

        //relacionamento tem-muitos telefone

        Telefone tel = new Telefone();

        tel.setTipo("Celular");
        tel.setDdd("81");
        tel.setNumero("95465-7687");

        Telefone tel2 = new Telefone();

        tel2.setTipo("Casa");
        tel2.setDdd("55");
        tel2.setNumero("93421-8769");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        contato.setTelefone(telefones);

        //contato.setTelefone();

        //Teste saida no console

        System.out.println(contato.getNome());

        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        if(contato != null && contato.getTelefone() != null){
            for (Telefone t : contato.getTelefone()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
