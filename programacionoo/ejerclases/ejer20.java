package programacionoo.ejerclases;

public class ejer20 {
    private String nombre;
    private String codigo;
    private int creditos;
    //constructor
    public ejer20(String nom, String cod, int cred) {
        this.nombre = nom;
        this.codigo = cod;
        this.creditos = cred;
    }
    //set
    public void setnombre(String nom) {
        this.nombre = nom;
    }
    public void setcodigo(String cod) {
        this.codigo = cod;
    }
    public void setcreditos(int cred) {
        this.creditos = cred;
    }
    //get
    public String getnombre() {
        return this.nombre;
    }
    public String getcodigo() {
        return this.codigo;
    }
    public int getcreditos() {
        return this.creditos;
    }
    //metodos
    public void informar() {
        System.out.printf("""
            -----------------------
              DATOS DEL CURSO  
            -----------------------
            Nombre:    %s
            Codigo:    %s
            Creditos:  %d
            -----------------------
                """, this.nombre, this.codigo, this.creditos);
    }
    //funciones
    public double costo () {
        return this.creditos*26.15;
    }
}
