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
public class Coche extends Vehiculos{
    int numPuertas;
 public Coche(int cilindrada,int potencia, int numPuertas){
     super(cilindrada,potencia);
     this.numPuertas=numPuertas;
 }   

   
    
 public double calcularImpuesto(){
     return getCilindrada()/20+getPotencia()*20;
 }
 @Override
    public String toString() {
        return "Coche{" + "numPuertas=" + numPuertas + "potencia "+getPotencia()+"cilindrada "+getCilindrada()+'}';
    }
}
