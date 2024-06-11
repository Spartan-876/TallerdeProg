package ejerciciosWhile;

/*
    Realice un programa que permita ingresar números, y que de como respuesta
    la cantidad de números pares e impares, el ingreso de números finaliza cuando ingresa 0
 */

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num=1,par=0,impar=0;
        while (num!=0){
            System.out.println("Ingrese el número:");
            num=lector.nextInt();
            if (num%2==0){
                par++;
            }else {
                impar++;
            }
        }
        System.out.println("Números pares: "+par);
        System.out.println("Números impares: "+impar);
    }
}
