/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;
/* Ejemplo Interface Set y SortedSet, clase HashSet y TreeSet aprenderaprogramar.com */
import java.util.Objects;
public class HashSetExample implements Comparable<HashSetExample>{
    public int idPersona;       public String nombre;       public int altura;
 
    public HashSetExample(int idPersona, String nombre, int altura) {
        this.idPersona = idPersona;   this.nombre = nombre;    this.altura = altura;}
 
    @Override
    public String toString() { return "Persona-> ID: "+idPersona+" Nombre: "+nombre+" Altura: "+altura+"\n";  }
 
    @Override
    public int compareTo(HashSetExample o) { return this.altura-o.altura; }
 
    @Override
    public int hashCode() { return altura + nombre.hashCode() + idPersona; }
 
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {   return false;  }
        if (getClass() != obj.getClass()) {  return false;   }
        final HashSetExample other = (HashSetExample) obj;
        if (this.idPersona != other.idPersona) {  return false;    }
        if (!Objects.equals(this.nombre, other.nombre)) {    return false;     }
        if (this.altura != other.altura) {     return false;   }
        return true;
    }
}