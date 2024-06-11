package ejerciciosgenerales;
import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int num1,resto;

        System.out.println("Calculadora de divisibilidad entre 2");
        System.out.println("Ingrese el número a calcular:");
        num1 = lector.nextInt();
        lector.nextLine();

        resto = num1%2;
        if (resto == 0){
            System.out.println("El número si es divisible entre 2");
        } else{
            System.out.println("El número no es divisible entre 2");
        }
    }
}
