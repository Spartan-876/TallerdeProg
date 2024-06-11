package ejerciciofor;

import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num;
        System.out.println("Tabla de multiplicar de un número");
        do {
            System.out.println("Ingrese un número");
            num= lector.nextInt();
        }while (num<0);
        for (int i=1;i<=12;i++){
            System.out.println(i+"x"+num+"="+(i*num));
        }
    }
}
