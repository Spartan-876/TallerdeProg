package ejerciciosWhile;

//Realice un programa que permita ingresar un número y que comience el conteo desde 1 a n;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        int num,cont=1;

        System.out.println("Ingrese n:");
        num=lector.nextInt();
        while (cont<=num){
            System.out.println(cont);
            cont++;
        }
        System.out.println("Fin");
    }
}
