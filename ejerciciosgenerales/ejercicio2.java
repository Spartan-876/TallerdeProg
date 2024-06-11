package ejerciciosgenerales;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        //Escribir un programa que resuelva una formula matemática
        //que utilice al menos 3 variables.

        Scanner lector = new Scanner(System.in);

        //Variables
        float a,b,c,d;

        //Título
        System.out.print("""
                --------------------------
                    Promedio Aritmetico
                --------------------------
                """);

        //Introducción de datos
        System.out.print("Nota 1: "); a=lector.nextFloat();
        System.out.print("Nota 2: "); b=lector.nextFloat();
        System.out.print("Nota 3: "); c=lector.nextFloat();

        //Operación
        d= (a+b+c)/3;

        //Resultados
        System.out.printf("""
                --------------------------
                Promedio: %.1f
                --------------------------
                """,d);

    }
}
