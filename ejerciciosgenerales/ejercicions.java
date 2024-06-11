package ejerciciosgenerales;
import java.util.Scanner;

/*
    Ejercicio: crear un programa en el cual se deba ingresar los siguientes datos de un empleado:
                codigo,nombre,fecha de ingreso,mes pago, estado civil, tipo de empleado, horas trabajadas, costo de hora.

                Para el empleado civil tendrá las siguientes bonificcaciones:
                     1. casado: 12%
                     2. viudo 9%
                     3. divorciado 7%
                     4. Soltero 2%
                Para el tipo de empleado las siguientes bonificaciones .
                     1. nombrado 6%
                     2. contratado 4%
                     3. eventual 2%
                 Además tendrá las siguientes bonificaciónes
                    1. Asignación de movilidad de 100 so
                    2, Rerigerio 130 so
                    3. Otros 80 so
                 Se deberá considerar que el empleado tendrá los siguientes descuentos:
                    1. AFP 11%
                    2. VIVIENDA 20%
                    3. Seguro 6%

                 el programa debe imprimir el codigo, nombre, mes pago, estado civil, tipo empleado, sueldo bruto,
                 total de descuentos, total de bonificaciones, total a pagar.
*/

public class ejercicions {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String separacion="--------------------------------------";
        String title="salarios";
        String nombre,codigo,fecha,mespago,tipoempleado,adelanto;
        char civil;
        int horaTrabajo;
        double costohora,sueldobruto,sueldoneto,bonicivil,bonotipoempleado,totaldesc,totalboni,cuanto = 0;
        final int movilidad=100,refrigerio=130,otros=80;
        double AFP=0.11,VIVIENDA=0.2, SEGURO=0.06;

        System.out.printf("%n%s%n%22S%n%s%n",separacion,title,separacion);
        System.out.println("Ingrese el codigo del empleado: ");
        codigo=lector.nextLine();
        lector.nextLine();
        System.out.println("Ingrese el nombre del empleado: ");
        nombre=lector.nextLine();
        lector.nextLine();
        System.out.println("Ingrese la fecha (DD/MM/AA)");
        fecha=lector.nextLine();
        lector.nextLine();
        System.out.println("Ingrese el mes de pago: ");
        mespago=lector.nextLine();
        lector.nextLine();
        System.out.println("Ingrese el estado civil(S-C-V-D): ");
        civil=lector.nextLine().charAt(0);
        lector.nextLine();
        System.out.println("Tipo de empleado: ");
        tipoempleado=lector.nextLine();
        lector.nextLine();
        System.out.println("Ingrese las horas trabajadas: ");
        horaTrabajo=lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el costo de hora: ");
        costohora=lector.nextFloat();
        lector.nextLine();
        System.out.println("¿Pidio adelanto?");
        adelanto=lector.nextLine();
        if (adelanto.toLowerCase().contains("si")){
            System.out.println("¿Cuanto pidió?");
            cuanto=lector.nextDouble();
        }

        sueldobruto=costohora*horaTrabajo;

        civil=Character.toUpperCase(civil);
        bonicivil=switch (civil){
            case 'S' -> 0.02;
            case 'C'-> 0.12;
            case 'V' ->0.09;
            case 'D' ->0.07;
            default -> 0;
        };
        if (bonicivil==0){
            System.out.println(separacion);
            System.out.println("Estado civil invalido");
            System.out.println(separacion);
        }

        tipoempleado=tipoempleado.toLowerCase();
        bonotipoempleado=switch (tipoempleado){
            case "nombrado" ->0.06;
            case "contratado" ->0.04;
            case "eventual" ->0.02;
            default ->0;
        };

        if (bonotipoempleado== 0 ){
            System.out.println(separacion);
            System.out.println("Tipo empleado invalido");
            System.out.println(separacion);
        }

        totaldesc=(AFP+VIVIENDA+SEGURO)*sueldobruto;
        totalboni=((bonicivil+bonotipoempleado)*sueldobruto)+movilidad+refrigerio+otros;

        sueldoneto = (totalboni - totaldesc + sueldobruto) - cuanto;


        System.out.println(separacion);
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre: "+nombre);
        System.out.println("Mes pago: "+mespago);
        System.out.println("Estado civil: "+civil);
        System.out.println("Tipo de empleado: "+tipoempleado);
        System.out.println("Sueldo bruto: "+sueldobruto);
        System.out.println("Total descuentos: "+totaldesc);
        System.out.println("Total bonificaciones: "+totalboni);
        System.out.println("Sueldo neto:"+sueldoneto);

        System.out.println(separacion);
    }
}
