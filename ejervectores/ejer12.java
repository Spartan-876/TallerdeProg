package ejervectores;
//Multiplicación de todos los elementos de un vector
public class ejer12 {
    public static void main(String[] args) {
        double multi=1;
        double []lstnum={2.6,5.21,4.6,5.32,1.2};
        for (int i=0;i<lstnum.length;i++){
            multi*=lstnum[i];
        }
        System.out.printf("La multiplicación de los elementos es: %.2f",multi);
    }
}
