package ejerciciosgenerales.sem14;

public class main {
    public static void main(String[] args) {
        main n1= new main();

        String nombre = "dele";

        System.out.println("Antes - nombre: "+nombre);

        n1.modificar(nombre);

        System.out.println("Después - nombre: "+ nombre);
    
    }

    public void modificar (String valor){
        valor="dele2";

        System.out.println("Antes - nombre: "+valor);
    }

}
