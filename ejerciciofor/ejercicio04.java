package ejerciciofor;


import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int cant,ans=1,preans=-1,result;
        do {
            System.out.println("Ingrese la cantidad de números: ");
            cant=lector.nextInt();
        }while (cant<=1);
        System.out.println("Los números son: ");
        for (int i=1;i<=cant;i++){
            result=ans+preans;
            System.out.print(result+"-");
            preans=ans;
            ans=result;
        }
    }
}
