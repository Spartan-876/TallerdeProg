package ejerciciosmatrices;
//copiar una matriz
public class enun11 {
    public static void main(String[] args) {
        int [][]matDig={
            {1,7,2},
            {9,3,7},
            {4,9,1},
            {1,5,7}
        };
        int [][]matcopy=matDig.clone();
        System.out.println("Matriz copia");
        for(int i=0;i<matcopy.length;i++){
            for(int j=0;j<matcopy[0].length;j++){
               System.out.print(matcopy[i][j]+" "); 
            }
            System.out.println();
        }
    }

}
