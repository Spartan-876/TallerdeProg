package ejervectores;
//Reemplazar una posición especifica del vector
import java.util.Scanner;

public class ejer09 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String []lstnombre={"Ana","Marcos","Juana","Romeo","Carlos"};
        int pos;
        do {
            System.out.println("Ingrese la posición que desea reemplazar (0-4)");
            pos= lector.nextInt();
        }while (pos>=lstnombre.length | pos<0);
        lector.nextLine();
        System.out.println("Ingrese el reemplazo");
        lstnombre[pos]= lector.nextLine();
        System.out.println("Nuevo vector");
        for (int i=0;i<lstnombre.length;i++){
            System.out.print(lstnombre[i]+" ");
        }
    }
}
