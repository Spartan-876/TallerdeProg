package programacionoo.cadenas;

public class main {
    public static void main(String[] args) {
        StringBuilder cadena = new StringBuilder(64);
        cadena.append(" como hayas querido ¿? ");
        cadena.insert(0,"Que algo no haya salido");

        System.out.println("Cadena: "+cadena);

        int inicio=cadena.indexOf("¿?");
        cadena.replace(inicio,inicio+3," no significa que sea util");
        cadena.append(" - Thomas Edisson");

        System.out.println("Cadena: "+cadena);
        System.out.println("Cadena: "+cadena.reverse());
        System.out.println("Cadena: "+cadena.length());
    }
}
