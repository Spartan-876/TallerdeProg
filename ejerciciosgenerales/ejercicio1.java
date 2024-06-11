package ejerciciosgenerales;
import java.util.Scanner;

public class ejercicio1 {
    //Escribir un programa que calcule el área de una figura geométrica cualquiera.
    //Área del triangulo
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);

        //Variables
        float base,altura,area;

        //titulo
        System.out.println("""
                --------------------------
                    Área del triángulo
                --------------------------""");

        //lectura de datos
        System.out.print("Base:   ");base = lector.nextFloat();
        System.out.print("Altura: ");altura = lector.nextFloat();

        //Operación
        area = (base*altura)/2f;

        //Resultado
        System.out.printf("""
                --------------------------
                Área:   %.1fu²
                --------------------------
                """,area);


    }
}
