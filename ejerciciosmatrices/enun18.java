package ejerciciosmatrices;
//Matriz con números aleatorios entre 0-9
import java.util.Random;

public class enun18 {
    public static void main(String[] args) {
        Random ns=new Random();
        int num;
        int [][]matramdom=new int[3][3];
        for(int i=0;i<matramdom.length;i++){
            for(int j=0;j<matramdom[0].length;j++){
                num=ns.nextInt(10);//el 10 indica que los números aleatorio van entre 0-9
                matramdom[i][j]=num;
            }
        }
        System.out.println("Matriz con números aleatorios(0-9)");
        for(int i=0;i<matramdom.length;i++){
            for(int j=0;j<matramdom.length;j++){
                System.out.print(matramdom[i][j]+" ");
            }
            System.out.println();
        }
    }
}
