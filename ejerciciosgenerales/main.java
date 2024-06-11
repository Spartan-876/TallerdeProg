package ejerciciosgenerales;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num,nota,cont=0,acum = 0;
        double prom,porcentaje;
        for (int i=1;i<=5;i++){
            do {
                System.out.println("Ingrese una nota "+i+" :");
                nota= lector.nextInt();
            }while (nota<0 | nota>20);
            cont= (nota>=15 & nota<=20)? cont+1: cont;
            acum= (nota>=15 & nota<=20)? acum+nota: acum;
        }
        prom=(double) acum/cont;
        porcentaje=((double) cont/5)*100;
        System.out.println("cantidad   15-20 "+cont);
        System.out.println("sumatoria  15-20 "+acum);
        System.out.println("Promedio   15-20 "+prom);
        System.out.println("Procentaje 15-20 "+porcentaje+"%");
    }
}
