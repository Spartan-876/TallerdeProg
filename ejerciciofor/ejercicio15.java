package ejerciciofor;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número ");
        num=lector.nextInt();
        System.out.println("sus divisores son: ");
        for (int i=1;i<=num;i++){
            if (num%i==0){
                System.out.println(i);
            }
        }
    }
}
