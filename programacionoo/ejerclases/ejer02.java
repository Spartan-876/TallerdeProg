package programacionoo.ejerclases;

import java.time.Year;

public class ejer02 {
    private String marca;
    private String modelo;
    private int año;

    //contructor 
    public ejer02(String mrc, String mod, int añ){
        this.marca=mrc;
        this.modelo=mod;
        this.año=añ;
    }

    //set
    public void setmarca (String mrc){
        this.marca=mrc;
    }
    public void setmodelo (String mod){
        this.modelo=mod;
    }
    public void setaño (int añ){
        this.año=añ;
    }
    //get
    public String getmarca(){
        return marca;
    }
    public String getmodelo(){
        return modelo;
    }
    public int getaño(){
        return año;
    }
    //metodo
    public void informe () {
        System.out.printf("""
                -----------------------
                  DATOS DEL VEHÍCULO
                -----------------------
                Modelo: %s
                Marca:  %s
                Año:    %d
                -----------------------
                """,this.getmarca(),this.getmarca(),this.getaño());
    }
    //función
    public int antiguedad(){
        int añoactual=Year.now().getValue();
        return añoactual-año;
    }
}
