package ejervectores;
//sumar elementos pares de un vector
public class ejer10 {
    public static void main(String[] args) {
        int sumapar=0;
        int []lstnum={15,24,17,16,8};
        for (int i=0;i<lstnum.length;i++){
            if ((lstnum[i]%2)==0){
                sumapar+=lstnum[i];
            }
        }
        System.out.println("La suma de los pares es: "+sumapar);
    }
}
