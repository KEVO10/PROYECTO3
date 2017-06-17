package ec.ed.octavo.test;

import ec.edu.octavo.entidades.clsCliente;
import ec.edu.octavo.funciones.crudCliente;
//import ec.com.laelegancia.rnegocios.rProductos;

public class test {
    public static void main(String[] args) {
        clsCliente c= new clsCliente(8,"1600688699","kevin","Shell");
         // clsCliente c= new clsCliente(2,"kevin","Shell","0995698936","poolc1994@gmail.com","1600688699");
clsCliente d;
        crudCliente cc = new crudCliente();
        
        System.out.println("Prueba de clases");
        System.out.println("=============================================");
        System.out.println("contenido de la clase c");
        System.out.println(c.toString());
        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.println("INSERTANDO");
        if (cc.save(c)) {
            System.out.println("Guardado");
        }else{
            System.out.println("error!!!!");
        }
//        System.out.println("Comprobando si hay datos");
//        System.out.println(cc.findbyId(c).toString());
//        System.out.println("=============================================");
//        System.out.println("=============================================");
//        System.out.println("Eliminando");    
//        if (cc.delete(c)) {
//            System.out.println("eliminado");
//        }else{
//            System.out.println("no se ha podido eliminar");
//        }
//        rProductos r=new rProductos();
//        r.subirPrecioxId(2,4);
//        r.findbyDisponible();
        
//        //------------------- producto disponible
//        rProductos r=new rProductos();
//        r.findbyDisponible();
    }
}
