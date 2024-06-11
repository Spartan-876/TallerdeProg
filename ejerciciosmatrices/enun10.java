package ejerciciosmatrices;
//buscar un elemento en una matriz
import java.util.Scanner;

public class enun10 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int [][]matDig={
            {1,7,2},
            {9,3,7},
            {4,9,1},
            {1,5,7}
        };
        boolean encontrado=false;
        int num;
        do{
            System.out.println("Ingrese el valor a buscar(0-9)");
            num=lector.nextInt();
        }while(num<0 | num>9);
        for(int i=0;i<matDig.length;i++){
            for(int j=0;j<matDig[0].length;j++){
                if (matDig[i][j]==num) {
                    System.out.println("Encontrado en la pos ["+i+","+j+"]");
                    encontrado=true;
                }
            }
        }
        if (!encontrado){
            System.out.println("No hay su valor");
        }
    }
}
