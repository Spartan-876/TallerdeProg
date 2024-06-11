package ejerciciosgenerales;

import java.util.Scanner;

public class ejer01 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String nomc="ns",contratado=" ",nombrado=" ";
        char tipo='n';
        int opc;
        double salario=0,total;
        do{
            System.out.printf("""
                    *******************************
                    *       MENÚ DE OPCIONES      *
                    *******************************
                    * 1. Info. del Empleado       *
                    * 2. Ingresar Salario         *
                    * 3. Emitir boleta            *
                    * 4. Salir                    *
                    *******************************
                    """);
            opc=lector.nextInt();
            lector.nextLine();
            switch (opc){
                case 1:
                    System.out.println("****************");
                    System.out.println("Nombre y apeliidos: ");
                    nomc=lector.nextLine();
                    System.out.println("Tipo de empleado");
                    tipo=lector.nextLine().charAt(0);
                    System.out.println("****************");

                    break;
                case 2:
                    do {
                        System.out.println("Salario mensual");
                        salario= lector.nextDouble();
                    }while (salario<=0);
                    break;
                case 3:

                    break;
            }
        }while(opc!=4);

    }
}
