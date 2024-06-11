package ejerciciosgenerales;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattermattcher {
    public static void main(String[] args) {
        // patter matcher usando while() buscar coincidencias de una expresión regular en una cadena

        String regex = "a*b"; // definir la expresión regular

        Pattern pattern = Pattern.compile(regex); //compilando la expresión regular en un patron

        String cadena = "aabfooabfooabfoob";// definiendo la cadena en la que buscar la coincidencia

        Matcher matcher_utp = pattern.matcher(cadena);// creando un objeto Matcher para realizar  la busqueda

        System.out.println(matcher_utp);

        while (matcher_utp.find()){//buscando todas las coincidencias en la cadena
            System.out.println("Coincidencia encontrada indice "+ matcher_utp.start()+ " -" + matcher_utp.end());
            System.out.println("Coincidencia: "+ matcher_utp.group());

        }
    }
}
