package programacionoo.ejermetodos;

import java.util.Date;

public class classcuentabancaria {
    //Atributos
    private int numcuenta;
    private String titular;
    private double saldo;
    private String tipo_cuenta;
    private Date fecha_apertura;
    private Double limtecredito;
    private String moneda;
    private String estado;
    private double tasainteres;
    private String []transacciones=new String[100];
    private int conttransacciones=0;


    //Constructor
    public classcuentabancaria(int num, String tit, double sal, String tip, Date fec, Double lim, String mon, String est, double tasa){
        this.numcuenta=num;
        this.titular=tit;
        this.saldo=sal;
        this.tipo_cuenta=tip;
        this.fecha_apertura=fec;
        this.limtecredito=lim;
        this.moneda=mon;
        this.estado=est;
        this.tasainteres=tasa;
    }
    //Set
    public void setnumcuenta(int num){
        this.numcuenta=num;
    }
    public void settitular(String tit){
        this.titular=tit;
    }
    public void setsaldo(double sal){
        this.saldo=sal;
    }
    public void settipo_cuenta(String tip){
        this.tipo_cuenta=tip;
    }
    public void setfecha_apertura(Date fec){
        this.fecha_apertura=fec;
    }
    public void setlimtecredito(Double lim){
        this.limtecredito=lim;
    }
    public void setmoneda(String mon){
        this.moneda=mon;
    }  
    public void setestado(String est){
        this.estado=est;
    }
    public void settasainteres(double tasa){
        this.tasainteres=tasa;
    }
    public void settransacciones(String []tra){
        this.transacciones=tra;
    }
    //Get
    public int getnumcuenta(){
        return numcuenta;
    }
    public String gettitular(){
        return titular;
    }
    public double getsaldo(){
        return saldo;
    }
    public String gettipo_cuenta(){
        return tipo_cuenta;
    }    
    public Date getfecha_apertura(){
        return fecha_apertura;
    }
    public Double getlimtecredito(){
        return limtecredito;
    }
    public String getmoneda(){
        return moneda;
    }
    public String getestado(){
        return estado;
    }
    public double gettasainteres(){
        return tasainteres;
    }
    public String []gettransacciones(){
        return transacciones;
    }
    
    //Metodos
        //Procesos
        public void depositar(double dep){
            this.saldo=this.saldo+dep;
            this.transacciones[conttransacciones]=String.format("Deposito: %.2f",dep);
            conttransacciones++;
        }
        public void retirar(double ret){
            if(this.saldo>=ret){
                this.saldo=this.saldo-ret;
                this.transacciones[conttransacciones]=String.format("Retiro: %.2f",ret);
                conttransacciones++;
            } else{
                System.out.println("Fondos insuficientes");
            }
        }
        public void calcularinteres(double inter){
            inter=this.saldo*this.tasainteres/100;
            this.saldo+=inter;
            this.transacciones[conttransacciones]=String.format("Interes Ganado: %.2f",inter);
            conttransacciones++;
        }
        public void act_interes(double inter){
            this.tasainteres=inter;
            this.transacciones[conttransacciones]=String.format("Actualización de Interes: %.2f",inter);
            conttransacciones++;
        }
        public void bloquearcuenta(){
            this.estado="Bloqueada";
        }
        public void desbloquearcuenta(){
            this.estado="Activa";
        }
        public void act_lim_credito(double lim){
            this.limtecredito=lim;
            this.transacciones[conttransacciones]=String.format("Actialización de Credito: %.2f",lim);
            conttransacciones++;
        }
        public void convertir_moneda(String mod){
            if (mod=="USD"){ //USD a SOL
                this.saldo*=3.5;
            } else if(mod=="SOL"){ //SOL a USD
                this.saldo/=3.5;
            }
            this.transacciones[conttransacciones]=String.format("Cambio de Moneda: %s",mod);
            conttransacciones++;
        }
        public void cerrar_cuenta(){
            this.numcuenta=0;
            this.titular="";
            this.saldo=0.0;
            this.tipo_cuenta="";
            this.fecha_apertura=null;
            this.limtecredito=0.0;
            this.moneda="";
            this.estado="Cerrada";
            this.tasainteres=0;
            this.transacciones=new String[100];
            conttransacciones=0;
        }
        public void activar_alertas(){
            System.out.printf("%nAlertas activadas%n");
        }
        public void informe_completo(){
            System.out.printf("""
            %n----------------------------------
                  Informacion completa
            ----------------------------------
            Cuenta: %d
            Titular: %s
            Saldo: %.2f
            Moneda: %s
            Estado: %s
            Tasa de Interes: %.2f
            Credito: %.2f
            Fecha de apertura: %td-%tm-%tY
            ----------------------------------
            Historial de transacciones
            ----------------------------------
            """,this.getnumcuenta(),this.gettitular(),this.getsaldo(),this.getmoneda(),this.getestado(),this.gettasainteres(),this.getlimtecredito(),this.getfecha_apertura(),this.getfecha_apertura(),this.getfecha_apertura());
            for (int i = 0; i < conttransacciones; i++) {
                System.out.println(this.transacciones[i]);
            }
            System.out.println("----------------------------------");
        }
        
        //Funciones
        public String consultar_saldo(){
            return String.format("Saldo: %.2f",this.saldo);
        }
        public String consultar_transacciones(){
            String rpta="";
            for (int i = 0; i < conttransacciones; i++) {
                rpta+=this.transacciones[i]+"\n";
            }
            return rpta; 
        }
        public String consultar_estado(){
            return String.format("Estado: %S",this.getestado());
        }
        public String saldo_dispnible(){
            return String.format("Saldo Disponible: %.2f",this.saldo+this.limtecredito);
        }
        public String datos_titular(){
            return String.format("Titular: %s",this.gettitular());
        }
        public String consultar_limiteCredito(){
            return String.format("Limite Credito: %.2f",this.limtecredito);
        }
        public String consultar_tasa_interes(){
            return String.format("Tasa de Interes: %.2f",this.tasainteres);
        }
        public String consultar_moneda(){
            return String.format("Moneda: %s",this.moneda);
        }
        public String consultar_tipocuenta(){
            return String.format("Tipo de Cuenta: %s",this.tipo_cuenta);
        }
        public String consultar_numcuenta(){
            return String.format("Numero de Cuenta: %d",this.numcuenta);
        }
        public String consultar_fechap(){

            return String.format("Fecha formateada: %td-%tm-%tY\n",this.fecha_apertura,this.fecha_apertura,this.fecha_apertura);
        }
}
