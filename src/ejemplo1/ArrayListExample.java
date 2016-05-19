/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author Morita
 */
public class ArrayListExample 
{
    public static void main(String[] args)
    {
      Collection listaMarcasCoches = new ArrayList<String>();
       listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("Porsche");
        listaMarcasCoches.add("Aston Martin");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Mercedes");
        listaMarcasCoches.add("Seat");
        System.out.println("Número elementos antes de eliminar: " + listaMarcasCoches.size() ) ;
        System.out.println (listaMarcasCoches.toString() ) ;
        listaMarcasCoches.remove ("Seat");
        listaMarcasCoches.remove ("Mercedes");
        System.out.println("Número elementos después de eliminar Seat y Mercedes:" + listaMarcasCoches.size() ) ;
        System.out.println(listaMarcasCoches.toString () ); 



    }
    public void prueba()
    {
        System.out.println("hola mundo"); 
    }
}
