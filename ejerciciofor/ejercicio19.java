package ejerciciofor;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,dig1=0,dig,cont=0;
        do {
            System.out.println("Ingrese un número");
            num=lector.nextInt();
        }while (num<0);
        do {
            System.out.println("Ingrese el dígito");
            dig=lector.nextInt();
        }while (dig<0|dig>9);
        for (int i=num;i!=0;i/=10){
            dig1=num%10;
            if (dig1==dig){
                cont++;
            }
            num/=10;
        }
        System.out.println("El "+dig+" se repite "+cont+" veces");
    }
}
