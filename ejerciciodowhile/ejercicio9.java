package ejerciciodowhile;
/*
    Realice un programa que permita ingresar nombres
    y finalice cuandoo se ingrese fin y sus variantes.
 */
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String name;
        do {
            System.out.println("Ingrese el nombre");
            name=lector.nextLine();
        }while (!name.equalsIgnoreCase("fin"));
    }
}
