package ejerciciofor;

import java.util.Scanner;

public class ejercicio09 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,suma=0,dig;
        System.out.println("Ingrese un número: ");
        num =lector.nextInt();
        num=Math.abs(num);
        for (int i=num;i!=0;i/=10){
            dig=i%10;
            suma+=dig;
        }
        System.out.println("La suma de digitos es: "+suma);
    }
}
