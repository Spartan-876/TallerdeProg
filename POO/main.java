package POO;

public class main {
    public static void main(String[] args) {
        clsAlumno objAlumno01 =new clsAlumno();
        clsAlumno objAlumno02 =new clsAlumno( "Niño Morante", 48 );
        

        //set y get
        objAlumno01.setnombre("NS");
        System.out.println("El nombre es: "+objAlumno01.getnombre());


        //Llamar metodos
        objAlumno01.informar();
        objAlumno02.informar();

        //Llamar funciones
        String dato;
        dato = objAlumno02.obtenerDatos();
        System.out.println(dato);
    }
}
