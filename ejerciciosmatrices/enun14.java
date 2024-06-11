package ejerciciosmatrices;
//cantidad de pares
public class enun14 {
    public static void main(String[] args) {
        int cont=0;
        int [][]matDig={
            {1,7,2,6},
            {9,3,7,8},
            {4,9,1,2},
            {1,5,7,9}
        };
        for(int i=0;i<matDig.length;i++){
            for(int j=0;j<matDig.length;j++){
                if (matDig[i][j]%2==0) {
                   cont++; 
                }
            }
        }
        System.out.println("La cantidad de elementos pares es: "+cont);
    }
}
