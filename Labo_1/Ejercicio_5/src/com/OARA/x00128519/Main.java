package com.OARA.x00128519;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        byte opcion = 0;
        String cadena = "";
        String aux = "";
        ArrayList<String> Lista = new ArrayList<>();
        do {
            MostrarMenu();
            opcion= in.nextByte(); in.nextLine();
            switch (opcion) {

                case(1):
                    System.out.print("Ingrese el numero de letras que va a ingresar desde el teclado: ");
                    byte n = in.nextByte(); in.nextLine();
                    System.out.println("Ingrese la cadena: ");
                    cadena = in.nextLine();
                    cadena = cadena.substring(0,n);
                    System.out.println(cadena);
                    for(int i=0 ; i < n ; i++){
                        aux="";
                        if(cadena.charAt(i)=='a'||cadena.charAt(i)=='e'||cadena.charAt(i)=='i'||cadena.charAt(i)=='o'||cadena.charAt(i)=='u'||
                                cadena.charAt(i)=='A'||cadena.charAt(i)=='E'||cadena.charAt(i)=='I'||cadena.charAt(i)=='O'||cadena.charAt(i)=='U'  ){
                            aux+=cadena.charAt(i);
                            Lista.add(aux);
                        }
                    }

                    break;
                case(2):
                    Lista.forEach(s -> {
                        System.out.print(s+","); });
                    System.out.println();
                    break;
            }

        } while (opcion != 3);
    }

    static void MostrarMenu(){
        System.out.println("Opcion 1: Ingresar caracteres. ");
        System.out.println("Opcion 2: Mostrar lista. ");
        System.out.println("Opcion 3: Salir. ");
    }

}