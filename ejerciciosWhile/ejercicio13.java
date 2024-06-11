package ejerciciosWhile;

/*
    Realice un programa que permita ingresar un número
    y que de como respuesta la tabla de multiplicar del 1-12
 */

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,cont=1,result;
        System.out.println("Ingrese el número:");
        num=lector.nextInt();
        System.out.println("Tabla de multipicar(1-12)");
        while(cont<=12){
            result=cont*num;
            System.out.println(cont+"*"+num+"="+result);
            cont++;
        }
    }
}
