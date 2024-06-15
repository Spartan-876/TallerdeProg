package programacionoo.ejer01;

import java.util.Scanner;

public class pruebaalumno {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        clsalumno alumno=new clsalumno();
        int opcion;
        boolean llave01=false,llave02=false;

        do{
            System.out.println("""
                    --------------------
                            MENÚ        
                    --------------------
                        1. Registro
                        2. Notas
                        3. Reporte
                        4. Salir
                    --------------------

                    Ingrese su opción: """);
            do{
                opcion=lector.nextInt();
                if (opcion<1 | opcion>4){
                    System.out.println("Error");
                    System.out.println("Ingrese nuevamente");
                }
            }while (opcion<1 | opcion>4);
            lector.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre: ");
                    alumno.setnombre(lector.nextLine());
                    do{
                        System.out.println("Ingrese su edad: ");
                        alumno.setedad(lector.nextInt());
                    }while (alumno.getedad()<0 | alumno.getedad()>120);
                    llave01=true;
                    break;
                case 2:
                     do{
                        System.out.println("Ingrese PC01: ");
                        alumno.setpc01(lector.nextInt());
                    }while(alumno.getpc01()<0 | alumno.getpc01()>20);
                    
                    do{
                        System.out.println("Ingrese PC02: ");
                        alumno.setpc02(lector.nextInt());
                    }while(alumno.getpc02()<0 | alumno.getpc02()>20);
                        
                    do{
                        System.out.println("Ingrese PC03: ");
                        alumno.setpc03(lector.nextInt());
                    }while(alumno.getpc03()<0 | alumno.getpc03()>20);
                        
                    do{
                        System.out.println("Ingrese EF: ");
                        alumno.setef(lector.nextInt());
                    }while(alumno.getef()<0 | alumno.getef()>20);
                    llave02=true;
                    break;
                case 3:
                    if (llave01 && llave02) {
                        alumno.informar();
                    }else{
                        System.out.println("Opción no disponible aún");
                    }
                    break;
            }
        }while (opcion!=4);
    }

}
