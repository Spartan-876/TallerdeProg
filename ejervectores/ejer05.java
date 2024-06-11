package ejervectores;
//Imprimir vector invertido
public class ejer05 {
    public static void main(String[] Args) {
        int []lstnum={1,2,3,4,5,6,7,8,9};
        int []lstinver=new int[9];
        int j=0;
        for (int i=(lstnum.length-1);i>=0;i--){
            lstinver[j]=lstnum[i];
            j++;
        }
        System.out.println("Vector invertido");
        System.out.print("{ ");
        for (int i=0;i<lstinver.length;i++) {
            System.out.print(lstinver[i]+" ");
        }
        System.out.print("}");
    }
}
