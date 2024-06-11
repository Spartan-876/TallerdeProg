package ejerciciosWhile;

//Validar que la edad ingresada sea positiva y muestre si es mayor o menor de edad;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        int edad=0;
        while (edad<=0){
            System.out.println("Ingrese su edad");
            edad=lector.nextInt();
        }
        if (edad<18){
            System.out.println("Es menor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }

    }
}
