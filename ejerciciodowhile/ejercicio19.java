package ejerciciodowhile;
/*
    Realizar un programa que permita y valide ingresar
    un número par
 */
import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un número par: ");
            num=lector.nextInt();
        }while (num%2!=0);
    }
}
