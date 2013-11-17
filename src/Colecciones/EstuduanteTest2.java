/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author alumno
 */
public class EstuduanteTest2 {
    
    public static void main(String args[]){
    Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
    
    // LinkedList
    //Encola la Lista
    LinkedList<Estudiante> pila = new LinkedList<Estudiante>();
    pila.addFirst(e1);
    pila.addFirst(e2);
    pila.addFirst(e3);
    
    ListIterator<Estudiante> ite = pila.listIterator();
    while(ite.hasNext()){
        Estudiante e = (Estudiante) pila.poll();
        System.out.println(e.getNombres());
    }
    
    System.out.println(pila.size());
    
  }   
}
