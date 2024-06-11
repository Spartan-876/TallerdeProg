package ejerciciosmatrices;
//promedio de los elementos de una matriz
public class enun17 {
    public static void main(String[] args) {
        int sum=0;
        double prom;
        int [][]matDig={
            {1,7,2,6},
            {9,3,7,8},
            {4,9,1,2},
            {1,5,7,9}
        };
        int cantidad=matDig.length*matDig[0].length;
        for(int i=0;i<matDig.length;i++){
            for(int j=0;j<matDig.length;j++){
                sum+=matDig[i][j];
            }
        }
        prom=(double)sum/cantidad;
        System.out.printf("El promedio de los elementos es: %.2f",prom);
    }
}
