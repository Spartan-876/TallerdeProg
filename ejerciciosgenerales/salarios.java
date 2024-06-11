package ejerciciosgenerales;
import java.util.Scanner;

public class salarios {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String sector;
        char sexo, s1='F',s2='M';
        float salarioN = 0f,desc=0f,salariof;

        System.out.println("Aumento de salarios");
        System.out.println("Ingrese  su sexo:");
        sexo=lector.nextLine().charAt(0);
        lector.nextLine();

        System.out.println("Ingrese su sector:");
        sector=lector.nextLine();
        lector.nextLine();

        if (sector.equalsIgnoreCase("salud")){
            salarioN+=15000f;
            if (sexo==s2){
                desc+=0.25f;
            }else {
                if (sexo==s1){
                    desc+=0.2f;
                }
            }
        } else {
            if (sector.equalsIgnoreCase("educación")){
                salarioN+=12000f;
                if (sexo==s2){
                    desc+=0.12f;
                }else {
                    if (sexo==s1){
                        desc+=0.11f;
                    }
                }
            }else {
                if (sector.equalsIgnoreCase("transporte")){
                    salarioN+=18000f;
                    if (sexo==s2){
                        desc+=0.2f;
                    }else {
                        if (sexo==s1){
                            desc+=0.15f;
                        }
                    }
                }
            }
        }

        salariof = salarioN + (salarioN*desc);

        System.out.println("El salario neto es de: "+salarioN);
        System.out.println("El salario final es de: "+ salariof);
    }
}
