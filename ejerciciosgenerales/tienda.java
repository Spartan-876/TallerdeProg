package ejerciciosgenerales;
import java.util.Scanner;

public class tienda {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        float precioproducto;
        byte numerodedia;

        System.out.println("Devolucion de productos");
        System.out.println("Ingrese el precio del producto: ");
        precioproducto = lector.nextFloat();
        lector.nextLine();
        System.out.println("Ingrese el dia de compra (1-7):" );
        numerodedia = lector.nextByte();
        lector.nextLine();

        if (precioproducto>=50 && precioproducto<=80 && numerodedia==1){
            System.out.println("Procede la devolución");
        } else if ( precioproducto>120 && (numerodedia != 3 && numerodedia != 4)) {
            System.out.println("Procede la devolución");
        }else {
            System.out.println("No procede la devoluación");
        }

    }
}
