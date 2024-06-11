package ejervectores;
//Reemplazar los negativos por 0
public class ejer19 {
    public static void main(String[] args) {
        int []lstnum={-26,15,-94,78,-32,2,5,4};
        for (int i=0;i<lstnum.length;i++){
            if (lstnum[i]<0){
                lstnum[i]=0;
            }
        }
        System.out.println("Resultado");
        for (int i=0;i<lstnum.length;i++){
            System.out.print( lstnum[i]+" ");
        }
    }
}