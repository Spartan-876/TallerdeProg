package ejervectores;

public class ejer14 {
    public static void main(String[] args) {
        int []lstnum1={1,2,3,4,5,6,7,8,9};
        int []lstnum2={2,5,6,9,10,12};
        System.out.println("Intersección entre vector 1 y 2");
        for (int i=0;i<lstnum1.length;i++){
            for (int j=0;j<lstnum2.length;j++){
                if (lstnum1[i]==lstnum2[j]){
                    System.out.print(lstnum1[i]+" ");
                }
            }
        }
    }
}
