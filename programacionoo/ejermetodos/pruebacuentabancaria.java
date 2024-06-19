package programacionoo.ejermetodos;

import java.util.Date;

public class pruebacuentabancaria {
    public static void main(String[] args) {
        classcuentabancaria cuenta1=new classcuentabancaria (1594815,"Johnc",500.0,"Corriente",new Date(110,8,15),1000.0,"USD","Activa",3);

        cuenta1.informe_completo();

        cuenta1.activar_alertas();
        cuenta1.consultar_numcuenta();
        cuenta1.act_lim_credito(5000);
        cuenta1.depositar(300);
        cuenta1.consultar_transacciones();

        cuenta1.informe_completo();
        

    }
}
