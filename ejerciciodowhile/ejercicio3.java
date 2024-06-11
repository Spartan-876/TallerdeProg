package ejerciciodowhile;

import java.util.Scanner;
/*
    Realizar un programa que pida al usuario ingresar un número positivo
    y valide que sea correcto.
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int n;
        do{
            System.out.println("Ingrese un número positivo");
            n=lector.nextInt();
        }while (n<0);
    }
}