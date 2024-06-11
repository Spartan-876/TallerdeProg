package ejerciciofor;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,digit,sum=0,cant=0;
        do {
            System.out.println("Ingrese un número");
            num=lector.nextInt();
        }while (num<=0);
        for (int i=num;i!=0;i/=10){
            cant++;
        }
        for (int i=num;i!=0;i/=10) {
            digit = i % 10;
            sum += Math.pow(digit,cant);
        }
        if (sum==num){
            System.out.println("Es número de Armstrong");
        }else {
            System.out.println("No es número de Armstrong");
        }
    }
}
