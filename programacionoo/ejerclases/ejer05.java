package programacionoo.ejerclases;

public class ejer05 {
    private String nombre;
    private double precio;
    private int cantidad;
    //constructor
    public ejer05(String nom, double prec, int cant){
        this.nombre=nom;
        this.precio=prec;
        this.cantidad=cant;
    }
    //set
    public void setnombre(String nom){
        this.nombre=nom;
    }
    public void setprecio(double prec){
        this.precio=prec;
    }
    public void setcantidad(int cant){
        this.cantidad=cant;
    }
    //get
    public String getnombre(){
        return this.nombre;
    }
    public double getprecio(){
        return this.precio;
    }
    public int getcantidad(){
        return this.cantidad;
    }
    //metodos
    public void informar(){ 
        System.out.printf("""
            -----------------------
              DATOS DEL PRODUCTO
            -----------------------
            Nombre:    %s
            Precio:    %.2f
            Cantidad:  %d
            -----------------------
            """, this.getnombre(),this.getprecio(),this.getcantidad());
    }  
    //funciones
    public double total(){
        return this.getprecio()*this.getcantidad();
    }
}
