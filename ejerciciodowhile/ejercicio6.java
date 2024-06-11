package ejerciciodowhile;

import java.util.Scanner;

/*
    Realizar un programa que pida un número y muestre su factorial.
 */
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,cont=0,result=1;
        do{
            System.out.println("Ingrese un número");
            num=lector.nextInt();
        }while (num<0);
        cont=num;
        do{
            result=result*cont;
            cont--;
        }while (cont>=1);
        System.out.println(num+"! = "+result);
    }
}