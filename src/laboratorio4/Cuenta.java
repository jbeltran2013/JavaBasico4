/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author alumno
 */
public class Cuenta {
    private long idCuenta;
    
    public Cuenta(long idCuenta) {
        this.idCuenta = idCuenta;
    }
    
    public double retirarDeCajero(double cuantoDesea) throws SaldoInsuficienteException {
        double saldoActual = 5000;
        
        if(saldoActual < cuantoDesea){
            throw new SaldoInsuficienteException(saldoActual, cuantoDesea);
        } else {
            return saldoActual - cuantoDesea;
        }
    }
}
