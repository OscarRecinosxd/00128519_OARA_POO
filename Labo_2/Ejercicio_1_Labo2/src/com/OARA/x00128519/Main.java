package com.OARA.x00128519;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String AuxMaterial="";
        String AuxTipo="";
        short AuxDurabilidad=0;
        short AuxMinar =0;
        short AuxAtacar=0;
        byte AuxDamage=0;
        byte AuxMaterialCoste=0;
        byte opcion=0;

        ArrayList<HerramientasMinecraft> Herramientas = new ArrayList<>();

        System.out.println();
        do{
            AuxMaterial=""; AuxTipo=""; AuxDurabilidad=0; AuxDamage=0; AuxMaterialCoste=0; AuxAtacar=0;  AuxMinar =0;
            Imprimir();
            System.out.print("Su opcion: "); opcion = in.nextByte(); in.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Escriba su tipo: Hacha, Pico, Espada, Pala u Hoz ");           AuxTipo=in.nextLine();
                    System.out.println("Escriba su material: Madera, Piedra, Hierro, Oro o Diamante"); AuxMaterial= in.nextLine();
                    System.out.println("Escriba su durabilidad ");                                     AuxDurabilidad=in.nextShort(); in.nextLine();
                    System.out.println("Escriba el daño que inflije la herramienta ");                 AuxDamage=in.nextByte();       in.nextLine();
                    System.out.println("Escriba el coste del material del arma ");                     AuxMaterialCoste=in.nextByte();in.nextLine();
                    Herramientas.add(new HerramientasMinecraft(AuxMaterial,AuxTipo,AuxDurabilidad,AuxDamage,AuxMaterialCoste));
                    break;
                case 2:
                    Herramientas.forEach(s -> {
                        System.out.println(s);
                    });

                    break;


                case 3:
                    String Tipo="";
                    System.out.println("¿De que tipo quiere buscar? Hacha, Pico, Espada, Pala u Hoz"); Tipo = in.nextLine();
                    String finalTipo = Tipo;
                    HerramientasMinecraft HerramientaAux;
                    for(HerramientasMinecraft aux : Herramientas){
                        if(aux.getTipo().equalsIgnoreCase(Tipo)){
                            System.out.println(aux.toString());
                        }
                    }
                    break;

                case 4:
                    System.out.println("¿Cuantos bloques desea minar?");
                    AuxMinar=in.nextShort(); in.nextLine();
                    short finalMinar = AuxMinar;
                    Herramientas.forEach(s->{
                        s.Minar(finalMinar);

                    });



                    break;


                case 5:
                    System.out.println("¿Cuantos veces desea atacar?");
                    AuxAtacar=in.nextShort(); in.nextLine();
                    short finalAtacar = AuxAtacar;
                    Herramientas.forEach(s->{
                        s.Attack(finalAtacar);

                    });

                    break;


                case 0: break;
                default:
                    System.out.println("Opcion invalida");


            }
    }while (opcion != 0) ;


}
    static void Imprimir(){
        System.out.println("");
        System.out.println("");
        System.out.println("1: Agregar herramientas ");
        System.out.println("2: Mostrar herramientas ");
        System.out.println("3: Mostrar herramientas de un tipo ");
        System.out.println("4: Minar ");
        System.out.println("5: Atacar ");
        System.out.println("0: Salir ");
    }


}
