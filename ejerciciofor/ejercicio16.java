package ejerciciofor;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int tab;
        do {
            System.out.println("Ingrese una tabla de multiplicar 1-12");
            tab= lector.nextInt();
        }while (tab<1 | tab>12);
        System.out.println("Tabla del "+tab);
        for (int i=1;i<=12;i++){
            System.out.println(tab+"X"+i+"="+(tab*i));
        }
    }
}
