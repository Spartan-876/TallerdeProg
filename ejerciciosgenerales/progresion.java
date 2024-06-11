package ejerciciosgenerales;
import java.util.Scanner;

public class progresion {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n1,n2,n3,razon;

        System.out.println("Progresión aritmetica");
        System.out.println("Ingrese 3 numeros");
        n1 = lector.nextInt();
        n2 = lector.nextInt();
        n3 = lector.nextInt();
        lector.nextLine();

        razon = n2-n1;
        if ((n2+razon)==n3){
            System.out.println("si posee una progresión aritmetica");
        }else {
            System.out.println("No posee una progresion aritmetica");
        }
    }
}
