package ejerciciosgenerales;
import java.util.Scanner;

public class cifrasEntero {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cifra,num,temp;

        System.out.println("Ingrese un número entero: ");
        num = lector.nextInt();
        lector.nextLine();

        System.out.println("Las cifras del número " + num + " son:");

        temp = num;

        while (temp > 0) {
            cifra = temp % 10;
            System.out.println(cifra);
            temp = temp / 10;
        }
    }
}
