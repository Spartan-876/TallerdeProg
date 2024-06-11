package ejervectores;
//cantidad de pares
public class ejer04 {
    public static void main(String[] args) {
        int cont=0;
        int[]lstnum={8,6,15,16,29,16,25,49,82};
        for (int i=0;i<lstnum.length;i++){
            if (lstnum[i]%2==0){
                cont++;
            }
        }
        System.out.println("La cantidad de pares es: "+cont);
    }
}
