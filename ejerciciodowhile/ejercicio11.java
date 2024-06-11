package ejerciciodowhile;

/*
    Realizar un programa que calcule el promedio de n
    numeros hasta que ingrese 0
 */

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num,cont=-1,acum=0;
        float prom;
        do {
            System.out.println("Ingrese el número");
            num=lector.nextInt();
            acum=acum+num;
            cont++;
        }while (num!=0);
        prom= (float) acum /cont;
        System.out.println("El promedio es: "+prom);
    }
}
