/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo3;
import Figuras.Circulo;

/**
 *
 * @author personal
 */
public class Polimorfismo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo c = new Circulo();
 
        c.setRadio(15);
        System.out.println(c.calcularArea());
        System.out.println(c.calcularPerimetro());
       
    }
    
}
