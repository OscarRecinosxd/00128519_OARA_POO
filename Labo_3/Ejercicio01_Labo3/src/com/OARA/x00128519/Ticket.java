package com.OARA.x00128519;

public class Ticket {
    private Automovil Auto;
    private int Tiempo;
    private String Salida;
    private double Precio;
    private Moneda monedas;

    public Ticket(Automovil auto) {
        Auto = auto;
    }
    //Costo
    public double Precio(int minutos){
        double Precio =0;
        if ( minutos < 30 )
    Precio = 0;
        else if(minutos<60)
    Precio = 0.5;
        else if (minutos<120)
    Precio = 1;
        else if(minutos>=120)
    Precio = 5;

        return Precio;
}

    //Set


    public void setSalida(String salida) {
        Salida = salida;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public void setMonedas(Moneda monedas) {
        this.monedas = monedas;
    }

    public void setTotal(double a){
        monedas.setTotal(a);
    }

    //Get
    public Automovil getAuto() {
        return Auto;
    }

    public String getSalida() {
        return Salida;
    }

    public Moneda getMonedas() {
        return monedas;
    }

    public double getPrecio() {
        return Precio;
    }

    @Override
    public String toString() {
        if(Salida =="")
        return "Ticket " + Auto + monedas ;
        else {
             return "Ticket " + Auto + ", Salida:  "+Salida+",  Valor del ticket $" + Precio+"  USD";
        }
    }


}
