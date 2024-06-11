package ejerciciosWhile;

/*
    Realice un  programa que permita ingresar un número
    y de como resultado la cantidad de cifras que tiene.
 */

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,cont=0;
        System.out.println("Ingrese un número:");
        num=lector.nextInt();
        num = Math.abs(num);
        while (num > 0) {
            num=num/10;
            cont++;
        }
        System.out.println("El número tiene: "+cont+" cifras.");
    }
}
