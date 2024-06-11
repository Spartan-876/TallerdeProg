package ejervectores;
//Llenar un vector
import java.util.Scanner;

public class ejer08 {
    public static void main(String[] args) {
        Scanner lector =new Scanner(System.in);
        int []lstnum=new int[5];
        System.out.println("Ingrese valores entre 0 y 10");
        for (int i=0;i<lstnum.length;i++){
            do {
                System.out.println("Valor N°"+(i+1));
                lstnum[i]= lector.nextInt();
                if (lstnum[i]<0 || lstnum[i]>10){
                    System.out.println("Error");
                }
            }while (lstnum[i]<0 || lstnum[i]>10);
        }
        System.out.println("Los valores son:");
        for (int i=0;i<lstnum.length;i++){
            System.out.print(lstnum[i]+" ");
        }
    }
}
