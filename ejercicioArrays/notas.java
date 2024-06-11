package ejercicioArrays;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int cant;
        do {
            System.out.println("Ingrese la cantidad de alumnos: ");
            cant= lector.nextInt();
        }while (cant<=0);
        lector.nextLine();
        String []vnombres=new String[cant];
        int []vedad=new int[cant];
        int []vgrado=new int[cant];
        int []vpc1=new int[cant];
        int []vpc2=new int[cant];
        int []vpc3=new int[cant];
        int []vef=new int[cant];
        double suma = 0;
        double promf;
        double []vprom=new double[cant];
        System.out.println("Ingreso de datos de los alumnos");
        for (int i=0;i<vnombres.length;i++){
            System.out.println("Datos del alumno N°"+(i+1));
            System.out.println("Ingrese el nombre");
            vnombres[i]= lector.nextLine();
            do {
                System.out.println("Ingrese la edad");
                vedad[i]= lector.nextInt();
            }while (vedad[i]<0);
            do {
                System.out.println("Ingrese el grado");
                vgrado[i]= lector.nextInt();
            }while (vgrado[i]<0||vgrado[i]>5);
            do {
                System.out.println("Ingrese la nota de la PC01");
                vpc1[i]=lector.nextInt();
            }while (vpc1[i]<0||vpc1[i]>20);
            do {
                System.out.println("Ingrese la nota de la PC02");
                vpc2[i]=lector.nextInt();
            }while (vpc2[i]<0||vpc2[i]>20);
            do {
                System.out.println("Ingrese la nota de la PC03");
                vpc3[i]=lector.nextInt();
            }while (vpc3[i]<0||vpc3[i]>20);
            do {
                System.out.println("Ingrese la nota de la EF");
                vef[i]=lector.nextInt();
            }while (vef[i]<0||vef[i]>20);
            lector.nextLine();
            vprom[i]=(vpc1[i]+vpc2[i]+vpc3[i]+vef[i])/4f;
        }
        System.out.println("################### REPORTE DE NOTAS ######################");
        System.out.println("Nombre                      EDAD GRADO PC01 PC02 EF PROM");
        System.out.println("###########################################################");
        for (int i=0;i<vnombres.length;i++){
            System.out.printf("%-24.24S    %d   %d  %d  %d  %d  %d  %.2f\n",vnombres[i],vedad[i],vgrado[i],vpc1[i],vpc2[i],vpc3[i],vef[i],vprom[i]);
        }
        System.out.println("###########################################################");
        for (int i=0;i<vnombres.length;i++){
            suma = suma+vprom[i];
        }
        promf=suma/cant;
        System.out.printf("PROMEDIO FINAL%43.2f%n",promf);
        System.out.println("###########################################################");
    }
}
