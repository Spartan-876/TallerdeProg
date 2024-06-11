package ejervectores;
//Suma de 2 vectores
public class ejer16 {
    public static void main(String[] args) {
        int []lstnum1={10,1,9,2,8,3,7,6,4,5};
        int []lstnum2={11,12,13,14,15,16,17,18,19,20};
        int []lstresult=new int[10];
        System.out.println("Suma de vectores");
        for (int i=0;i<lstresult.length;i++){
            lstresult[i]=lstnum1[i]+lstnum2[i];
            System.out.print(lstresult[i]+" ");
        }
    }
}
