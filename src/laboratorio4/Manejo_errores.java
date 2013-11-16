/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author alumno
 */
public class Manejo_errores {
    
    public static void main(String[] args) {
    int[] n=null; //= {11,22,33,44,55,66,77,88,99};
    try {
        for (int i=0; i<11;i++) {
        System.out.println( "Valor " + n[i]);
    }
    //ArrayIndexOutOfBoundsException
    //(indice de arreglo fuera de rango)
    //NullPointerException
    //(valor nulo)
    } catch (Exception e) {
       System.err.println(e);
       e.printStackTrace();
    }
}
    
}
