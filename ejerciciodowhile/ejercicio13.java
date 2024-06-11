package ejerciciodowhile;

/*
    Realizar un programa que permita ingresar números y
    muestre el mayor de ellos.
 */

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,mayor=0;
        do {
            System.out.println("Ingrese un número");
            num= lector.nextInt();
            if (num>mayor){
                mayor=num;
            }
        }while (num!=0);
        System.out.println("El mayor fué: "+mayor);
    }
}
