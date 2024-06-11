package ejerciciosWhile;

/*
   Realice un programa de la secuencia de fibonacci ,
   que permita ingresar la cantidad de números que quiera
   el usuario
 */

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num,result,ans=1,preans=0,cont=3;
        System.out.println("Secuencia de fibonacci");
        System.out.println("Ingrese la cantidad de números");
        num= lector.nextInt();
        System.out.println(preans);
        System.out.println(ans);
        while (cont<=num){
            result=preans+ans;
            System.out.println(result);
            preans=ans;
            ans=result;
            cont++;
        }
    }
}
