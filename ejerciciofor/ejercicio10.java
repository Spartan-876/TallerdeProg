package ejerciciofor;
// números triangulares
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int cant,result=1,cons=1;
        do {
            System.out.println("Ingrese la cantidad");
            cant= lector.nextInt();
        }while (cant<=0);
        for (int i=1;i<=cant;i++){
            cons+=1;
            System.out.println(result);
            result=result+cons;
        }
    }
}
