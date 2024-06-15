package programacionoo.ejerclases;


public class ejer03 {
    private String nombre;
    private String matricula;
    private double promedio;

    //contructor
    public ejer03(String nom, String matr, double prom){
        this.nombre=nom;
        this.matricula=matr;
        this.promedio=prom;
    }
    //Set
    public void setnombre(String nom){
        this.nombre=nom;
    }
    public void setmatricula (String matr){
        this.matricula=matr;
    }
    public void setpromedio (double prom){
        this.promedio=prom;
    }
    //get
    public String getnombre(){
        return nombre;
    }
    public String getmatricula(){
        return matricula;
    }
    public double getpromedio (){
        return promedio;
    }
    //Metodo
    public void informe () {
        System.out.printf("""
                -----------------------
                  DATOS DEL ESTUDIANTE     
                -----------------------
                Nombre:    %s
                Matricula: %s
                Promedio:  %.2f
                -----------------------
                    """,nombre,matricula,promedio);
    }
    //Función
    public boolean pasadeaño (){
        boolean paso;
        if (promedio<12) {
            paso=false;
        }else  {
            paso=true;
        }
        return paso;
    }
}
