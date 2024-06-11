package ejerciciosWhile;

/*
    Realice un programa que permita ingresar la cantidad de números a ingresar
    y que de como respuesta la cantidad de números positivos y negativos ingresados
 */

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,nump=0,numn=0,cantnum,cont=1;
        System.out.println("Ingrese la cantidad de números");
        cantnum=lector.nextInt();
        while (cont<=cantnum){
            System.out.println("Ingrese el número");
            num=lector.nextInt();
            if (num<0){
                numn++;
            }else {
                nump++;
            }
            cont++;
        }
        System.out.println("Cantidad de números positivos: "+nump);
        System.out.println("Cantidad de números negativos: "+numn);
    }
}
