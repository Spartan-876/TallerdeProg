package ejerciciofor;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,dig,par=0,impar=0;
        do {
            System.out.println("Ingrese un número");
            num=lector.nextInt();
        }while (num<0);
        for (int i=num;i!=0;i/=10){
            dig=num%10;
            if (dig%2==0){
                par+=dig;
            }else {
                impar+=dig;
            }
            num/=10;
        }
        System.out.println("Suma de digitos pares: "+par);
        System.out.println("Suma de  digitos impares "+impar);
    }
}
