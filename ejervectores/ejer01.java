package ejervectores;

//Suma de elementos de un arreglo

public class ejer01 {
    public static void main(String[] args) {
        int sum=0;
        int []lstnum= {9,3,4,5,6};
        for (int i=0;i<lstnum.length;i++){
            sum+=lstnum[i];
        }
        System.out.println("La suma es: "+sum);
    }
}
