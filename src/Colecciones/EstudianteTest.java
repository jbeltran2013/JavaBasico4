/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author alumno
 */
public class EstudianteTest {
    
    public static void main(String args[]){
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
        Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
       
        // ArrayList --ordena la colleccion
        ArrayList<Estudiante> c = new ArrayList<Estudiante>();
        c.add(e1);
        c.add(e2);
        c.add(e3);
        Collections.sort(c);
        
        for (Estudiante e : c) {
            System.out.println(e.getNombres() + " " + e.getApellidos());
        }
        
        //accede a la lista por su index
        System.out.println("--> "+c.get(2).getNombres().toString());
       
    }
}
