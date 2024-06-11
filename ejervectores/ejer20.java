package ejervectores;
//elementos en un rango
public class ejer20 {
    public static void main(String[] args) {
        int cont=0;
        int []lstnum={10,65,98,34,25,37,16,24,15,18,3,4,7,6};
        for (int i=0;i<lstnum.length;i++){
            if (lstnum[i]<50 & lstnum[i]>10){
                cont++;
            }
        }
        System.out.println("La cantidad de elemetos en el rango es: "+ cont);
    }
}
