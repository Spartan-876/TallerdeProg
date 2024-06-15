package programacionoo.ejerclases;

public class ejer14 {
    private String nombre;
    private String tipoComida;
    private String direccion;
    //constructor
    public ejer14(String nom, String tip, String dir){
        this.nombre=nom;
        this.tipoComida=tip;
        this.direccion=dir;
    }
    //set
    public void setnombre(String nom){
        this.nombre=nom;
    }
    public void settipoComida(String tip){
        this.tipoComida=tip;
    }
    public void setdireccion(String dir){
        this.direccion=dir;
    }
    //get
    public String getnombre(){
        return nombre;
    }
    public String gettipoComida(){
        return tipoComida;
    }
    public String getdireccion(){
        return direccion;
    }    
    //metodos
    public void informe(){
        System.out.printf("""
                -----------------------
                  DATOS DE LA RESTAURANT
                -----------------------
                Nombre:    %s
                Comida:    %s
                Dirección: %s
                -----------------------
                    """,this.nombre,this.tipoComida,this.direccion);
    }
}
