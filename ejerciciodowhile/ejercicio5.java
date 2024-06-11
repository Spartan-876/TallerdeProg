package ejerciciodowhile;
/*
    Realizar un programa para adivinar un número de 1 al 10;
 */
import java.util.Random;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        Random rdn = new Random();
        int num,aleatorio;
        aleatorio=rdn.nextInt(10)+1;
        do{
            System.out.println("Ingrese el número");
            num=lector.nextInt();
        }while (num!=aleatorio);
        System.out.println("Adivinaste");
    }
}