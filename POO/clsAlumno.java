package POO;

import ejerciciosgenerales.progresion;

public class clsAlumno {
    //1. Caracteristicas (atributos/contructores/get y set)
        //1.1 Atributos
        private String m_nombre;
        private int m_edad;   
    

        //1.2 Constructor
            //1.2.1 Contructor vacio
            public clsAlumno(){
                m_nombre = "";
                m_edad = 0 ;
                System.out.println("Hola");
            }

            //1.2.2 Contructor con parametros
            public clsAlumno(String Valornombre, int Valoredad){
                this.m_nombre = Valornombre;
                this.m_edad = Valoredad;
            }
        //1.3 Get y Set
            //m_nombre  
            public void setnombre(String Valorn){
                this.m_nombre=Valorn;
            }

            public String getnombre(){
                return this.m_nombre;
            }

            //m_edad
            public void setedad(int Valore){
                this.m_edad=Valore;
            }
            
            public int getedad(){
                return this.m_edad;
            }

    //2. Comportamiento (metodos/Funciones)

        //2.1 Metodos
        public void informar (){
            System.out.printf("""
                -----------------------
                   DATOS DEL ALUMNO
                -----------------------
                Nombre: %s
                Edad: %d
                -----------------------
                    """,m_nombre,m_edad);
        }

        //2.2 Funciones
        public String obtenerDatos(){
            String rpta;
            rpta="La edad del alumno es: "+this.m_edad;
            return rpta;
        }

}            
