package ejerciciosWhile;

/*
    Realice un programa que permita ingresar un número
    y de como respuesta el número invertido
 */

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner Lector=new Scanner(System.in);
        int num,cifra;
        System.out.println("Ingrese el número:");
        num=Lector.nextInt();
        System.out.println("El inverso es:");
        while (num>0){
            cifra=num%10;
            System.out.print(cifra);
            num=num/10;
        }
    }
}
