package ejerciciodowhile;
/*
    Realizar un programa que verifique que el número
    ingresado sea negativo
 */
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un número negativo");
            num=lector.nextInt();
        }while (num>=0);

    }
}
