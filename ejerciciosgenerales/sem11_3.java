package ejerciciosgenerales;

import java.util.Arrays;

public class sem11_3 {
    public static void main(String[] args) {
        int [][]matriz={
                {20,2,3,4},
                {12,6,7,8},
                {9,10,17,5},
                {13,14,18,16},
                {11,15,19,1},
        };
        int []vector=new int[20];

        int contador=0;
        for (int fila=0;fila<matriz.length;fila++){
            for (int col=0;col<matriz[0].length;col++) {
                vector[contador] = matriz[fila][col];
                contador++;
            }
        }

        for (int i=0;i<vector.length;i++){
            System.out.printf("%n[%d]->%d",i,vector[i]);
        }

        Arrays.sort(vector);

        contador=0;
        for (int col=0;col<matriz[0].length;col++){
            for (int fila=0;fila<matriz.length;fila++) {
                    matriz[fila][col] = vector[contador] ;
                    contador++;
            }
        }

        //Muestra
        System.out.printf("%nSalida de Matriz%n");
        for(int fila=0;fila<matriz.length;fila++){
            for(int col=0;col<matriz[0].length;col++){
                System.out.printf("\t%d",matriz[fila][col]);
            }
            System.out.printf("%n");
        }
    }
}
