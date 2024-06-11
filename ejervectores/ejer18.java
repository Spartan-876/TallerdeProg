package ejervectores;
//incrementar los elementos por su indice
public class ejer18 {
    public static void main(String[] args) {
        int []lstnum={15,26,48,92,37,21,34};
        for (int i=0;i<lstnum.length;i++){
            lstnum[i]+=i;
        }
        System.out.println("Resultados");
        for (int i=0;i<lstnum.length;i++){
            System.out.print(lstnum[i]+" ");
        }
    }
}
