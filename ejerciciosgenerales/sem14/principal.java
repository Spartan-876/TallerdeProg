package ejerciciosgenerales.sem14;

public class principal {
    public static void main(String[] args) {

        clsUTP obj1=new clsUTP();
        
        System.out.println("Mensaje: "+ obj1.toString());


        clsalumno obj = new clsalumno("dele1");

        System.out.println("Antes - nombre:"+obj.getnombre());

        modificar(obj);

        System.out.println("Después - nombre:"+ obj.getnombre());
        
    }

    public static void modificar(clsalumno valor){
        valor.setnombre("Jeff");
        System.out.println("Antes - nombre: "+valor.getnombre());
    }
}
