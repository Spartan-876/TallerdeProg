package ejerciciosgenerales;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Practicas {

    public static void main(String[] args) {
        //DECLARACION DE VARIABLES
        final   String nombre = "TIENDA ABC";
        final   String nombrse = "COMPRAS";
        final   String calle = "AV. SAENS PEÑA 376";
        final   String cix = "chiclayo";
        final   String lote = "lote: b";
        final   String casa = "term: 5268";
        final   String fecha = "fecha: 07mar22";
        final   String hora = "hora: 15:35";
        final   String vent = "VEND: juan";
        String cliente, cosa;
        short cant;
        float precio;
        float porcentajededescuento=0f;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre del cliente:");
        cliente = entrada.nextLine();
        if(cliente.equals("ANA")||cliente.equals("JUAN")){
            porcentajededescuento=0.05f;
        }
        entrada.nextLine();

        System.out.println("Nombre del producto:");
        cosa = entrada.nextLine();
        if(cosa.toUpperCase().contains("GAMER")){
            porcentajededescuento=porcentajededescuento+0.02f;
        }
        entrada.nextLine();

        System.out.println("Cantidad del producto:");
        cant = entrada.nextShort();
        entrada.nextLine();

        System.out.println("Ingrese el precio:");
        precio = entrada.nextFloat();
        precio = precio*cant;
        precio=precio-(precio*porcentajededescuento);
        entrada.nextLine();

        System.out.println("   ");
        System.out.println("   ");
        espaciado();
        System.out.printf("%20s", nombre);
        espaciadoln();
        prt("ID: 0000252145");
        System.out.println("");
        System.out.printf("%17s",nombrse);
        System.out.printf("\n%23s", calle);
        System.out.printf("\n%18S", cix);
        System.out.printf("\n%12S", lote);
        System.out.printf("%13S", casa);
        espaciadoln();
        //System.out.printf("%S",fecha);
        Date time=Calendar.getInstance().getTime();
        System.out.print("Fechaaa: "+new SimpleDateFormat("ddMMMyy").format(time));
        System.out.println(" HORAAA: "+ new SimpleDateFormat("hh:mm").format(time));
        //System.out.printf("%16S", hora);
        System.out.printf("\n%S", vent);
        System.out.printf("%10s: %S","CLI", cliente);
        espaciadoln();
        System.out.println(cant+" "+cosa);
        System.out.printf("%10s","("+precio+")");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("PAGO TOTAL: S/."+precio);
        System.out.println("  ");
        espaciado();
        System.out.println("VUELVA PRONTO!!");
        espaciado();

    }
    public static void espaciado(){
        System.out.println("#".repeat(30));
    }
    public static void espaciadoln(){
        System.out.println("\n"+"#".repeat(40));
    }

    public static void prt(String texto){
        System.out.println(texto);
    }
}


