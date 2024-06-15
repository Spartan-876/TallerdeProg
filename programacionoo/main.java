package programacionoo;

import java.util.Scanner;

import programacionoo.ejer01.clsalumno;

public class main {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        clsAlumno alumno01=new clsAlumno();

        System.out.println("Ingrese su nombre:");
        alumno01.setnombre(lector.nextLine());

        do{
            System.out.println("Ingrese su edad:");
            alumno01.setedad(lector.nextInt());
        }while(alumno01.getedad()<12);


        alumno01.informar();

    }
}
