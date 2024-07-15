package programacionoo.ejerciciospptx;

/*
 *  La clase OperadorArreglos tiene 3 métodos que realizan operaciones sobre vectores enteros:
        A.sumarConjuntos(int[] arr1, int[] arr2): devuelve un arreglo con los números de arr1 y arr2, sin repetidos.
        B.restarConjuntos(int[] arr1, int[] arr2): devuelve un arreglo con los números que están en arr1 pero no en
        arr2, sin repetidos.
        C.intersectarConjuntos(int[] arr1, int[] arr2): devuelve un arreglo con los números que están en arr1 y arr2 a
        la vez, sin repetidos.
    La clase AppPOO, en su método main, ofrecerá al usuario, a través de la clase Menu, un menú con las 3 opciones.
    Todas las peticiones de datos estarán a cargo de la clase LectorDatos, desarrolladas anteriormente.
 */
public class OperadorArreglos {
    public static int[] sumarConjuntos(int[] arr1, int[] arr2) {
        int[] resultado = new int[arr1.length + arr2.length];
        int indice = 0;
        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            boolean existe = false;
            for (int j = 0; j < indice; j++) {
                if (resultado[j] == num) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                resultado[indice++] = num;
            }
        }
        for (int i=0;i<arr2.length;i++) {
            int num2=arr2[i];
            boolean existe = false;
            for (int j = 0; j < indice; j++) {
                if (resultado[j] == num2) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                resultado[indice++] = num2;
            }
        }
        int[] resultadoFinal = new int[indice];
        for (int i = 0; i < indice; i++) {
            resultadoFinal[i] = resultado[i];
        }
        return resultadoFinal;
    }

    public static int[] restarConjuntos(int[] arr1, int[] arr2) {
        int[] resultado = new int[arr1.length];
        int indice = 0;
        for (int num : arr1) {
            boolean existe = false;
            for (int i : arr2) {
                if (i == num) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                resultado[indice++] = num;
            }
        }
        int[] resultadoFinal = new int[indice];
        System.arraycopy(resultado, 0, resultadoFinal, 0, indice);
        return resultadoFinal;
    }

    public static int[] intersectarConjuntos(int[] arr1, int[] arr2) {
        int[] resultado = new int[Math.min(arr1.length, arr2.length)];
        int indice = 0;
        for (int num : arr1) {
            for (int i : arr2) {
                if (i == num) {
                    boolean existe = false;
                    for (int j = 0; j < indice; j++) {
                        if (resultado[j] == num) {
                            existe = true;
                            break;
                        }
                    }
                    if (!existe) {
                        resultado[indice++] = num;
                    }
                }
            }
        }
        int[] resultadoFinal = new int[indice];
        System.arraycopy(resultado, 0, resultadoFinal, 0, indice);
        return resultadoFinal;
    }
}
