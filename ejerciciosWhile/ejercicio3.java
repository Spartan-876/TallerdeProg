package ejerciciosWhile;

//Realice un programa que permita ingresar un número positivo y muestre el factorial de mismo

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num,fact;
        double result=1;
        System.out.println("Ingrese un número: ");
        num=lector.nextInt();
        fact=num;
        while (fact>=1){
            result=result*fact;
            fact--;
        }
        System.out.println(num+"! es: "+result);
    }
}
