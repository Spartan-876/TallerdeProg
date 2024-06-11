package ejerciciosmatrices;
//Producto de 2 matrices
public class enun03 {
    public static void main(String[] args) {
        int [][]matA={
            {1,2},
            {3,4},
            {5,6}};
        int [][]matB={
            {1,2,3},
            {4,5,6}};
        int [][]matC=new int[matA.length][matB[0].length];
        if (matA[0].length==matB.length){
            for(int i=0;i<matA.length;i++){
                for(int j=0;j<matB[0].length;j++){
                    for (int k=0;k<matB.length;k++){
                        matC[i][j]+=matA[i][k]*matB[k][j];
                    }
                }
            }
        }
        System.out.println("Matriz Resultante");
        for(int i=0;i<matC.length;i++){
            for(int j=0;j<matC[0].length;j++){
                System.out.print(matC[i][j]+" ");
            }
            System.out.println();
        }
    }
}
