package ejerciciofor;

import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int cant,num,sum = 0;
        float prom;
        do {
            System.out.println("Ingrese la cantidad de números");
            cant=lector.nextInt();
        }while (cant<=1);
        for (int i=1;i<=cant;i++){
            do {
                System.out.println("Ingrese el número");
                num = lector.nextInt();
            }while (num<0);
            sum=sum+num;
        }
       prom= (float) sum /cant;
        System.out.printf("El promedio es: %.2f",prom);
    }
}
