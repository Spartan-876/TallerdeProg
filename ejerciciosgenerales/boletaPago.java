package ejerciciosgenerales;

import java.util.Date;
import java.util.Scanner;

public class boletaPago {
    public static void main(String[] args) {
            // Función scanner
            Scanner lector = new Scanner(System.in);

            // Declaracion de variables
            String nombrec, nombrep1, nombrep2;
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

            //Emision de boleta
            System.out.printf("""
                    \n###############################
                               TIENDA ABC
                    ###############################
                    ID: 0000255145

                               COMPRAS
                          AV. SAENZ PEÑA 376
                              CHICLAYO
                        LOTE: B      TERM:5268
                    ###############################
                    FECHA:%tD   HORA:%tT
                    VEND:JUAN        CLI:%S
                    %d %S (%.2f)
                    %d %S (%.2f)

                    PAGO TOTAL: S/%.2f

                    ###############################
                    VUELVA PRONTO!
                    ###############################
                    """,today,today,nombrec,cantidad1,nombrep1,subprecio1,cantidad2,nombrep2,subprecio2,preciof);
    }
}