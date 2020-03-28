package com.OARA.x00128519;

public class Moneda {
    private double valorCentavo;
    private double valorCinco;
    private double valorDiez;
    private double valorCora;
    private double valorDolar;
    private double Total;

    private int cantidadCentavos;
    private int cantidadCincos;
    private int cantidadDieces;
    private int cantidadCoras;
    private int cantidadDolares;


    public Moneda() {
        cantidadCentavos = 0;
        cantidadCoras = 0;
        cantidadCincos = 0;
        cantidadDieces = 0;
        cantidadDolares = 0;

        valorCentavo = 0.01;
        valorCinco = 0.05;
        valorDiez = 0.10;
        valorCora = 0.25;
        valorDolar = 1.00;

    }
    public void agregarCentavos(int cantidad) {
        cantidadCentavos += cantidad;
    }
    public void agregarCincos(int cantidad) {
        cantidadCincos += cantidad;
    }
    public void agregarDieces(int cantidad) {
        cantidadDieces += cantidad;
    }

    public void agregarCoras(int cantidad) {
        cantidadCoras += cantidad;
    }
    public void agregarDolares(int cantidad) {
        cantidadDolares += cantidad;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public double consultarTotal() {
        Total =  cantidadDolares   * valorDolar
                + cantidadCoras    * valorCora
                + cantidadCentavos * valorCentavo
                + cantidadDieces   * valorDiez
                + cantidadCincos   * valorCinco;

        return Total;
    }


}
