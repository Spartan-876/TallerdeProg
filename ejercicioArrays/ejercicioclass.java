package ejercicioArrays;

import java.util.Scanner;

public class ejercicioclass {
    public static void main(String[] ignoredArgs) {
        Scanner lector=new Scanner(System.in);
        int space=10,rpta,index=0,indexmod;
        String []lstnombre=new String[space];
        double[]lstsueldo=new double[space];
        do{
            System.out.printf("""
                    %n=====================
                            MENÚ
                    =====================
                        1. Registrar
                        2. Modificar
                        3. Listar
                        4. Salir
                    =====================
                    """);
            do {
                System.out.println("Ingrese opción [1-4]");
                rpta= lector.nextInt();
            } while (rpta<1 || rpta>4);
            lector.nextLine();
            switch (rpta){
                case 1:
                    if (index<=space) {
                        System.out.println("Selección de menú Registrar");
                        System.out.println("Ingrese el nombre");
                        lstnombre[index] = lector.nextLine();
                        System.out.println("Ingrese el sueldo");
                        lstsueldo[index] = lector.nextDouble();
                        index++;
                    } else {
                        System.out.println("Lista completa");
                    }
                    break;
                case 2:
                    System.out.println("Seleccionó de menú Modificar");
                    if (index == 0) {
                        System.out.println("No hay registros para modificar.");
                    } else {
                        System.out.println("""
                                Elija qué desea modificar:
                                1. Nombre
                                2. Sueldo
                                """);
                        int opcionModificar = lector.nextInt();
                        lector.nextLine(); // Limpiar el buffer
                        switch (opcionModificar) {
                            case 1:
                                System.out.println("Ingrese el nombre del registro a modificar");
                                String nombreModificar = lector.nextLine();
                                boolean encontrado = false;
                                for (int i = 0; i < index; i++) {
                                    if (lstnombre[i].equalsIgnoreCase(nombreModificar)) {
                                        System.out.println("Ingrese el nuevo nombre");
                                        String nuevoNombre = lector.nextLine();
                                        lstnombre[i] = nuevoNombre;
                                        encontrado = true;
                                        System.out.println("Nombre modificado.");
                                        break;
                                    }
                                }
                                if (!encontrado) {
                                    System.out.println("Nombre no encontrado.");
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese el sueldo del registro a modificar");
                                double sueldoModificar = lector.nextDouble();
                                boolean encontradoSueldo = false;
                                for (int i = 0; i < index; i++) {
                                    if (lstsueldo[i] == sueldoModificar) {
                                        System.out.println("Ingrese el nuevo sueldo");
                                        double nuevoSueldo = lector.nextDouble();
                                        lstsueldo[i] = nuevoSueldo;
                                        encontradoSueldo = true;
                                        System.out.println("Sueldo modificado.");
                                        break;
                                    }
                                }
                                if (!encontradoSueldo) {
                                    System.out.println("Sueldo no encontrado.");
                                }
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Selección de menú Listar");
                    System.out.printf("%nPos  Nom        Sld  ");
                    for (int i=0;i<index;i++){
                        System.out.printf("%n %d\t %-10.10s\t%.2f",(i+1),lstnombre[i],lstsueldo[i]);
                    }
                    break;
            }

        }while (rpta!=4);
    }
}
