package programacionoo.ejerciciosv;

public class clsarreglo {
    int []lstnumeros={12,16,22,5,48,31};

    public void eliminarvalor(int valor){
        for(int i=0;i<lstnumeros.length;i++){
            if(lstnumeros[i]==valor){
                for(int j=i;j<(lstnumeros.length-1);j++){
                    lstnumeros[j]=lstnumeros[j+1];
                }
            }
        }        
        for(int i=0;i<lstnumeros.length;i++){
            if (i==lstnumeros.length-1) {
                lstnumeros[i]=0;
            }
            System.out.print(lstnumeros[i]+" ");
        }
    }
}
