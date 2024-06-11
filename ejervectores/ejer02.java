package ejervectores;
//promedio del arreglo
public class ejer02 {
    public static void main(String[] args) {
        int sum=0;
        double prom;
        int []lstnum= {9,3,4,5,6};
        for (int i=0;i<lstnum.length;i++){
            sum+=lstnum[i];
        }
        prom=(double) sum/lstnum.length;
        System.out.println("El promedio es: "+prom);
    }
}
