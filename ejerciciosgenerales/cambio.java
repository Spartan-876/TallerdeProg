package ejerciciosgenerales;
import java.util.Scanner;

public class cambio {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String moneda1, moneda2;
        float valor1, valor2 = 0, valorf;

        System.out.println("Cambio de monedas (sol - euro - dolar)");
        System.out.println("Ingrese la moneda de origen: ");
        moneda1 = lector.nextLine();
        lector.nextLine();
        System.out.println("Ingrese la cantidad: ");
        valor1 = lector.nextFloat();
        lector.nextLine();
        System.out.println("Ingrese la moneda de destino: ");
        moneda2 = lector.nextLine();
        lector.nextLine();


        switch (moneda1){
            case "sol":
                switch (moneda2){
                    case "dolar":
                        valor2+=0.26f;
                        break;
                    case "euro":
                        valor2+=0.24f;
                        break;
                    default:
                        valor2+=1;
                        break;
                }
                break;
            case "euro":
                switch (moneda2){
                    case "sol":
                        valor2+=4.17f;
                        break;
                    case "dolar":
                        valor2+=1.09f;
                        break;
                    default:
                        valor2+=1;
                        break;
                }
                break;
            case "dolar":
                switch (moneda2){
                    case "sol":
                        valor2+=3.82f;
                        break;
                    case "euro":
                        valor2+=0.92f;
                        break;
                    default:
                        valor2+=1;
                        break;
                }
                break;
            default:
                System.out.println("Error");
        }
        valorf=valor1*valor2;
        System.out.printf("El cambio es de: %.2f\n",valorf);
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(moneda1);
        System.out.println(moneda2);
    }

    public static class aumento22 {
        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            byte num;
            float salario,salariof;
            float aum;

            System.out.println("Aumento de salarios");
            System.out.println("Ingrese el sueldo: ");
            salario=lector.nextFloat();
            System.out.println("Ingrese el número: ");
            num= lector.nextByte();
            lector.nextLine();


            switch (num) {
                case 1:
                    aum=0.38f;
                    break;
                case 2:
                    aum=0.21f;
                    break;
                case 3:
                    aum=0.12f;
                    break;
                case 4:
                    aum=0.8f;
                    break;
                default:
                    aum=0f;
            }
            if (aum>0){
                salariof=salario+(salario*aum);
                System.out.println("El salario neto es de:"+salario);
                System.out.println("El salario aumentado es de:"+salariof);
            }else {
                System.out.println("Error de numero");
            }
        }
    }
}
