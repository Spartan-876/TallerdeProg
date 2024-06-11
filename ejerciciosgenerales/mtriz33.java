package ejerciciosgenerales;

import java.util.Scanner;

public class mtriz33 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int e,f;
        int [][]lstnum=new int[3][3];
        int []lstsuma=new int[3];
        double []lstprom=new double[3];
        for (int i=0;i<lstnum.length;i++){
            for (int a=0;a<lstnum[0].length;a++){
                System.out.println("Ingrese num pos ["+i+","+a+"]");
                lstnum[i][a]= lector.nextInt();
            }
        }
        for (int c=0;c<lstnum.length;c++){
            for (int d=0;d<1;d++){
                e=d+1;
                f=d+2;
                lstsuma[c]=lstnum[c][d]+lstnum[c][e]+lstnum[c][f];
            }
        }
        for (int i=0;i<lstprom.length;i++){
            lstprom[i]= (double) lstsuma[i] /3;
        }
        for (int i=0;i<lstsuma.length;i++){
            System.out.println("sum "+i);
            System.out.println(lstsuma[i]);
        }

        for (int i=0;i<lstsuma.length;i++){
            System.out.println("prom "+i);
            System.out.println(lstprom[i]);
        }
    }
}
