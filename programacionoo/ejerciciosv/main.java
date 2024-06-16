package programacionoo.ejerciciosv;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        clsAlumno alumno01=new clsAlumno("nombre",15);
    
        System.out.println("Ingrese su nombre:");
        alumno01.setnombre(lector.nextLine());

        do{
            System.out.println("Ingrese su edad:");
            alumno01.setedad(lector.nextInt());
        }while(alumno01.getedad()<12);


        alumno01.informar();

    }
}
