package ejerciciosgenerales;

import java.util.Date;
import java.util.Scanner;

public class boleta3 {
    
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int cant,opc;
        double pagoneto = 0,pagototal,igv;
        boolean ver=false;
        Date fecha=new Date();
        String nom = "";
        do {
            System.out.println("Ingrese la cantidad de productos:");
            cant= lector.nextInt();
        }while (cant<=0);
        lector.nextLine();
        String []lstproductos=new String[cant];
        int []lstcantidad=new int[cant];
        double []lstprecios=new double[cant];
        double []lstpreciototal=new double[cant];
        do {
            System.out.printf("""
                    \n================================
                            LISTA DE OPCIONES
                    ================================
                        1. Nombre de cliente
                        2. Ingreso de productos
                        3. Imprimir boleta
                        4. Salir
                    ================================
                    
                    """);
            do {
                System.out.println("Ingrese su opción");
                opc= lector.nextInt();
            }while (opc<1 || opc>4);
            lector.nextLine();
            switch (opc){
                case 1:
                    do {
                        System.out.println("Ingrese el nombre del cliente ");
                        nom= lector.nextLine();
                    }while (nom.equals(""));
                    break;
                case 2:
                    for (int i=0;i<lstproductos.length;i++){
                        System.out.println("Ingrese el nombre del producto "+(i+1)+" :");
                        lstproductos[i]= lector.nextLine();
                        do {
                            System.out.println("Ingrese la cantidad del producto: ");
                            lstcantidad[i]= lector.nextInt();
                        }while (lstcantidad[i]<1);
                        lector.nextLine();
                        do{
                            System.out.println("Ingrese el precio del producto: ");
                            lstprecios[i]= lector.nextDouble();
                        }while (lstprecios[i]<1);
                        lector.nextLine();
                        lstpreciototal[i]=(double) lstcantidad[i]*lstprecios[i];
                    }
                    ver=true;
                    break;
                case 3:
                    if (ver==false | nom=="") {
                        System.out.println("INGRESE DATOS!");
                    }else {
                    System.out.printf("""
                            ==============================
                                     TIENDA ABC
                            ==============================
                            ID: 0000255145
                            %n
                                       COMPRAS
                                  AV. SAENZ PEÑA 376
                                      CHICLAYO
                                LOTE: B      TERM:5268
                            %n
                            ==============================
                             FECHA:%td/%tm/%ty    HORA:%tR
                             VEND:JUAN         CLI:%.6S
                            ==============================%n
                            """, fecha, fecha, fecha, fecha, nom);
                    for (int i = 0; i < lstproductos.length; i++) {
                        System.out.printf("""
                                %.20S
                                    %d x S/%.2f    S/%.2f
                                """, lstproductos[i], lstcantidad[i], lstprecios[i], lstpreciototal[i]);
                        pagoneto += lstpreciototal[i];
                    }
                    igv=pagoneto*0.18f;
                    pagototal=pagoneto+igv;
                    System.out.printf("""
                            %n
                            PAGO NETO:  %.2f
                            IGV:        %.2f
                            PAGO TOTAL: %.2f
                            %n
                            =============================
                            VUELVA PRONTO!
                            =============================
                           \s""", pagoneto,igv,pagototal);
                    }
                    break;
            }
        }while (opc!=4);
    }
}
