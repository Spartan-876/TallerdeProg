package ejerciciosmatrices;
//Imprimir la diagonal principal
public class enun04 {
    public static void main(String[] args) {
        int [][]matDig={
            {1,7,2},
            {9,3,4},
            {4,6,1}
        };
        for(int i=0;i<matDig.length;i++){
            for(int j=0;j<matDig.length;j++){
                if (i==j) {
                    System.out.print(matDig[i][j]+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
