/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author personal
 */
public class Circulo extends FiguraAbstracta{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
       return 3.1416 * this.radio * this.radio; 
    } 
    
    public double calcularPerimetro(){
       return 2 * 3.1416 * this.radio; 
    } 
    
}
