package ejerciciofor;

import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int mcd=0,total=1;
        System.out.println("Ingrese el primer num");
        int num1=lector.nextInt();
        System.out.println("Ingreese el segundo num");
        int num2=lector.nextInt();
        num1=Math.abs(num1);
        num2=Math.abs(num2);
        for (int i=1;i<=12;i++){
            if (num1%i==0 & num2%i==0){
                mcd=i;
            }
        }
        System.out.println("EL MCD es: "+mcd);
    }
}
