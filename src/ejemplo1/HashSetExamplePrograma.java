/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/* Ejemplo Interface Set y SortedSet, clase HashSet y TreeSet aprenderaprogramar.com */
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
 
public class HashSetExamplePrograma  {
    public static void main (String []args)      {
        Set<HashSetExample> cjsp = new HashSet<HashSetExample>();
        SortedSet<HashSetExample> cjssp = new TreeSet<HashSetExample>();
        HashSetExample p = new HashSetExample(1,"Marta",165);
        cjsp.add(p);
        cjssp.add(p);
        p = new HashSetExample(2,"Elena",155);
        cjsp.add(p);
        cjssp.add(p);
        p = new HashSetExample(3,"María",170);
        cjsp.add(p);
        cjssp.add(p);
        System.out.println("Personas en el conjunto: "+cjsp);
        System.out.println("Personas en el conjunto ordenado: "+cjssp);
    }
}
