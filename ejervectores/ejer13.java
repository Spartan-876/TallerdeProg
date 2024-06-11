package ejervectores;
//Hallar la mediana de un arreglo
import java.util.Arrays;

public class ejer13 {
    public static void main(String[] args) {
        int pos0,pos1,mediana;
        int []lstvariable={15,32,54,48,9,9,12,18,2,0};
        Arrays.sort(lstvariable);
        if (lstvariable.length%2==0){
            pos0=Math.round((float) lstvariable.length /2);
            pos1=pos0-1;
            mediana=Math.round((float) (lstvariable[pos0] + lstvariable[pos1]) /2);
        }else {
            pos0 = lstvariable.length / 2;
            mediana=lstvariable[pos0];
        }
        System.out.println("La mediana es: "+mediana);
    }
}
