package programacionoo.ejerciciosv;

import java.util.Arrays;

public class ambitovariables {
    public static void main(String[] args) {
    int numero = 10;
    int[] arregloNumeros = { 4, 7, 11, 23 };
    proceso(numero, arregloNumeros);
    System.out.println(numero);
    System.out.println(Arrays.toString(arregloNumeros));   
    }  


    
    static void proceso(int n, int[] arr) {        
        int valor = n * 2;        
        System.out.println(valor);
        n += 22;       
        arr[2] = valor;   
    }
}
