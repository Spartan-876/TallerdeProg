package ejerciciosgenerales;
import java.util.Date;
import java.util.Scanner;

public class boletapago22 {
    public static void main(String[] args) {
        // Función scanner
        Scanner lector = new Scanner(System.in);

        // Declaracion de variables
        String nombrec, nombrep1, nombrep2;
        String separacion="###############################";
        String title="Tienda ABC";
        float precio1, precio2, subprecio1, subprecio2,subprecioN,preciof;
        float  desc1=0f, desc2=0f;
        int cantidad1, cantidad2;
        Date today = new Date();

        // Peticion de datos y productos
        System.out.println("Ingrese los datos");
        System.out.println("Ingrese el nombre del cliente:");
        nombrec = lector.nextLine();
        lector.nextLine();

        System.out.println("Ingrese el nombre del producto 1:");
        nombrep1 = lector.nextLine();
        lector.nextLine();

        System.out.println("Ingrese el precio del producto 1:");
        precio1 = lector.nextFloat();
        lector.nextLine();

        System.out.println("Ingrese la cantidad del producto 1:");
        cantidad1 = lector.nextInt();
        lector.nextLine();

        System.out.println("Ingrese el nombre del producto 2:");
        nombrep2 = lector.nextLine();
        lector.nextLine();

        System.out.println("Ingrese el precio del producto 2:");
        precio2 = lector.nextFloat();
        lector.nextLine();

        System.out.println("Ingrese la cantidad del producto 2:");
        cantidad2 = lector.nextInt();
        lector.nextLine();

        // Declaracion de variables
        if (nombrec.equalsIgnoreCase("ANA") || nombrec.equalsIgnoreCase("JUAN")) {
            desc1 += 0.05f;
        }

        subprecio1 = cantidad1*precio1;
        subprecio2 = cantidad2*precio2;

        if (nombrep1.toUpperCase().contains("GAMER")) {
            desc2 = desc2+0.02f;
            subprecio1 = subprecio1-(subprecio1*desc2);
        }
        if (nombrep2.toUpperCase().contains("GAMER")) {
            desc2 = 0f;

            desc2 = desc2+0.02f;
            subprecio2 = subprecio2-(subprecio2*desc2);
        }

        subprecioN = subprecio1+subprecio2;
        preciof = subprecioN-(subprecioN*desc1);

        //Impresión de boleta
        System.out.printf("%n%s%n%21S%n%s%nID: 0000255145%n           COMPRAS%n      AV. SAENZ PEÑA 376%n          CHICLAYO%n    LOTE: B      TERM:5268%n%s%nFECHA:%tD   HORA:%tT%nVEND:JUAN        CLI:%S%n%d %S (%.2f)%n%d %S (%.2f)%n%nPAGO TOTAL: S/%.2f%n%n%s%nVUELVA PRONTO!%n%s%n",separacion,title,separacion,separacion,today,today,nombrec,cantidad1,nombrep1,subprecio1,cantidad2,nombrep2,subprecio2,preciof,separacion,separacion);
    }
}