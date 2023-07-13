package com.example.exerciciosjavapoo.ExerciciosConstrutoresEncapsulamentoSobrecarga.lampada;

    public class lampada {

        private String modelo;
        private String tensao;
        private int potencia;
        private String tipoLuz;
        private int garantiaMeses;
        private boolean ligada;

        public lampada(String modelo, String tensao, int potencia, String tipoLuz, int garantiaMeses, boolean ligada) {
            this.modelo = modelo;
            this.tensao = tensao;
            this.potencia = potencia;
            this.tipoLuz = tipoLuz;
            this.garantiaMeses = garantiaMeses;
            this.ligada = ligada;
        }

        public String getModelo() {
            return modelo;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getTensao() {
            return tensao;
        }
        public void setTensao(String tensao) {
            this.tensao = tensao;
        }

        public int getPotencia() {
            return potencia;
        }
        public void setPotencia(int potencia) {
            this.potencia = potencia;
        }

        public String getTipoLuz() {
            return tipoLuz;
        }
        public void setTipoLuz(String tipoLuz) {
            this.tipoLuz = tipoLuz;
        }

        public int getGarantiaMeses() {
            return garantiaMeses;
        }
        public void setGarantiaMeses(int garantiaMeses) {
            this.garantiaMeses = garantiaMeses;
        }

        public boolean isLigada() {
            return ligada;
        }
        public void setLigada(boolean ligada) {
            this.ligada = ligada;
        }

        public void ligar() {
            setLigada(true);
        }

        public void desligar() {
            setLigada(false);
        }

        public void mostrarEstado() {
            if (isLigada()) {
                System.out.println("Lâmpada está ligada");
            } else {
                System.out.println("Lâmpada está desligada");
            }
        }

        public void mudarEstado() {
            if (isLigada()) {
                desligar();
            } else {
                ligar();
            }
        }
    }

