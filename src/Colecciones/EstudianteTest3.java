/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author alumno
 */
public class EstudianteTest3 {
 
    public static void main(String args[]){
    Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
    
    // HashSet --no permite valores duplicados
    HashSet<Estudiante> set = new HashSet<Estudiante>();
    set.add(e1);
    set.add(e2);
    set.add(e3);
    set.add(e1);
    set.add(e1);
    set.add(e1);
    
    
    //Collections.sort(set);
    
    for (Estudiante e : set) { System.out.println(e.getNombres() + " " + e.getApellidos());
    }
  }
    
}
