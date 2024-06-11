package ejerciciosmatrices;
//suma de elementos de la diagonal principal
public class enun12 {
    public static void main(String[] args) {
        int sum=0;
        int [][]matDig={
            {1,7,2},
            {9,3,4},
            {4,6,1}
        };
        for(int i=0;i<matDig.length;i++){
            for(int j=0;j<matDig.length;j++){
                if (i==j) {
                   sum+=matDig[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: "+sum);
    }
}
