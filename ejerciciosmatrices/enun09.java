package ejerciciosmatrices;
//verificar matriz identidad
public class enun09 {
    public static void main(String[] args) {
        int [][]matDig={
            {1,0,0,0},
            {0,1,0,0},
            {0,0,1,0},
            {0,0,0,1}
        };
        boolean es=true;
        for(int i=0;i<matDig.length;i++){
            for(int j=0;j<matDig.length;j++){
                if (i==j){
                    if (matDig[i][j]!=1) {
                        es=false;   
                    }
                }else {
                    if (matDig[i][j]!=0) {
                        es=false;   
                    }
                }
            }
        }
        if (es) {
            System.out.println("Es matriz identidad");
        }else{
            System.out.println("No es matriz identidad");
        }
    }
}
