/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author alumno
 */
public class EstudianteTest4 {
    
    public static void main(String args[]){
    Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
    
    // HashMap
    HashMap<Integer, Estudiante> mapa = new HashMap<Integer, Estudiante>();
    mapa.put(100525, e1);
    mapa.put(100526, e2);
    mapa.put(100527, e3);
    
    //mapa.put(100528, e3);
    
    //accede a un elemento del map com su codigo
    Estudiante e = mapa.get(100526);
    
    System.out.println(e.getNombres() );
    
    Collection<Estudiante> co = mapa.values();
    
    for (Estudiante es : co) {
        System.out.println(es.getNombres());
    }
    
    //acceder por su codigo al estudiante
    System.out.println("--> "+mapa.get(100526).getNombres().toString());
 
}
    
}
