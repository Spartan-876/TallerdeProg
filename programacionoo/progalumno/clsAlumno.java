package programacionoo.progalumno;

import java.util.Scanner;

public class clsAlumno {
    //1. Caracteristicas
    //1.1 Atributos
    public static final int max=3;
    private int m_cantidad;
    private String[] v_codigo = new String[max];
    private String[] v_nombre = new String[max];
    private int[][] m_notas = new int[max][3];      //3 Columnas
    private Scanner Leer= new Scanner(System.in);


    //1.2 Getter y Setter
    public int getCantidad(){
        return this.m_cantidad;
    }

    //1.3 Constructores
    public  clsAlumno(){
        m_cantidad=0;

        //Limpiar un vector
        this.LimpiarVector(this.v_codigo);
        this.LimpiarVector(this.v_nombre);
        this.LimpiarMatriz(this.m_notas);
    }


    //2. Comportamientos(métodos)

    //Procedimeintos que seran utlizados sólo dentro de la clase(private)
    private void LimpiarVector(String[] vector){
        //Limpiar vectores de tipo String
        for(int i=0; i< vector.length;i++){
            vector[i]="*";
        }
    }

    private void LimpiarMatriz(int[][] matriz){
        //Limpiar matriz de tipo entero
        for(int i=0; i< matriz.length;i++){
            for(int j=0; j< matriz[0].length;j++){
                matriz[i][j]=0;
            }
        }
    }

    private int ObtenerIndex(String CodigoEstudiante){

        for(int i=0; i< this.getCantidad() ;i++){
            if( CodigoEstudiante.equals(this.v_codigo[i])){
                return i;
            }
        }

        return -1;
    }

    //Métodos propios del sistema
    public void Registrar(){
        String Est_Codigo, Est_Nombre;
        int Est_Nota1,Est_Nota2,Est_Nota3;

        if(m_cantidad <= (max -1) ){

            //[1] Registrar Alumno
            System.out.println("Opción 01: Registrar Datos Alumno");
            System.out.println("==================================");

            System.out.println("Ingresar los Siguientes Datos " + (this.getCantidad() + 1) + "/" + max);
            System.out.println("Código: ");
            Est_Codigo= Leer.nextLine();

            System.out.println("Nombre: ");
            Est_Nombre= Leer.nextLine();

            System.out.println("Nota 01: ");
            Est_Nota1= Leer.nextInt();
            Leer.nextLine();

            System.out.println("Nota 02: ");
            Est_Nota2= Leer.nextInt();
            Leer.nextLine();

            System.out.println("Nota 03: ");
            Est_Nota3= Leer.nextInt();
            Leer.nextLine();


            this.v_codigo[m_cantidad]=Est_Codigo;
            this.v_nombre[m_cantidad]=Est_Nombre;

            this.m_notas[m_cantidad][0]=Est_Nota1;
            this.m_notas[m_cantidad][1]=Est_Nota2;
            this.m_notas[m_cantidad][2]=Est_Nota3;

            System.out.println("MENSAJE: Registro Exitoso.");
            m_cantidad = m_cantidad+ 1;
        }else {
            System.out.println("ERROR: BD sin espacio para registrar un nuevo estudiante.");
        }
    }

    public void modificar(String CodigoEstudiante){
        int Est_Nota1,Est_Nota2,Est_Nota3;
        int IndexEstudiante;

        IndexEstudiante = this.ObtenerIndex(CodigoEstudiante);

        if( IndexEstudiante !=- 1 & IndexEstudiante >= 0 ){

            System.out.println("Ingresar los Siguientes Datos a Modificar:");

            System.out.println("Nota 01: ");
            Est_Nota1= Leer.nextInt();
            Leer.nextLine();

            System.out.println("Nota 02: ");
            Est_Nota2= Leer.nextInt();
            Leer.nextLine();

            System.out.println("Nota 03: ");
            Est_Nota3= Leer.nextInt();
            Leer.nextLine();

            this.m_notas[IndexEstudiante][0]=Est_Nota1;
            this.m_notas[IndexEstudiante][1]=Est_Nota2;
            this.m_notas[IndexEstudiante][2]=Est_Nota3;

            System.out.println("MENSAJE: Modificación Exitosa.");
        }else{
            System.out.println("Estudiante no encontrado");
        }


    }

    public void mostrar(){
        System.out.println("Opción 03: Listado de Estudiantes");
        System.out.println("==================================");

        System.out.printf("\nN\tN1\tN2\tN3\tCOD\tEstudiante: \n");
        System.out.println("--------------------------------");
        for(int i=0; i< this.v_nombre.length;i++){
            System.out.printf("%d\t%d\t%d\t%d\t%s\t%s" ,i,this.m_notas[i][0],this.m_notas[i][1],this.m_notas[i][2],this.v_codigo[i], this.v_nombre[i]);
            System.out.printf("\n");
        }
        System.out.println("------------------------------");
        System.out.printf("\n");
    }

    public void Reporte(){
        System.out.println("Opción 04: Reporte");
        System.out.println("==================================");

    }
}