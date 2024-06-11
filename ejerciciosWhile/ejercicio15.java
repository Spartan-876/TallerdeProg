package ejerciciosWhile;

/*
    Realice un programa donde permita ingresar un texto y de la cantidad de letras que posee.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int contadorL=0;
        String txt;
        System.out.println("Ingrese su texto");
        txt=lector.nextLine();
        Pattern letras;
        Matcher cantletras;
        letras= Pattern.compile("[a-zA-Z]");
        cantletras=letras.matcher(txt);
        while (cantletras.find()){
            contadorL++;
        }
        System.out.println("La cantidad de letras es: "+contadorL);
    }
}
