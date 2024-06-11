package ejerciciosmatrices;
//suma de los elementos de la diagonal secundaria
public class enun13 {
    public static void main(String[] args) {
        int sum=0;
        int [][]matDig={
            {1,7,2,6},
            {9,3,7,8},
            {4,9,1,2},
            {1,5,7,9}
        };
        int cont=(matDig[0].length-1);
        for(int i=0;i<matDig.length;i++){
            for(int j=0;j<matDig.length;j++){
                if ((i+j)==(cont)) {
                    sum+=matDig[i][j];
                }
            }
        }
        System.out.println("La suma de los elementos de la diagonal secundaria es: "+sum);
    }
}
