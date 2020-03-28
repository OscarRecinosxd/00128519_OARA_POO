package com.OARA.x00128519;

public class Automovil {
    private String Placa;
    private String Entrada;

    public Automovil(String entrada) {
        Entrada = "00:00";
    }

    public Automovil(String placa, String entrada) {
        Placa = placa;
        Entrada = entrada;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getEntrada() {
        return Entrada;
    }

    @Override
    public String toString() {
        return "Placa= " + Placa  +
                ", Entrada= " + Entrada ;
    }
}
