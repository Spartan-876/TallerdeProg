package ejerciciosgenerales;
import java.util.Scanner;

public class celulares {
    public static void main(String[] args) {
        Scanner lector =new Scanner(System.in);
        String separacion="-----------------------------------";
        String title="Tienda de celulares";
        String marca;
        byte plazo;
        float plan,promocion;

        System.out.printf("%n%s%n%26S%n%s%n",separacion,title,separacion);
        System.out.println("Ingrese la marca del celular:");
        marca=lector.nextLine();
        lector.nextLine();
        System.out.println("Ingrese el plazo de de pago:");
        plazo=lector.nextByte();

        marca=marca.toLowerCase();

        plan =switch (marca){
          case "motorola" -> 29.9f;
          case "lg"->36.0f;
          case "samsung" -> 46.8f;
          case "huawei"->62.0f;
          case "iphone" -> 71.0f;
          default -> 0;
        };

        promocion= (plazo>=0 && plazo<=6)? 13.2f:
                        (plazo>6 && plazo<=12)? 12.0f:
                                (plazo>12 && plazo<=18)? 11.2f: 0;

        if (promocion==0 || plan==0) {
            System.out.println(separacion);
            System.out.println("ERROR");
            System.out.println(separacion);
        }else{
            System.out.println(separacion);
            System.out.println("Su plan es de : "+plan);
            System.out.printf("Su descuento de promoción es: %.2f%n",promocion);
            System.out.println(separacion);
        }


    }
}
