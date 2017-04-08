/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sobrecarga;

import ClasesObjetos.Figuras;

/**
 *
 * @author personal
 */
public class Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Figuras cuadrado = new Figuras();
        Figuras rectangulo = new Figuras();
        Figuras triangulo = new Figuras();
        
        Figuras x = new Figuras("2");
        Figuras y = new Figuras("1");                
             
        System.out.println("El area del cuadrado es");
        System.out.println(cuadrado.calcularArea(17.2));
        System.out.println("El area del rectangulo es");
        System.out.println(rectangulo.calcularArea(6.7,8.2));
        System.out.println("El area del triangulo es");
        System.out.println(triangulo.calcularArea(7.7,8.4,"triangulo"));
        
        
        

                
        
        
    }
    
}
