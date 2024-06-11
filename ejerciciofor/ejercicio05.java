package ejerciciofor;

import java.util.Scanner;

public class ejercicio05 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,cant=0;
        System.out.println("Ingrese un número");
        num=lector.nextInt();
        if (num==0){
            cant=1;
        }else {
            for (int i=num;i!=0;i/=10){
                cant++;
            }
        }
        System.out.println("La cantidad de dígitos es: "+cant);
    }
}
