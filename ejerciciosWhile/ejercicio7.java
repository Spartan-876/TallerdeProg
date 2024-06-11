package ejerciciosWhile;

/*
    Realice un programa que convierta de m a cm
    y que finalice cuando el usuario responda no,No,NO,nO;
 */

import java.util.Scanner;

public class ejercicio7{
    public static void main(String[] args) {
        Scanner lector=new Scanner (System.in);
        String rpta;
        boolean ns;
        int m,cm;
        System.out.println("Conversión de unidades (m a cm) : ");

        rpta="si";
        while (rpta.equalsIgnoreCase("si")){
            System.out.println("Ingrese m:");
            m=lector.nextInt();
            lector.nextLine();
            cm=m*100;
            System.out.println("Son "+cm+"cm");
            ns=false;
            while (ns==false){
                System.out.println("¿Desea continuar(si/no)?");
                rpta=lector.nextLine();
                if (rpta.equalsIgnoreCase("si") || rpta.equalsIgnoreCase("no")){
                    ns=true;
                }else{
                    ns=false;
                }
            }
        }
        System.out.println("Fin");
    }
}
