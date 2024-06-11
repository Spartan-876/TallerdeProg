package ejerciciosgenerales;
import java.util.Scanner;

public class jubilación {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char s1='m',s2='f',S1='M',S2='F';
        char sexo;
        byte edad;

        System.out.println("Jubilación");
        System.out.println("Ingrese su sexo (M o F)");
        sexo = lector.next().charAt(0);
        lector.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = lector.nextByte();
        lector.nextLine();

        if (sexo == s1 && edad>=65){
            System.out.println("Se puede jubilar ");
        } else if (sexo == s2 && edad>=60){
            System.out.println("Se puede jubilar ");
        } else {
            System.out.println("No se puede jubilar");
        }
    }

}
