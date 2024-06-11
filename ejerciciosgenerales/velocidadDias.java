package ejerciciosgenerales;
import java.util.Scanner;

public class velocidadDias {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final long luz = 299792458;
        long dias,distancia,segundos;

        System.out.println("Calculadora de distancia rrecorrida según la cantidad de dias");
        System.out.println("Ingrese la cantidad de días: ");
        dias = lector.nextLong();
        lector.nextLine();

        segundos = (dias*86400);
        distancia = luz*segundos;

        System.out.println("La distancia recorrida es de: "+ distancia+"m/s");

    }
}
