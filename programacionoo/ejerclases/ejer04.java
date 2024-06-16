package programacionoo.ejerclases;

public class ejer04 {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    //constructor
    public ejer04(String tit, String aut, int num){
        this.titulo=tit;
        this.autor=aut;
        this.numeroPaginas=num;
    }
    //set 
    public void settitulo(String tit){
        this.titulo=tit;
    }
    public void setautor(String aut){
        this.autor=aut;
    }
    public void setnumeroPaginas(int num){
        this.numeroPaginas=num;
    }
    //get
    public String gettitulo(){
        return this.titulo;
    }
    public String getautor(){
        return this.autor;
    }
    public int getnumeroPaginas(){
        return this.numeroPaginas;
    }
    //metodo
    public void informe(){  
        System.out.printf("""
            -----------------------
              DATOS DEL LIBRO
            -----------------------
            Titulo:  %s
            Autor:   %s
            Paginas: %d
            -----------------------
            """,this.gettitulo(),this.getautor(),this.getnumeroPaginas());
    }
}
