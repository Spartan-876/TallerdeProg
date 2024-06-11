package POO.ejer01;

public class clsalumno {

    String v_nombre,v_foto;
    int v_edad,v_pc01,v_pc02,v_pc03,v_ef;

    //Set
    public void setnombre(String nombre){
        this.v_nombre=nombre;
    }
    public void setfoto(String foto){
        this.v_foto=foto;
    }
    public void setedad(int edad){
        this.v_edad=edad;
    }
    public void setpc01(int pc01){
        this.v_pc01=pc01;
    }
    public void setpc02(int pc02){
        this.v_pc02=pc02;
    }
    public void setpc03(int pc03){
        this.v_pc03=pc03;
    }
    public void setef(int ef){
        this.v_ef=ef;
    }
    
    //Get
    public String getnombre(){
        return v_nombre;
    }
    public String getfoto(){
        return v_foto;
    }
    public int getedad(){
        return v_edad;
    }
    public int getpc01(){
        return v_pc01;
    }
    public int getpc02(){
        return v_pc02;
    }
    public int getpc03(){
        return v_pc03;
    }
    public int getef(){
        return v_ef;
    }

    //Funciones
    


}
