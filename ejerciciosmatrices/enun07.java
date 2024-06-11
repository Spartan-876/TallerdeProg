package ejerciciosmatrices;
//suma de columnas
public class enun07 {
    public static void main(String[] args){
        int [][]matDig={
            {1,7,2},
            {9,3,7},
            {4,9,1},
            {1,5,7}
        };
        int []lstsum=new int[matDig[0].length];
        for(int i=0;i<matDig.length;i++){
            for(int  j=0;j<matDig[0].length;j++){
                lstsum[j]+=matDig[i][j];
            }
        }
        System.out.println("La suma de las columnas es:");
        for(int i=0;i<lstsum.length;i++){
            System.out.print(lstsum[i]+" "); 
        }
    }
}
