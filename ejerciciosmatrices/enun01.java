package ejerciciosmatrices;
//suma de dos matrices
public class enun01 {
    public static void main(String[] args) {
        int [][]matnum={
            {9,8,7},
            {6,5,4},
            {3,2,1}};

        int [][]matnum2={
            {10,11,12},
            {13,14,15},
            {16,17,18}};

        int [][]matresult=new int[3][3];
        for(int i=0;i<matnum.length;i++){
            for(int j=0;j<matnum[0].length;j++){
                matresult[i][j]=matnum[i][j]+matnum2[i][j];
            }
        }
        for(int i=0;i<matnum.length;i++){
            for(int j=0;j<matnum[0].length;j++){
                System.out.print(matresult[i][j]+" ");
            }
            System.out.println();
        }
    }
}
