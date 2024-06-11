package ejerciciodowhile;

import java.util.Scanner;
/*
    Realice un programa que realice la suma los número de 1 al 100.
 */
public class ejercicio10 {
    public static void main(String[] args) {
        int cont=1,sumatoria=0;
        System.out.println("La sumatoria de 1 a 100");
        do {
            sumatoria=sumatoria+cont;
            cont++;
        } while (cont<=100);
        System.out.println(sumatoria);
    }
}
