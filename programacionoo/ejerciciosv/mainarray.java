package programacionoo.ejerciciosv;

import java.util.Scanner;

public class mainarray {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        clsarreglo obj=new clsarreglo();
        int valor;
        System.out.println("Ingrese el valor");
        valor=lector.nextInt();

        obj.eliminarvalor(valor);
    }
}
