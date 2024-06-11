package ejerciciosgenerales;

import java.util.Scanner;

public class otraboletamaspipipi {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String rpta;
        int numero=1;
        int largo=100;
        boolean comparar;
        String []lstNombre= new String[largo];
        int []lstCProductos= new int[largo];
        double[]lstPrecios = new double[largo];

        System.out.println("BIENVENIDO A LA POLLERIA MAS ZZZ QUE LA WBNA DE GRAZZZZIA/(Confirmo q no le han dado)");

        for (int i=0;i<largo;i++){
            do {
                System.out.println("Ingrese el nombre del producto "+(i+1));
                lstNombre [i] = lector.nextLine();
            }while(lstNombre[i].equals(""));
            do {
                System.out.println("Ingrese la cantidad del producto "+(i+1));
                lstCProductos[i]= lector.nextInt();
            }while (lstCProductos[i]<=0);
            lector.nextLine();
            do {
                System.out.println("Ingrese el precio del producto "+(i+1));
                lstPrecios[i]= lector.nextDouble(); //si lo defines como double se lee como double
            }while (lstPrecios[i]<=0);
            lector.nextLine();
            do {// Es mejor validar que la respuesta del usuario sea correcta y recien continuar.
                System.out.println("¿Desea continuar?");
                rpta = lector.nextLine();
                comparar = rpta.equalsIgnoreCase("si") || rpta.equalsIgnoreCase("no");
                if (!comparar) {
                    System.out.println("Respuesta inválida, por favor responda 'si' o 'no'");
                }
            } while (!comparar);//el "comparar", sirve para saber si la respuesta ingresada es si o no o variantes
            if (rpta.equalsIgnoreCase("no")) {//mejor es con el ignorecase para que se puedan ingresar variantes.
                break;
            }

            System.out.println("---------------------------------------------");
            numero++;//usa un contador para tener en cuenta la cantidad  de productos ingresados
        }
        System.out.printf("""
                ---------------------------------------------------------
                        ESPECIALIDAD DE POLLOS A LA BRASA

                                    TEL: None
                Tiquet: 1-786327
                Fecha: 26/04/19     19:13
                Mesa 6
                
                Un. Descripción                      Total
                ------------------------------------------
                    Varios
                
                """);
        for(int i = 0 ; i <numero;i++){ //el for se limita con la cantidad de productos introducidos, así no imprime los espacios vacios
            System.out.printf("""
                        %-4d %-20.20S    %.2f 
                    """,lstCProductos[i],lstNombre[i],((lstCProductos[i])*(lstPrecios[i])));
                    //el -4 del %d limita que el número mostrado sea maximo de 4 digitos, rellena con espacios y alinea a la izquierda
                    //el - alinea a la izquierda el 20 rellena con espacios y el .20 limita que el texto sea maximo de 20 caracteres
                    //si se pasa corta el texto hasta los 20 caracteres
        }
        System.out.println("FIN");
    }
}
