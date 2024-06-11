package ejervectores;
//Suma de los elementos impares
public class ejer11 {
    public static void main(String[] args) {
        int sumaimpar=0;
        int []lstnum={15,24,17,16,8};
        for (int i=0;i<lstnum.length;i++){
            if ((lstnum[i]%2)!=0){
                sumaimpar+=lstnum[i];
            }
        }
        System.out.println("La suma de los impares es: "+sumaimpar);
    }
}
