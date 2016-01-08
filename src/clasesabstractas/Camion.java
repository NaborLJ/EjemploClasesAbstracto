/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesabstractas;

/**
 *
 * @author nlopezjimenez
 */
public class Camion extends Vehiculos {
    int numRuedas;
    public Camion(int cilindrada,int potencia,int numRuedas){
        super(cilindrada,potencia);
        this.numRuedas=numRuedas;
    }
    
public double calcularImpuesto(){
    return getCilindrada()/30+getPotencia()*20+numRuedas*20;
  }
}