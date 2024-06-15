package programacionoo.ejerclases;

public class ejer16 {
    private String marca;
    private String modelo;
    private int almacenamiento;
    //constructor
    public ejer16(String mrc, String mod, int alm){
        this.marca=mrc;
        this.modelo=mod;
        this.almacenamiento=alm;
    }
    //set
    public void setmarca(String mrc){
        this.marca=mrc;
    }
    public void setmodelo(String mod){
        this.modelo=mod;
    }
    public void setalmacenamiento(int alm){
        this.almacenamiento=alm;
    }
    //get
    public String getmarca(){
        return marca;
    }
    public String getmodelo(){
        return modelo;
    }
    public int getalmacenamiento(){
        return almacenamiento;
    }
    //metodo
    public void informe(){
        System.out.printf("""
            -----------------------
              DATOS DEL TELEFONO
            -----------------------
            marca: %s
            modelo: %s
            almacenamiento: %d
            -----------------------
                """,marca,modelo,almacenamiento);
    }
    //funcion
    public int capacidad(){
        return almacenamiento;
    }
}
