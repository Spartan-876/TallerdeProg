package ejerciciosgenerales;

import java.util.Scanner;

public class sem11 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int [][]matriz=new int[4][2];
        
        //llenado
        for(int fila=0;fila<matriz.length;fila++){
            for(int col=0;col<matriz[0].length;col++){
                System.out.println("Ingresar el valor ["+fila+"]["+col+"]");
                matriz[fila][col]=lector.nextInt();
            }
        }

        //Muestra
        System.out.println("Salida de Matriz");
        for(int fila=0;fila<matriz.length;fila++){
            for(int col=0;col<matriz[0].length;col++){
                System.out.printf("\t%d",matriz[fila][col]);
            }
            System.out.printf("%n");
        }

    }
}
