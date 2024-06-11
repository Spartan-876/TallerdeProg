package ejerciciosgenerales;
import java.util.Scanner;

public class candidatos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        byte puntos;

        System.out.println("Evaluación del candidato");
        System.out.println("Ingrese su puntuación (0-10):");
        puntos = lector.nextByte();
        lector.nextLine();

        switch (puntos){
            case 0,1,2,3,4:
                System.out.println("Descartado");
                break;
            case 5:
                System.out.println("En suspenso");
                break;
            case 6:
                System.out.println("Aceptable");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Valor incorrecto");
        }
    }
}
