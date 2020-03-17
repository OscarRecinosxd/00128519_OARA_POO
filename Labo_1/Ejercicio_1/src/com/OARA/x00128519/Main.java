package com.OARA.x00128519;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Cuantos terminos de fibonacci quiere imprimir?");
        byte n = in.nextByte(); in.nextLine();
        Long Valor1 =1l;
        Long Valor2 =0l;
        Long Aux = 0l;
        for(int i=0; i<n ; i++){
            if(i==0)
                System.out.println("Termino numero 1 es 0"  );
            else {
                System.out.println("Termino numero " + (i + 1) + " es " + ((Valor1 + Valor2)));

                Aux = Valor1;
                Valor1 = Valor2;
                Valor2 += Aux;
            }
        }
    }
}