package programacionoo.ejerclases;

public class ejer15 {
    private String marca;
    private String tipo;
    private double precio;
    //constructores
    public ejer15(String mar, String tip, double pre){
        this.marca=mar;
        this.tipo=tip;
        this.precio=pre;
    }
    //set
    public void setmarca(String mar){
        this.marca=mar;
    }
    public void settipo(String tip){
        this.tipo=tip;
    }
    public void setprecio(double pre){
        this.precio=pre;
    }
    //get
    public String getmarca(){
        return this.marca;
    }
    public String gettipo(){
        return this.tipo;   
    }
    public double getprecio(){
        return this.precio;
    }   
    //metodos
    public void informar(){
        System.out.printf("""
            -----------------------
              DATOS DEL PRODUCTO
            -----------------------
            Marca:  %s
            Tipo:   %s
            Precio: %.2f
            -----------------------
                """,this.marca,this.tipo,this.precio);
    }
    //funciones
    public double total(){
        return this.precio;
    }
}
