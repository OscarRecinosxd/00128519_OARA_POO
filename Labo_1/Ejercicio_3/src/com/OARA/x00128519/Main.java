package com.OARA.x00128519;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Hasta que numero quiere imprimir?");
        int n = in.nextInt();
        int a=1;
        Ascendente(n,a); a=n-1;
        Descendente(n,a);
    }

    static void Ascendente(int n,int a) {
        if (a == n + 1)
            return;
        else {
            System.out.print(a + ",");
            Ascendente(n, a + 1);
        }
    }

    static void Descendente(int n,int a) {
        if (a == 0)
            return;
        else {
            System.out.print(a + ",");
            Descendente(n, a - 1);
        }

    }

}
