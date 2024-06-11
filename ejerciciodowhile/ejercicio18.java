package ejerciciodowhile;
/*
    Realizar un menú de opciones y salga
    cuando se seleccione la opcion de salida
 */
import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int num;
        do {
            System.out.printf("""
                    ------------------
                    -     Menú       -
                    ------------------
                    - 1. Pollito     -
                    - 2. Chancho     -
                    - 3. Pez         -
                    - 4. Salir       -
                    ------------------
                    """);
            num= lector.nextInt();
        }while (num!=4);
    }
}
