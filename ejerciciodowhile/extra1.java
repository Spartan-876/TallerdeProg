package ejerciciodowhile;

import java.util.Scanner;

public class extra1 {
    public static void main(String[] args) {
        int numero, exponente = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("INGRESE UNA BASE PARA LA POTENCIA:");
            numero = sc.nextInt();
            if (numero<0){
                System.out.println("INGRESE UN NÚMERO MAYOR A 0");
            }else {
                System.out.println("INGRESE EL EXPONENTE");
                exponente = sc.nextInt();
            }
        } while(numero < 0 );
        double result= Math.pow(numero,exponente);
        System.out.println("Resultado: "+result);
    }
}
