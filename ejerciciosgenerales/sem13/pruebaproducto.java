package ejerciciosgenerales.sem13;

public class pruebaproducto {
    public static void main(String[] args) {
        clsProducto producto1=new clsProducto("TV",5500.0);

        producto1.mostrarinfo();
        producto1.obtenerprecio();

        //forma01
        System.out.println("El nuevo precio es: "+ producto1.obtenerprecio());  

        //forma02
        double nweprec;
        nweprec=producto1.obtenerprecio();
        System.out.println("El nuevo precio es: "+nweprec);
        System.out.println("El IGV es: "+(nweprec*0.18));
        System.out.println("El total es: "+(nweprec*1.18));

    }
}
