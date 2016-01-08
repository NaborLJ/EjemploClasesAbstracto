
package clasesabstractas;

/**
 *
 * @author nlopezjimenez
 */
public class Motos extends Vehiculos {
    
    public Motos(int cilindrada,int potencia){
        super(cilindrada,potencia);
    }
    public double calcularImpuesto(){
        return getCilindrada()/30+getPotencia()*10;
    }
}
