/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author alumno
 */
public class CuentasPrg {
    public static void main(String args[]){
    try {
        Cuenta c = new Cuenta(001);
        double nuevoSaldo = c.retirarDeCajero(7000);
        System.out.println("OPERACION REALIZADA, su saldo es: " + nuevoSaldo);
    } catch (SaldoInsuficienteException e){
        System.err.println(e.toString());
    }
 }
}
