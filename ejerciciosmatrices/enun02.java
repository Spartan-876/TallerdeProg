package ejerciciosmatrices;
//Resta de dos matrices
public class enun02 {
    public static void main(String[] args) {
        int [][]matnum={
            {1,2,3},
            {4,5,6},
            {7,8,9}};

        int [][]matnum2={
            {10,11,12},
            {13,14,15},
            {16,17,18}};

        int [][]matresult=new int[3][3];
        for(int i=0;i<matnum.length;i++){
            for(int j=0;j<matnum[0].length;j++){
                matresult[i][j]=matnum2[i][j]-matnum[i][j];
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
