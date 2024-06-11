package ejerciciosgenerales;

import java.util.Scanner;

public class sem11_2 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int [][]matriz={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20},
        };
        int [][]matriz_vacia=new int[5][4];

        /*llenado
            for(int fila=0;fila<matriz.length;fila++){
                for(int col=0;col<matriz[0].length;col++){
                    System.out.println("Ingresar el valor ["+fila+"]["+col+"]");
                    matriz[fila][col]=lector.nextInt();
                }
            }
         */
        System.arraycopy(matriz,0,matriz_vacia,0,matriz.length);
        //Muestra
        System.out.println("Salida de Matriz");
        for(int fila=0;fila<matriz_vacia.length;fila++){
            for(int col=0;col<matriz_vacia[0].length;col++){
                System.out.printf("\t%d",matriz_vacia[fila][col]);
            }
            System.out.printf("%n");
        }
    }
}
