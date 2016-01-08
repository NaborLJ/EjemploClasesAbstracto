
package clasesabstractas;

import javax.swing.JOptionPane;

/**
 *
 * @author nlopezjimenez
 */
public  class ClasesAbstractas  {

    
    public static void main(String[] args) {
       Motos vespa= new Motos(125,50);
       JOptionPane.showMessageDialog(null,"Impuesto moto "+vespa.calcularImpuesto());
       JOptionPane.showMessageDialog(null,vespa.arrancar());
       Coche c3 = new Coche(100,80,5);
       JOptionPane.showMessageDialog(null,"Impuesto coche "+c3.calcularImpuesto());
       JOptionPane.showMessageDialog(null,c3.arrancar());
       JOptionPane.showMessageDialog(null,c3.toString());
       Camion barreiro = new Camion(8,3000,300);
       JOptionPane.showMessageDialog(null,"Impuesto camion "+barreiro.calcularImpuesto());
       JOptionPane.showMessageDialog(null,barreiro.arrancar());
       
    }
    
}
