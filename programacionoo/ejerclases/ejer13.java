package programacionoo.ejerclases;

public class ejer13 {
    private String nombre;
    private String ubicacion;
    private int numeroEstudiantes;
    //constructor
    public ejer13(String nom, String ubi, int numEst){
        this.nombre=nom;
        this.ubicacion=ubi;
        this.numeroEstudiantes=numEst;
    }
    //set
    public void setnombre(String nom){
        this.nombre=nom;
    }
    public void setubicacion(String ubi){
        this.ubicacion=ubi;
    }
    public void setnumeroEstudiantes(int numEst){
        this.numeroEstudiantes=numEst;
    }
    //get
    public String getnombre(){
        return this.nombre;
    }
    public String getubicacion(){    
        return this.ubicacion;
    }
    public int getnumeroEstudiantes(){
        return this.numeroEstudiantes;
    }
    //metodos
    public void informar(){
        System.out.printf("""
            -----------------------
              DATOS DE LA ESCUELA  
            -----------------------
            Nombre:    %s
            Ubicación: %s
            Estudiantes:%d
            -----------------------
                """,this.nombre,this.ubicacion,this.numeroEstudiantes);
    }
}
