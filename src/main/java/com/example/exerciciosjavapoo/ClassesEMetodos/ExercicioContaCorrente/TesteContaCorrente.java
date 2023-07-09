package com.example.exerciciosjavapoo.ClassesEMetodos.ExercicioContaCorrente;

public class TesteContaCorrente {

    /*
    Cria	uma	classe	para representar uma conta	corrente que possui	um
    número,	um	saldo,	um	status	que	informa	se	ela	é	especial	ou	não,	um
    limite.
    Desenvolva	métodos	para realizar saque	(verificando se	o cliente
    pode realizar saques), despositar dinheiro,	consultar saldo	e verificar	se	o
    cliente	está usando	cheque	especial ou	não. Desenvolva	um	programa
    para testar	essa classe.
    */
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;

        conta.consultarSaldo();

        boolean saqueEfetuado = conta.realizaSaque(10);

        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        }else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
        }

        boolean saqueEfetuado2 = conta.realizaSaque(500);

        System.out.println("Tentativa de saque de 500 reais ");

        if(saqueEfetuado2){
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        }else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
        }

        System.out.println("Depósito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        conta.verificarUsoChequeEspecial();

        System.out.println("Realizando saque de 600 reais");
        conta.realizaSaque(600);

        conta.consultarSaldo();

        conta.verificarUsoChequeEspecial();

    }
}
