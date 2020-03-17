package com.OARA.x00128519;

import java.util.Scanner;

public class Main {
    static Scanner in;

    public Main() {
    }

    public static <Char> void main(String[] args) {
        System.out.println("Ingrese la frase para verificar si es palindrome");
        String Frase = in.nextLine();
        String CadenaInvertida = "";
        String FraseAux = Frase.replace(".", "");
        FraseAux = FraseAux.replace(",", "");
        FraseAux = FraseAux.replace(" ", "");
        FraseAux = FraseAux.trim();
        for(int x = Frase.length() - 1; x >= 0; --x) {
            if (Frase.charAt(x) != ' ' && Frase.charAt(x) != ',' && Frase.charAt(x) != '.' ) {
                CadenaInvertida = CadenaInvertida + Frase.charAt(x);
            }
        }

        Cadenas(FraseAux, CadenaInvertida);
    }

    static void Cadenas(String FraseAux, String CadenaInvertida) {
        if (FraseAux.equalsIgnoreCase(CadenaInvertida)) {
            System.out.println(FraseAux.equalsIgnoreCase(CadenaInvertida));
            System.out.println("La frase es palindrome ");
        }

    }

    static {
        in = new Scanner(System.in);
    }
}