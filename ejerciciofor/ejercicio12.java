package ejerciciofor;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int cant;
        float suma = 0;
        do {
            System.out.println("Ingrese la cantidad");
            cant=lector.nextInt();
        }while (cant<=0);
        for (int i=1;i<=cant;i++){
            suma+=((float) 1 /i);
        }
        System.out.printf("La suma de los números armonicos es: %.2f",suma);
    }
}
