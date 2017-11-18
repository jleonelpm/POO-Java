/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trigonometria;

import triangulos.TrianguloRectangulo;

/**
 *
 * @author personal
 */
public class Trigonometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TrianguloRectangulo t1 = new TrianguloRectangulo();
        TrianguloRectangulo t2 = new TrianguloRectangulo(7,6);
        t1.setB(3);
        t1.setA(4);
        System.out.println("Datos de T1");
        System.out.println(t1.getArea());
        System.out.println(t1.getPerimetro());
        System.out.println("Datos de T2");
        System.out.println(t2.getArea());
        System.out.println(t2.getPerimetro());
       
        System.out.println(t1.getTipo(3, 4, 5));
       
        
    }
    
}
