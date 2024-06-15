package programacionoo.ejerclases;

public class ejer08 {
    private String numeroCuenta;
    private double saldo;
    private String titular;
    //constructor 
    public ejer08(String num, double sal, String tit){
        this.numeroCuenta=num;
        this.saldo=sal;
        this.titular=tit;
    }    
    //set
    public void setnumeroCuenta(String num){
        this.numeroCuenta=num;
    }
    public void setsaldo(double sal){
        this.saldo=sal;
    }
    public void settitular(String tit){
        this.titular=tit;
    }
    //get
    public String getnumeroCuenta(){
        return this.numeroCuenta;
    }
    public double getsaldo(){
        return this.saldo;
    }
    public String gettitular(){
        return this.titular;
    }   
    //metodo
    public void informe(){
        System.out.printf("""
            ----------------------- 
              DATOS DE LA CUENTA    
            ----------------------- 
            Cuenta:    %s
            Titular:   %s
            Saldo:     %.2f
            -----------------------
                """,this.numeroCuenta,this.titular,this.saldo);
    }    
    //funcion
    public void depositar(double cant){
        this.saldo+=cant;
    }
    public void retirar(double cant){
        this.saldo-=cant;
    }
}
