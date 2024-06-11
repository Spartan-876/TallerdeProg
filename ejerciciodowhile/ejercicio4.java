package ejerciciodowhile;
/*
    Realizar un programa que imprima la tabla de multiplicar (1-12) de un
    número n.
 */
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num,cont=1,result;
        System.out.println("Ingrese un número");
        num=lector.nextInt();
        do{
            result=num*cont;
            System.out.println(num+"x"+cont+"="+result);
            cont++;
        }while(cont<=12);
    }
}