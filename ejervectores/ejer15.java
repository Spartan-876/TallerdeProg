package ejervectores;
//Intercalar vectores
public class ejer15 {
    public static void main(String[] args) {
        int []lstnum1={1,2,3,4,5,6,7,8,9,10};
        int []lstnum2={11,12,13,14,15,16,17,18,19,20};
        boolean cambio=false;
        for (int i=0;i<lstnum1.length;i++){
            if (cambio){
                System.out.print(lstnum1[i]+" ");
            }else{
                System.out.print(lstnum2[i]+" ");
            }
            cambio=!cambio;
        }
    }
}
