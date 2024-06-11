package ejerciciosgenerales;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,suma = 0;
        do {
            System.out.println("Ingrese la cantidad");
            num=lector.nextInt();
        }while (num<0);
        int [] array=new int[num];
        System.out.println("Ingrese los valores ");
        for(int i=0;i<array.length;i++){
            array[i]=lector.nextInt();
            suma+=array[i];
        }
        System.out.println("Array Recorrido:");
        System.out.print("{");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
            if (i<(array.length-1)){
                System.out.print(";");
            }
        }
        System.out.println("}");
        System.out.println("La suma es:"+suma);
    }
}
