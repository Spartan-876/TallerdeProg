package ejerciciosgenerales.sem13;

public class clsProducto {
    private String nombre;
    private double precio;


    //contructor parametrizado
    public clsProducto() {
        this.nombre = "";
        this.precio = 0.0;
    }
    
    //contructor parametrizado
    public clsProducto(String nom, double prec) {
        this.nombre = nom;
        this.precio = prec;
    }

    //metodos
    public void mostrarinfo() {
        System.out.printf("""
                ------------------------
                Información del producto
                ------------------------
                Nombre: %s
                Precio: %.2f
                ------------------------
                """,this.nombre,this.precio);
    }

    //Función
    public double obtenerprecio(){
        double rpta;
        rpta=this.precio*5f;
        return rpta;
    }
        
}
