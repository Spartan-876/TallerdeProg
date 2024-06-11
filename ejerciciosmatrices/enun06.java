package ejerciciosmatrices;
//suma de filas
public class enun06 {
    public static void main(String[] args) {
        int [][]matDig={
            {1,7,2,6},
            {9,3,7,8},
            {4,9,1,2},
            {1,5,7,9}
        };
        int []lstsum=new int[matDig.length];
        for(int i=0;i<matDig.length;i++){
            for(int  j=0;j<matDig[0].length;j++){
                lstsum[i]+=matDig[i][j];
            }
        }
        System.out.println("La suma de las filas es:");
        for(int i=0;i<lstsum.length;i++){
            System.out.println(lstsum[i]+" "); 
        }
    }
}
