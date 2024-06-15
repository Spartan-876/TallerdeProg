package programacionoo.ejerclases;

public class ejer10 {
    private String nombre;
    private int poblacion;
    private double superficie;
    //constructor
    public ejer10(String nom, int pop, double sup) {
        this.nombre = nom;
        this.poblacion = pop;
        this.superficie = sup;
    }
    //set
    public void setnombre(String nom) {
        this.nombre = nom;
    }    
    public void setpoblacion(int pop) {
        this.poblacion = pop;
    }
    public void setsuperficie(double sup) {
        this.superficie = sup;
    }
    //get
    public String getnombre() {
        return this.nombre;
    }
    public int getpoblacion() {
        return this.poblacion;
    }
    public double getsuperficie() {
        return this.superficie;
    }
    //metodos
    public void informar() {
        System.out.printf("""
            -----------------------
               DATOS DE LA CIUDAD  
            -----------------------
            Nombre:    %s
            Poblacion: %d
            Superficie:%.2f
            -----------------------
                """, this.nombre, this.poblacion, this.superficie);
    }
    //funciones
    public double densidad() {
        return this.poblacion / this.superficie;
    }
}
