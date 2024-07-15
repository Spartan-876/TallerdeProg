package programacionoo.progalumno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        clsAlumno obj = new clsAlumno();
        Scanner Leer= new Scanner(System.in);

        int opc=0;
        String Est_Codigo;


        do{
            System.out.println("MENU");
            System.out.println("[1] Registrar Alumno");
            System.out.println("[2] Modificar Notas");
            System.out.println("[3] Listar");
            System.out.println("[4] Reportar Aprobados|Desaprobados");
            System.out.println("[5] Salir");

            do{
                System.out.println("Ingresar Opción [1-5]: ");
                opc= Leer.nextInt();
            }while(opc<1 | opc>5);

            switch(opc){
                case 1:
                    LimpiarPantalla(3);
                    //[1] Registrar Alumno
                    Leer.nextLine();
                    obj.Registrar();
                    LimpiarPantalla(3);
                    break;
                case 2:
                    LimpiarPantalla(3);
                    Leer.nextLine();

                    //[2] Modificar Notas
                    System.out.println("Opción 02: Modificar Notas de Alumno");
                    System.out.println("=====================================");

                    if(obj.getCantidad()>0) {
                        System.out.println("Ingresar Código: ");
                        Est_Codigo = Leer.nextLine();

                        obj.modificar(Est_Codigo);
                    }else{
                        System.out.println("MENSAJE: Listas vacias");
                    }
                    LimpiarPantalla(3);
                    break;
                case 3:
                    LimpiarPantalla(2);
                    //[3] Listar
                    obj.mostrar();
                    LimpiarPantalla(2);
                    break;
                case 4:

                    //[4] Reportar Aprobados|Desaprobados
                    System.out.println("Opción 04: Reporte");
                    System.out.println("=====================================");
                    obj.Reporte();
                    break;
            }
        }while(opc!=5);

        System.out.println("FIN");

    }

    private static void LimpiarPantalla(int CantidadLineas){

        for(int i=0;i<=CantidadLineas;i++){
            System.out.printf("\n");
        }

    }
}
