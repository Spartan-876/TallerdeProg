package ejervectores;

import java.util.Scanner;
//buscar un elemento en el vector
public class ejer06 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int []lstnum={1,2,3,4,5,6,7,8,9,10,11,22,33,44,55};
        int num,pos=0;
        boolean valor=false;
        System.out.println("Ingrese el número a buscar:");
        num= lector.nextInt();
        lector.nextLine();
        for (int i=0;i<lstnum.length;i++) {
            if (num == lstnum[i]) {
                pos=i;
                valor=true;
                break;
            }
        }
        if (valor){
            System.out.println("Se encontró su num en la posición " + pos);
        }else {
            System.out.println("No se encontró su número");
        }
    }
}
