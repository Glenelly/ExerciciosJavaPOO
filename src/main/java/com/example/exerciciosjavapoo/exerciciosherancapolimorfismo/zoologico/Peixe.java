package com.example.exerciciosjavapoo.exerciciosherancapolimorfismo.zoologico;

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe() {
        super();
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = "Barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Caracteristica: " + caracteristicas;
    }
}
