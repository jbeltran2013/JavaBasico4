/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author alumno
 */
public class Manejo_Errores_Finaly {
    
    public static void main(String[] args) {
    int[] n = {11,22,33,44,55,66,77,88,99};
    
    try {
    for (int i=0; i<n.length;i++) {
        System.out.println( "Valor " + n[i]);
    }
    } catch (Exception e) {
        System.err.println(e);
        e.printStackTrace();
    } finally {
        System.out.println( "Aplicacion Terminada ");
    }
    }
    
}
