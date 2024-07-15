package programacionoo.ejerciciospptx;

public class clsMenu {
    public static void mostrarMenu() {
        System.out.println("Operaciones con conjuntos:");
        System.out.println("1. Sumar conjuntos");
        System.out.println("2. Restar conjuntos");
        System.out.println("3. Intersectar conjuntos");
        System.out.print("Ingrese una opción: ");
    }

    public static int leerOpcion() {
        return LectorDatos.leerEntero();
    }
}
