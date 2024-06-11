package ejerciciosgenerales;
import java.util.Scanner;

public class FuncionPorcentaje {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        //Variables
        int a,b;

        //Mensaje
        System.out.println("""
                -----------------------------
                Verificar divisibilidad de 2
                -----------------------------""");
        System.out.print("Ingrese su número a verificar: ");
        a = leer.nextInt();
        leer.nextLine();

        //Operación
        b = a % 2;
        if (b == 0){
            System.out.println("El número si es divisible entre 2");
        }
        else {
            System.out.println("El número no es divisible entre 2");
        }
    }
}
