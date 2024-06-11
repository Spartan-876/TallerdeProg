package ejerciciodowhile;
/*
    Realizar un programa que permita y verifique
    que el año ingresado sea bisiesto.
 */
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
            int año;
            do {
                System.out.println("Ingrese un año bisiesto:");
                año=lector.nextInt();
            }while (año%4!=0 || (año%100==0 && año%400!=0));
        System.out.println("El año es bisiesto");
    }
}