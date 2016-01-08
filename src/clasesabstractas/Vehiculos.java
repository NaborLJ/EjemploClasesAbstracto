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
public abstract class Vehiculos {
      private int cilindrada;
    private int potencia;

    public Vehiculos(int cilindrada, int potencia) {
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }
    
    
    public int getCilindrada(){
        return cilindrada;
        }
    public int getPotencia(){
        return potencia;
    }
    
    public String arrancar(){
        return "Arrancar el vehículo";
    }
    public abstract double calcularImpuesto();
        
    }

