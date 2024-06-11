package ejerciciofor;

import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num,fact = 1;
        do {
            System.out.println("Ingrese un número +");
            num = lector.nextInt();
        } while (num < 0);
        for (int i = 1; i <= num; i++) {
            fact*=i;
        }
        System.out.println(num+"! = "+fact);
    }
}
