package programacionoo.ejerciciospptx;

import java.util.Scanner;

public class LectorDatos {
    public static int leerEntero() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] leerArreglo() {
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = leerEntero();
        int[] arreglo = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = leerEntero();
        }
        return arreglo;
    }
}
