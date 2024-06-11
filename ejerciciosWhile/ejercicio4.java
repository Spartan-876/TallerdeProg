package ejerciciosWhile;

/*
    Realice un programa que el usuario adivine un número aleatorio
    entre 1-10.
 */

import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num=0,random;
        Random rnd=new Random();

        random=rnd.nextInt(10)+1;

        while (num!=random) {
            System.out.println("Adivine el número (1-10)");
            num=lector.nextInt();
        }
        System.out.println("Adivinaste!");
    }
}
