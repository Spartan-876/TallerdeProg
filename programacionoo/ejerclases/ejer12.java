package programacionoo.ejerclases;

public class ejer12 {
    private String direccion;
    private int numeroHabitaciones;
    private double tamaño;
    //constructor
    public ejer12(String dir, int numHab, double tam) {
        this.direccion = dir;
        this.numeroHabitaciones = numHab;
        this.tamaño = tam;
    }
    //set
    public void setdireccion(String dir) {
        this.direccion = dir;
    }
    public void setnumeroHabitaciones(int numHab) {
        this.numeroHabitaciones = numHab;
    }
    public void settamano(double tam) {
        this.tamaño = tam;
    }
    //get
    public String getdireccion() {
        return this.direccion;
    }
    public int getnumeroHabitaciones() {
        return this.numeroHabitaciones;
    }
    public double gettamano() {
        return this.tamaño;
    }
    //metodos
    public void informar() {
        System.out.printf("""
                ------------------------------
                       DATOS DE LA CASA
                ------------------------------
                Dirección: %s
                Habitaciones: %d
                Tamaño: %.2f m²
                ------------------------------
                """,this.direccion,this.numeroHabitaciones,this.tamaño);
    }
    //funciones
    public double volumen() {
        return this.tamaño * this.tamaño;
    }
}
