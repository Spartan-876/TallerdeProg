package ejervectores;
//promedio de impares
public class ejer17 {
    public static void main(String[] args) {
        int cont=0,sum=0;
        double prom;
        int[] lstnum = {95, 45, 21, 82, 14};
        for (int i=0;i<lstnum.length;i++){
            if (lstnum[i]%2!=0){
                sum+=lstnum[i];
                cont++;
            }
        }
        prom=(double) sum/cont;
        System.out.printf("El promedio de los números impares es %.2f",prom);
    }
}
