package ejerciciosmatrices;
//Matriz transpuesta
public class enun08 {
    public static void main(String[] args) {
        int [][]matDig={
            {1,7,2},
            {9,3,7},
            {4,9,1},
            {1,5,7}
        };
        int [][]mattrans=new int[matDig[0].length][matDig.length];
        for(int i=0;i<matDig.length;i++){
            for (int j=0;j<matDig[0].length;j++){
                mattrans[j][i]=matDig[i][j];
            }
        }
        for(int i=0;i<mattrans.length;i++){
            for (int j=0;j<mattrans[0].length;j++){
                System.out.print(mattrans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
