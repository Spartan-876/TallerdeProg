package programacionoo.ejerclases;

public class ejer11 {
    private String procesador;
    private int ram;
    private int almacenamiento;
    //constructor
    public ejer11(String proc, int ram, int alm){
        this.procesador=proc;
        this.ram=ram;
        this.almacenamiento=alm;
    }
    //set
    public void setprocesador(String proc){
        this.procesador=proc;
    }
    public void setram(int ram){
        this.ram=ram;
    }
    public void setalmacenamiento(int alm){
        this.almacenamiento=alm;
    }
    //get
    public String getprocesador(){
        return procesador;
    }
    public int getram(){
        return ram;
    }
    public int getalmacenamiento(){
        return almacenamiento;
    }
    //metodos
    public void informar(){
        System.out.printf("""
            -----------------------
            DATOS DE LA COMPUTADORA
            ----------------------- 
            Procesador: %s
            RAM:        %d  GB
            Almacenamiento: %d GB
            -----------------------
                """,this.procesador,this.ram,this.almacenamiento);
    }
    
}
