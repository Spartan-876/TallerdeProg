package ejerciciofor;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,fact=1;
        do {
            System.out.println("Ingrese un número");
            num=lector.nextInt();
        }while (num<0);
        System.out.print(num+"! = ");
        for (int i=1;i<=num;i++){
            System.out.print(i);
            fact*=i;
            if (num!=i){
                System.out.print("*");
            }
        }
        System.out.print(" = "+fact);
    }
}
