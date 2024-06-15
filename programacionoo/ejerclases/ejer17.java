package programacionoo.ejerclases;

public class ejer17 {
    private String nombre;
    private String email;
    private String telefono;
    //constructor
    public ejer17(String nom, String em, String tel){
        this.nombre=nom;
        this.email=em;
        this.telefono=tel;
    }
    //set
    public void setnombre(String nom){
        this.nombre=nom;
    }
    public void setemail(String em){
        this.email=em;
    }    
    public void settelefono(String tel){
        this.telefono=tel;
    }
    //get
    public String getnombre(){
        return this.nombre;
    }
    public String getemail(){
        return this.email;
    }
    public String gettelefono(){
        return this.telefono;
    }
    //metodo
    public void informe(){
        System.out.printf("""
            -----------------------
              DATOS DEL CLIENTE  
            -----------------------
            NOMBRE:   %s
            EMAIL:    %s
            TELEFONO: %s
            -----------------------
                """,this.nombre,this.email,this.telefono);
    }
    //funcion
    public void notificar(){
        System.out.println("Email enviado");
    }   
}
