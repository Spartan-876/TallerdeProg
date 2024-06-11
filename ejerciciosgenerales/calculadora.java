package ejerciciosgenerales;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String separacion="----------------------------";
        String title="Calculadora 3.0";
        int operacion;
        float num1,num2;
        float resul = 0;


        System.out.printf("%n%s%n%21S%n%s%n",separacion,title,separacion);
        System.out.printf("Ingrese una opción: %n 1.Suma %n 2.Resta %n 3.Multiplicación %n 4.División %n 5.Potencia%n");
        operacion= lector.nextInt();
        System.out.println("Ingrese el primer número:");
        num1=lector.nextFloat();
        lector.nextLine();
        System.out.println("Ingrese el segundo número:");
        num2=lector.nextFloat();

        System.out.println(separacion);
        switch (operacion){
            case 1:
                resul=num1+num2;
                System.out.println("El resultado es: "+resul);
                break;
            case 2:
                resul=num1-num2;
                System.out.println("El resultado es: "+resul);
                break;
            case 3:
                resul=num1*num2;
                System.out.println("El resultado es: "+resul);
                break;
            case 4:
                if (num2==0){
                    System.out.println("ERROR");
                }else {
                    resul=num1/num2;
                    System.out.println("El resultado es: "+resul);
                }
                break;
            case 5:
                resul=(float) Math.pow(num1,num2);
                System.out.println("El resultado es: "+resul);
                break;
            default:
                System.out.println("ERROR");
        }
        System.out.println(separacion);
    }
}
