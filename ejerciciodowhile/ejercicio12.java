package ejerciciodowhile;
/*
   Realizar un programa que calcule la suma de los cuadrados de los 100 primeros números naturales.
 */
public class ejercicio12 {
    public static void main(String[] args) {
        int suma = 0;
        int i = 1;

        do {
            suma = suma + i * i;
            i++;
        } while (i <= 100);
        System.out.println("La suma de los cuadrados de los cien primeros números naturales es: " + suma);
    }
}
