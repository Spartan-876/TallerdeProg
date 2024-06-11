package ejerciciosgenerales;
import java.util.Scanner;

public class mencionDocente {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String separacion = "-------------------------------------";
        String title = "Meciones", mencion;
        int nota;

        System.out.printf("%n%s%n%20S%n%s%n", separacion, title, separacion);
        System.out.print("Ingrese la nota del alummno:  ");
        nota = lector.nextInt();

        mencion = (nota > 18 & nota <= 20) ? "Excelente" :
                        (nota > 15 & nota <= 18) ? "Bueno" :
                            (nota >= 13 & nota <= 15) ? "Regular" :
                                (nota < 13 & nota >= 0) ? "Deficiente" :"Error";
        System.out.printf("%s%nUsted obtuvo la mención de %s%n%s",separacion,mencion,separacion);

    }
}
