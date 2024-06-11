package ejerciciosWhile;

/*
    Realice un programa que permita ingresar un número positivo
    y de la suma de sus cifras.
 */

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,suma=0,result;

        System.out.println("Ingrese su número:");
        num=lector.nextInt();

        while (num>0){
            result=num%10;
            suma=suma+result;
            num=num/10;
        }
        System.out.println("La suma de digitos es: "+suma);
    }
}
