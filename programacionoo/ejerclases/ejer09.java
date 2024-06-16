package programacionoo.ejerclases;

public class ejer09 {
    private String titulo;
    private String director;
    private int duracion;
    //constructor 
    public ejer09(String tit, String dir, int dur) {
        this.titulo = tit;
        this.director = dir;
        this.duracion = dur;
    }
    //set
    public void settitulo(String tit) {
        this.titulo = tit;
    }
    public void setdirector(String dir) {
        this.director = dir;
    }
    public void setduracion(int dur) {  
        this.duracion = dur;
    }
    //get
    public String gettitulo() {
        return this.titulo;
    }
    public String getdirector() {
        return this.director;
    }
    public int getduracion() {  
        return this.duracion;
    }
    //metodo
    public void informe() {
        System.out.printf("""
            -----------------------
             DATOS DE LA PELÍCULA
            -----------------------
            Titulo:    %s
            Director:  %s   
            Duración:  %d
            -----------------------
                """, this.gettitulo(), this.getdirector(), this.getduracion());
    }
}
