/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author alumno
 */
public class SaldoInsuficienteException extends Exception {
    public double saldo, cuantoDesea;
    
    public SaldoInsuficienteException(double saldo, double cuantoDesea) {
        super("En su cuenta tiene "+ saldo + " soles. No puede prestarse " + cuantoDesea +" soles.");
        this.saldo = saldo;
        this.cuantoDesea = cuantoDesea;
    }
    
    public static void main(String[] args) {
        SaldoInsuficienteException s = new SaldoInsuficienteException(500,200);
        System.out.println("Saldo : "+s);
        
    }
}
