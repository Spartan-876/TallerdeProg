package programacionoo.ejerclases;

public class ejer19 {
    private String aerolinea;
    private int capacidad;
    private String destino;
    // constructor
    public ejer19(String aer, int cap, String dest){
        this.aerolinea=aer;
        this.capacidad=cap;
        this.destino=dest;
    }    
    // set
    public void setaerolinea(String aer){
        this.aerolinea=aer;
    }
    public void setcapacidad(int cap){
        this.capacidad=cap;
    }
    public void setdestino(String dest){
        this.destino=dest;
    }
    // get
    public String getaerolinea(){
        return this.aerolinea;
    }
    public int getcapacidad(){
        return this.capacidad;
    }
    public String getdestino(){
        return this.destino;
    }
    // metodo
    public void informe(){
        System.out.printf("""
            -----------------------
              DATOS DE LA AVION  
            -----------------------
            Aerolienea:  %s
            Capacidad:   %d
            Destino:     %s
            -----------------------
                """,this.aerolinea,this.capacidad,this.destino);
    }
    //funcion
    public boolean lleno(){
        boolean lleno=false;
        if (this.capacidad==100){
            lleno=true;
        }else{
            lleno=false;
        }
        return lleno;
    }
}
