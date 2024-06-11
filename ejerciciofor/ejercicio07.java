package ejerciciofor;
// Pares
import java.util.Scanner;

public class ejercicio07 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese el limite");
            num=lector.nextInt();
        }while (num<=0);
        System.out.println("Numeros Pares: ");
        for (int i=1;i<=num;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
