/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesObjetos;

/**
 *
 * @author personal
 */
public class Figuras {
    
    //private double lado1;
    //private double lado2;
    
    //Constructor de la Clase
    public Figuras(){
        System.out.println("Se ha creado una nueva figura");
    }
    
    //Sobrecarga del Constructor
    public Figuras(String t){

        switch (t) {
            case "1":
                System.out.println("NUEVO CUADRADO"); break;
            case "2":
                System.out.println("NUEVO RECTANGULO"); break;
            case "3":
                System.out.println("NUEVO TRIANGULO"); break;
        }          
    }
    
    //Método sobrecargado
    public double calcularArea(double lado1){
        double area;
        area = lado1 * lado1;
        return area;
    }
    
    public int calcularArea(int lado1){
        int area;
        area = lado1 * lado1;
        return area;
    }
    
    //Método sobrecargado
    public double calcularArea(double lado1, double lado2){
        double area;
        area = lado1 * lado2;
        return area;
        
    }
    
    //Método sobrecargado
    public double calcularArea(double lado1, double lado2, String figura){
        double area;
        if (figura == "triangulo"){
            area = lado1 * lado2 / 2;
        }else{
            area = lado1 * lado2;
        }
        return area;
    }
    
    /*
    public double calcularArea(double radio){
        double area;
        area = 3.1416 * (radio * radio);
        return area;
    }
    
    public double calcularArea(double lado1, double apotema){
        double area;
        area = (5 * lado1 * apotema)/2;
        return area;
    }
    */
    
}
