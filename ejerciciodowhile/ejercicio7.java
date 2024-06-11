package ejerciciodowhile;
/*
    Realizar un programa que pida el usuario y contraseña
    y permita ingresar cuando sean validos.
 */
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String us,usuario="usuario1",contr,contraseña="123456a";
        do {
            System.out.println("Ingrese su usuario:");
            us=lector.nextLine();
            System.out.println("Ingrese su contraseña:");
            contr=lector.nextLine();
        }while (!us.equals(usuario) || !contr.equals(contraseña));
        System.out.println("Bienvenido");
    }
}
