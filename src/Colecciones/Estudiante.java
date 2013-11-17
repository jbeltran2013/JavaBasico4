/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

/**
 *
 * @author alumno
 */
public class Estudiante implements Comparable<Estudiante> {
    
    private String nombres;
    private String apellidos;
    private String direccion;
    private int codMatricula;
    
    public Estudiante(String name, String lastName, String Direction, int codMat){
        this.nombres=name;
        this.apellidos=lastName;
        this.direccion=Direction;
        this.codMatricula=codMat;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    //implements te obliga a implementar su metodo compareTo
    public int compareTo(Estudiante o) {
        String apellidos = o.getApellidos().toLowerCase();
        String apellidosLocal = this.getApellidos().toLowerCase();
        return apellidosLocal.compareTo(apellidos);
    }
    // Crear su constructor y getters/setters por cada atributo
}
