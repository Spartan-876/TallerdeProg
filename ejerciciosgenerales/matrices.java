package ejerciciosgenerales;

import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int [][]lstpuntos=new int[3][3];
        int c,d;
        for (int a=0;a<lstpuntos.length;a++){
            for (int b=0;b<lstpuntos[0].length;b++){
                System.out.println("Ingresa num pos"+a+","+b);
                lstpuntos[a][b]= lector.nextInt();
            }
        }

        for (int a=0;a<1;a++){
            c=a+1;
            d=a+2;
            for (int b=0;b<lstpuntos[0].length;b++){
                System.out.println(lstpuntos[b][a]+""+lstpuntos[b][c]+""+lstpuntos[b][d]);
            }
        }
    }
}
