package programacionoo.ejerciciospptx;


public class AppPOO {

    public static void main(String[] args) {
        clsMenu.mostrarMenu();
        int opcion = clsMenu.leerOpcion();
        int[] arr1 = LectorDatos.leerArreglo();
        int[] arr2 = LectorDatos.leerArreglo();

        switch (opcion) {
            case 1:
                int[] resultadoSuma = OperadorArreglos.sumarConjuntos(arr1, arr2);
                System.out.println("Resultado: ");
                System.out.println(java.util.Arrays.toString(resultadoSuma));
                break;
            case 2:
                int[] resultadoResta = OperadorArreglos.restarConjuntos(arr1, arr2);
                System.out.println("Resultado: ");
                System.out.println(java.util.Arrays.toString(resultadoResta));
                break;
            case 3:
                int[] resultadoInterseccion = OperadorArreglos.intersectarConjuntos(arr1, arr2);
                System.out.println("Resultado: ");
                System.out.println(java.util.Arrays.toString(resultadoInterseccion));
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
}
