package ejerciciosgenerales;

import java.util.Scanner;

public class menuboleta {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String nom="ns",apell="ns";
        int opc;
        double salario=0,total;
        do{
            System.out.printf("""
                    *******************************
                    *       MENÚ DE OPCIONES      *
                    *******************************
                    * 1. Ingresar Empleado        *
                    * 2. Ingresar Salario Mensual *
                    * 3. Emitir boleta            *
                    * 4. Salir                    *
                    ******************************
                    """);
            opc=lector.nextInt();
            lector.nextLine();
            switch (opc){
                case 1:
                    System.out.println("****************");
                    System.out.println("Nombre: ");
                    nom=lector.nextLine();
                    System.out.println("Apellido:");
                    apell=lector.nextLine();
                    System.out.println("****************");
                    break;
                case 2:
                    do {
                        System.out.println("Salario mensual");
                        salario= lector.nextDouble();
                    }while (salario<=0);
                    break;
                case 3:
                    if (apell.equals("ns") || nom.equals("ns") || salario==0 ){
                        System.out.println("Faltan datos");
                    } else {
                        total = salario * 12;
                        System.out.printf("""
                                    *************************************************
                                    * RESUMEN DE BOLETAS DE PAGO                    *
                                    *************************************************
                                    * Nombre del empleado:   %-15s        *
                                    * Apellido del empleado: %-15s        *
                                    * Tipo: Contratado                              *
                                    * Salario Ene: %4.2f    Salario Feb: %4.2f  *
                                    * Salario Mar: %4.2f    Salario Abr: %4.2f  *
                                    * Salario May: %4.2f    Salario Jun: %4.2f  *
                                    * Salario Jul: %4.2f    Salario Ago: %4.2f  *
                                    * Salario Sep: %4.2f    Salario Oct: %4.2f  *
                                    * Salario Nov: %4.2f    Salario Dic: %4.2f  *
                                    *************************************************
                                    * Total: %.2f                               *
                                    * Descuento: 600.0                              *
                                    *************************************************
                                    """,nom,apell,salario,salario,salario,salario,salario,salario,salario,salario,salario,salario,salario,salario,total);
                    }
                    break;
            }
        }while(opc!=4);
    }
}
