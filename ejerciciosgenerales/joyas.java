package ejerciciosgenerales;
import java.util.Scanner;

public class joyas {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        short valor;

        System.out.println("Aplicación de descuento");
        System.out.println("Ingrese el valor de la compra: ");
        valor = lector.nextShort();
        lector.nextLine();

        if (valor>=2500){
            System.out.println("Si aplica descuento ");
        } else {
            System.out.println("No aplica descuento ");
        }
    }
}
