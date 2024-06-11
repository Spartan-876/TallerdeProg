package ejerciciofor;
//Impares
import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese el limite");
            num=lector.nextInt();
        }while (num<=0);
        for (int i=1;i<=num;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
