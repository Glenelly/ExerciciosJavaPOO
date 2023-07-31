package com.example.exerciciosjavapoo.exerciciosherancapolimorfismo.impostoderenda;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        return  "---Pessoa Juridica---" + "\n" +
                super.toString() + "\n" +
                "CNPJ: " + cnpj + "\n" +
                "Imposto a ser pago: " + calcularImposto() + "\n";
    }
}
