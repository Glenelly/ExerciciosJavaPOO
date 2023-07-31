package com.example.exerciciosjavapoo.exerciciosherancapolimorfismo.contabancaria;

public class Teste {
    public static void main(String[] args) {

        System.out.println("---Conta Bancaria---");

        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setNomeCliente("Glenelly Karla");
        contaBancaria.setNumConta("035");
        System.out.println(contaBancaria);
        System.out.println();

        System.out.println("---Efetuando deposito---");
        contaBancaria.depositar(100);
        System.out.println("Saldo atual: " + contaBancaria.getSaldo());
        System.out.println();

        realizarSaque(contaBancaria, 50);
        System.out.println();

        realizarSaque(contaBancaria, 70);
        System.out.println();

        System.out.println("---Conta Poupança---");

        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.setNomeCliente("Glenelly Karla");
        contaPoupanca.setNumConta("035");
        contaPoupanca.setDiaRendimento(31);
        System.out.println(contaPoupanca);
        System.out.println();

        System.out.println("---Efetuando deposito---");
        contaPoupanca.depositar(100);
        System.out.println("Saldo atual: " + contaPoupanca.getSaldo());
        System.out.println();

        realizarSaque(contaPoupanca, 50);
        System.out.println();

        realizarSaque(contaPoupanca, 70);
        System.out.println();

        if(contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado." + "\n" + "Saldo atual: " + contaPoupanca.getSaldo());
        }else {
            System.out.println("Hoje não é dia de rendimento. Seu saldo não foi atualizado!");
        }

        System.out.println();
        System.out.println("---Conta Especial---");

        ContaEspecial contaEspecial = new ContaEspecial();

        contaEspecial.setNomeCliente("Glenelly Karla");
        contaEspecial.setNumConta("035");
        contaEspecial.setLimite(50);
        System.out.println(contaEspecial);
        System.out.println();

        System.out.println("---Efetuando deposito---");
        contaEspecial.depositar(100);
        System.out.println("Saldo atual: " + contaEspecial.getSaldo());
        System.out.println();

        realizarSaque(contaEspecial, 50);
        System.out.println();

        realizarSaque(contaEspecial, 70);
        System.out.println();

        realizarSaque(contaEspecial, 80);
        System.out.println();
    }

    private static void realizarSaque(ContaBancaria conta, double valor){
        if(conta.sacar(valor)){
            System.out.println("---Efetuando saque---");
            System.out.println("Saque efetuado com sucesso!!" + "\n" + "Saldo atual: " + conta.getSaldo());
        } else {
            System.out.println("---Efetuando saque---");
            System.out.println("Saldo insuficiente para saque de " + valor + "\n" + "Saldo atual: " + conta.getSaldo());
        }
    }
}