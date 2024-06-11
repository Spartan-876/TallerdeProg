package ejerciciosWhile;

/*
    Realice un programa que permita ingresar un número
    y indique si es primo o no;
 */

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num, div=2;
        boolean primo=true;
        System.out.println("Ingrese un número positivo");
        num=lector.nextInt();
        if (num<=1){
            primo=false;
        }else {
            while (div <=num/2 && primo){
                if (num%div==0){
                    primo=false;
                }
                div++;
            }
        }
        if (primo){
            System.out.println(num+ " es primo");
        } else {
            System.out.println(num+ " no es primo");
        }
    }
}
