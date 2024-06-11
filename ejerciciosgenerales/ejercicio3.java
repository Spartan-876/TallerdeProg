package ejerciciosgenerales;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //Escribir un programa que, dado un monto total, lo descomponga en monto a pagar
        //lo descomponga en monto a pagar e IGV (18%)

        //Variables
        float mtotal,mpagar,igv;

        //Titulo
        System.out.print("""
                ----------------------------------
                    Descomposición de Precio
                ----------------------------------
                """);
        System.out.print("Monto total:   S/"); mtotal = lector.nextFloat();

        //Operación;
        mpagar = mtotal*0.82f;
        igv = mtotal*0.18f;

        //Resultados
        System.out.printf("""
                ----------------------------------
                Monto a pagar: S/%.2f
                IGV:           S/%.2f
                ----------------------------------
                """,mpagar,igv);

    }
}
