package ejervectores;
//mostrar el vector ordenado
import java.util.Arrays;
import java.util.Scanner;

public class ejer07 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int []lstnum={11,9,6,3,1,4,7,8,5,2};
        Arrays.sort(lstnum);
        System.out.println("VECTOR ORDENADO");
        for (int i=0;i<lstnum.length;i++){
            System.out.print(lstnum[i]+" ");
        }
    }
}
