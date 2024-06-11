package ejerciciofor;
/*
    Realizar un programa que imprima la suma de los números del 1 al  100.
 */
public class ejercicio01 {
    public static void main(String[] args) {
        int suma=0;
        for (int i=1;i<=100;i++){
            suma+=i;
        }
        System.out.printf("La suma es:"+suma);
    }
}
