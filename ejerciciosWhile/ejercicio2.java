package ejerciciosWhile;

//Realice un programa que permita ingresar n numeros enteros positivos
// y finalice cuando se ingresa uno negativo, al final dar la sumatoria de los números.

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num=0,sumatoria=0;

        while (num>=0){
            sumatoria=num+sumatoria;
            System.out.println("Ingrese un número:");
            num=lector.nextInt();
        }
        System.out.println("La sumatoria es de: " + sumatoria);
    }
}
