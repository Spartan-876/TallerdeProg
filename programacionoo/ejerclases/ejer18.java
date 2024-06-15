package programacionoo.ejerclases;

public class ejer18 {
    private String numeroFactura;
    private String fecha;
    private double monto;
    //constructor
    public ejer18(String num, String fec, double mon){
        this.numeroFactura=num;
        this.fecha=fec;
        this.monto=mon;
    }
    //set
    public void setnumeroFactura(String num){
        this.numeroFactura=num;
    }
    public void setfecha(String fec){
        this.fecha=fec;
    }
    public void setmonto(double mon){
        this.monto=mon;
    }
    //get
    public String getnumeroFactura(){
        return this.numeroFactura;
    }
    public String getfecha(){
        return this.fecha;  
    }
    public double getmonto(){
        return this.monto;
    }
    //metodo
    public void informe(){
        System.out.printf("""
                -----------------------
                  DATOS DE LA FACTURA  
                -----------------------
                Factura:   %s
                Fecha:     %s
                Monto:     %.2f
                -----------------------
                    """,this.numeroFactura,this.fecha,this.monto);
    }   
    //funcion
    public void cobrar(double cant){
        this.monto-=cant;
    }   
}
