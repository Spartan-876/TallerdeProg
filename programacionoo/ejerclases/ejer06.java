package programacionoo.ejerclases;

public class ejer06 {
    private String especie;
    private int edad;
    private double peso;
    //constructor
    public ejer06(String esp, int ed, double pes) {
        this.especie = esp;
        this.edad = ed;
        this.peso = pes;
    }
    //set
    public void setEspecie(String esp) {
        this.especie = esp;
    }
    public void setEdad(int ed) {
        this.edad = ed;
    }
    public void setPeso(double pes) {
        this.peso = pes;
    }
    //get
    public String getEspecie() {
        return especie;
    }
    public int getEdad() {
        return edad;
    }
    public double getPeso() {
        return peso;
    }
    //metodos
    public void informe() {
        System.out.printf("""
            -----------------------
              DATOS DE LA ESPECIE  
            -----------------------
            Especie:   %s
            Edad:      %d
            Peso:      %.2f
            -----------------------
                """, this.especie, this.edad, this.peso);
    }   
    //funciones
    public String obtenerInformacion() {
        return "Especie: " + especie + ", Edad: " + edad + " años, Peso: " + peso + " kg";
    }
}
