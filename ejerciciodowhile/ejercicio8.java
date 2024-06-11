package ejerciciodowhile;
/*
    Realizar un programa que imprima los números pares entre 1 - 50
 */
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cont=2;
        do {
            if (cont%2==0){
                System.out.println(cont);
            }
            cont++;
        }while (cont<=50);
    }
}
