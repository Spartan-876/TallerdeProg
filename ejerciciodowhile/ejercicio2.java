package ejerciciodowhile;

/*
 Realizar un programa que permita ingresar 2 números n y m
 y validar que n sea  menor que m.
 */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n,m;
        do {
            System.out.println("Ingrese n");
            n = lector.nextInt();
            System.out.println("Ingrese m");
            m = lector.nextInt();
        } while (n>m);
        System.out.println("Fin");
    }
}
