package ejerciciodowhile;
/*
    Realizar un programa que valide que el número
    ingresadi sea multiplo de 5.
 */
import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un múltiplo de 5");
            num=lector.nextInt();
        }while (num%5!=0);
    }
}
