package programacionoo.ejerclases;

public class ejer07 {
    private String nombre;
    private String puesto;
    private double salario;
    //contructor
    public ejer07(String nom, String pst, double sal){
        this.nombre=nom;
        this.puesto=pst;
        this.salario=sal;
    }
    //set
    public void setnombre(String nom){
        this.nombre=nom;
    }
    public void setpuesto (String pst){
        this.puesto=pst;
    }
    public void setsalario (double sal){
        this.salario=sal;
    }
    //get
    public String getnombre (){
        return nombre;
    }
    public String getpuesto (){
        return puesto;
    }
    public double getsalario (){
        return salario;
    }
    //Metodo
    public void informe() {
        System.out.printf("""
            -----------------------
              DATOS DEL EMPLEADO  
            -----------------------
            NOMBRE:   %s
            PUESTO:   %s
            SALARIO:  %.2f
            -----------------------
                """, this.nombre,this.puesto,this.salario);
    }
    //función
    public double aumento(){
        double aum;
        if (salario<1200) {
            aum=salario*0.1;
        } else{
            aum=0;
        }
        return aum;
    }
}
