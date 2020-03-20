package com.OARA.x00128519;

public class HerramientasMinecraft {
    private String Material;
    private String Tipo;
    private short Durabilidad;
    private byte Damage;
    private byte MaterialCoste;

    //Constructor
    public HerramientasMinecraft(String material, String tipo, short durabilidad, byte damage, byte materialCoste) {
        Material = material;
        Tipo = tipo;
        Durabilidad = durabilidad;
        Damage = damage;
        MaterialCoste = materialCoste;

    }

    //Metodo 1
    public void Minar(int Cantidad){
        if(Durabilidad>0){
            if(Cantidad>=Durabilidad) {
                System.out.println("Se ha minado con " + Tipo + " de "+Material+ " " + Durabilidad + " bloques y se ha roto ");
                Durabilidad = 0;
            }
            else {
                System.out.println("Se han minado " + Cantidad + " bloques con " + Tipo + " de " + Material);
                Durabilidad -= Cantidad;
            }}
        else
            System.out.println("No se puede minar con "+ Tipo + " de "+ Material +" porque su durabilidad es 0 ");
    }
    //Metodo 2
    public void Attack(int Veces){
        if(Durabilidad>0){
            if(Veces>=Durabilidad) {
                System.out.println("Se ha atacado " + Durabilidad + " veces y se ha roto el " + Tipo + " de " + Material);
                Durabilidad=0;
            }
            else {
                System.out.println("Se han atacado " + Veces + " con " + Tipo + " de "+ Material);
                Durabilidad-=Veces;
        }}
        else
            System.out.println("No se puede atacar con "+ Tipo + " de "+ Material +" porque su durabilidad es 0 ");


    }

    //Getters

    public String getTipo() {
        return Tipo;
    }

    //ToString
    @Override
    public String toString() {
        return "HerramientasMinecraft{" +
                "Material='" + Material + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", Durabilidad=" + Durabilidad +
                ", Daño=" + Damage +
                ", Coste de Material =" + MaterialCoste +
                '}';
    }
}
