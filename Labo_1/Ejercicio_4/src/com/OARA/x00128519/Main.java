package com.OARA.x00128519;

import java.util.Scanner;

public class Main {

    static Scanner in =new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese la cadena de texto ");
        String Cadena = in.nextLine();
        System.out.print("Ingrese el caracter 'a' que quiere reemplazar ");
        char a = in.nextLine().charAt(0);
        System.out.print("Ingrese el caracter 'b' por el cual va a reemplazar el caracter 'a' ");
        char b= in.nextLine().charAt(0);
        System.out.println(Cadena.replace(a,b));

    }
}
