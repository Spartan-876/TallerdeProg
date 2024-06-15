package programacionoo.ejerclases;

public class ejer01 {
    private String nombre;
    private int edad;
    private String direccion;
    //constructor
    public ejer01(String nom, int ed, String direc ){
        this.nombre=nom;
        this.edad=ed;
        this.direccion=direc;
    }
    //set 
    public void setnombre(String vnombre){
        this.nombre=vnombre;
    }
    public void setedad (int vedad){
        this.edad=vedad;
    }
    public void setdireccion (String vdireccion){
        this.direccion=vdireccion;
    }
    //get  
    public String getnombre(){
        return this.nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getDireccion() {
        return direccion;
    }
    //Metodos
    public void informe () {
        System.out.printf("""
                -----------------------
                  DATOS DE LA PERSONA  
                -----------------------
                Nombre:    %s
                Edad:      %d
                Dirección: %s
                -----------------------
                    """, nombre, edad, direccion);
    }
    //funciones
    public String mayoredad(){
        String rpta;
        if (edad<18) {
            rpta="Mayor de edad";
        }else{
            rpta="Menor de edad";
        }
        return rpta;
    }
}
