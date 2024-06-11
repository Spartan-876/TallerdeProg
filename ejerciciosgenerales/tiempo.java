package ejerciciosgenerales;
import java.util.Scanner;

public class tiempo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int h,m,s;

        System.out.println("1 segundo después");
        System.out.println("Ingrese las horas:");
        h=lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese los minutos");
        m=lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese los segundos");
        s=lector.nextInt();
        lector.nextLine();

        if (s>=0 && s<=59 && m>=0 && m<=59 && h>=0 && h<=24){
            s=s+1;
            if (s == 60) {
                m=m+1;
                s=0;
                if (m == 60) {
                    h=h+1;
                    m=0;
                }
            }
            System.out.println("Hora: "+h+" minutos: "+m+" segundos:"+s);
        }else{
            System.out.println("ingresó valores incorrectos");
        }

    }
}
