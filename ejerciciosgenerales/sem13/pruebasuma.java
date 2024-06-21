package ejerciciosgenerales.sem13;

public class pruebasuma {
    public static void main(String[] args) {
        clssuma op=new clssuma();
        System.out.println("La suma de 2 números es: "+clssuma.suma(10, 20));
        System.out.println("La suma de 3 números es: "+op.suma(10,20, 30));
        System.out.println("La suma de 4 números es: "+op.suma(10,20, 30,40));
        System.out.println("UTP "+op.toString());
    }

}
