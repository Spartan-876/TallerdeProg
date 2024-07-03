package ejerciciosgenerales.sem14;

public class clsalumno {
    private String m_nombre;

    public clsalumno (String valor){
        this.m_nombre=valor;
    }

    public void setnombre (String valor){
        this.m_nombre=valor;
    }
    public String getnombre (){
        return this.m_nombre;
    }

    @Override
    public String toString(){
        return "El nombre es: "+ this.m_nombre;
    }

}
