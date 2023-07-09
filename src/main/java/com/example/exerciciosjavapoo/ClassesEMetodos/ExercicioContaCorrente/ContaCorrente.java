package com.example.exerciciosjavapoo.ClassesEMetodos.ExercicioContaCorrente;

public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizaSaque(double quantiaASacar){

        //tem saldo na conta
        if(saldo > quantiaASacar){
            saldo -= quantiaASacar;
            return true;
        }else { // não tem saldo na conta
            if(especial){
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if(limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return  true;
                }else {
                    return false;
                }
            }else {
                return false; //não é especial e não tem saldo suficiente
            }
        }
    }

    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    void consultarSaldo(){
        System.out.println("Saldo atual da conta: " + saldo);
    }

    boolean UsoChequeEspecial(){
        return saldo < 0;
    }

    void verificarUsoChequeEspecial(){

        if(UsoChequeEspecial()){
            System.out.println("Está usando cheque especial!");
        }else {
            System.out.println("Não está usando cheque especial!");
        }
    }





}
