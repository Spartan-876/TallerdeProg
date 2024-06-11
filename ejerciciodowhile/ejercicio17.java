package ejerciciodowhile;
/*
    Realizar un programa que permita ingresar y validar un número
    entre -10 y 10
 */
import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un número entre -10 y 10");
            num= lector.nextInt();
        }while (num<=-10 | num>=10);
        System.out.println("Gracias");
    }
}