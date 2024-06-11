package ejerciciosmatrices;
//matriz por escalar
import java.util.Scanner;

public class enun15 {
    public static void main(String[] args) {
        Scanner lector =new Scanner(System.in);
        int num;
        int [][]matDig={
            {1,7,2,6},
            {9,3,7,8},
            {4,9,1,2},
            {1,5,7,9}
        };
        System.out.println("Ingrese el escalar");
        num=lector.nextInt();
        System.out.println("La nueva matriz es:");
        for(int i=0;i<matDig.length;i++){
            for(int j=0;j<matDig.length;j++){
                System.out.print((matDig[i][j]*num)+" ");
            }
            System.out.println();
        }
    }

}
