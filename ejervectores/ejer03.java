package ejervectores;
//mostrar el mayor y menor
public class ejer03 {
    public static void main(String[] args) {
        int mayor = 0,menor = 100,num;
        int []lstnum= {3,2,10,14,15};
        for (int i=0;i<lstnum.length;i++){
            num=lstnum[i];
            if (mayor<num){
                mayor=num;
            }
            if (menor>num){
                menor=num;
            }
        }
        System.out.println("Mayor: "+mayor+ " Menor: "+menor);
    }
}
