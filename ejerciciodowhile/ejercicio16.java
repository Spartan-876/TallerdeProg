package ejerciciodowhile;
/*
    Realizar un programa que permita y verifique ingresar
    un número  que sea cuadrado perfecto.
 */
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,raiz;
        do {
            System.out.println("Ingrese un cuadrado perfecto");
            num=lector.nextInt();
            raiz= (int) Math.sqrt(num);
            raiz=raiz*raiz;
        }while (raiz!=num);
        System.out.println("Correcto");
    }
}
