package com.example.exerciciosjavapoo.ExerciciosConstrutoresEncapsulamentoSobrecarga.contaCorrente;

public class TesteContaCorrente {
    /*
    Cria	uma	classe	para representar uma conta	corrente que possui	um
    número,	um	saldo,	um	status	que	informa	se	ela	é especial ou não, um limite.
    Desenvolva	métodos	para realizar saque	(verificando se	o cliente
    pode realizar saques), despositar dinheiro,	consultar saldo	e verificar	se	o
    cliente	está usando	cheque	especial ou	não. Desenvolva	um	programa
    para testar	essa classe.
    */
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.setNumero("335");
        conta.setAgencia("A37");
        conta.setEspecial(true);
        conta.setLimiteEspecial(450);
        conta.setValorEspecialUsado(100);
        conta.setSaldo(500);

        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Conta especial: " + conta.isEspecial());
        System.out.println("Limite especial: " + conta.getLimiteEspecial());
        System.out.println("Valor usado do limite especial: " + conta.getValorEspecialUsado());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println();

        System.out.println("Saldo da conta: ");
        conta.consultarSaldo();

        System.out.println("Realizando saque de R$10");
        boolean saqueEfetuado = conta.realizaSaque(10);

        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo da conta: ");
            conta.consultarSaldo();
            System.out.println();
        }else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
            System.out.println();
        }

        System.out.println("Realizando saque de R$500");
        boolean saqueEfetuado2 = conta.realizaSaque(500);

        if(saqueEfetuado2){
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo da conta: ");
            conta.consultarSaldo();
            System.out.println();
        }else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
            System.out.println();
        }

        System.out.println("Depósito de 500 reais");
        conta.depositar(500);
        System.out.println("Saldo da conta: ");
        conta.consultarSaldo();
        System.out.println();

        System.out.println("Verificando uso de cheque especial: ");
        conta.verificarUsoChequeEspecial();
        System.out.println();

        System.out.println("Realizando saque de R$600");
        conta.realizaSaque(600);

        System.out.println("Saldo da conta: ");
        conta.consultarSaldo();

        System.out.println("Verificando uso de cheque especial: ");
        conta.verificarUsoChequeEspecial();

    }
}
