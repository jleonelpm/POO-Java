/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

public class TrianguloRectangulo {
    private double b;
    private double a;

   public TrianguloRectangulo(double b, double a){
        this.b = b;
        this.a = a;
    }    
    
    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public TrianguloRectangulo(){
        this.b = 0;
        this.a = 0;
    }
    
    public TrianguloRectangulo(double b, double a){
        this.b = b;
        this.a = a;
    }
        
    public double getArea(){
        double area;
        area = this.b * this.a;
        return area;
    }
    
    public double getArea(double a, double b) {
        double area;
        this.b = b;
        this.a = a;
        area = this.b * this.a;
        return area;
    }
    
    public double getHipotenusa(){
        double hipotenusa;
        hipotenusa = Math.sqrt(b*b + a*a);
        return hipotenusa;
    }
    
    public double getPerimetro(){
        double perimetro; 
        perimetro = this.b + this.a + this.getHipotenusa();
        return perimetro;
    }
    
    double getSeno(){
        return a/this.getHipotenusa();
    }
    
    public String getTipo(double x,double y, double z) {
       if (Math.pow(z, 2)==(Math.pow(x, 2)+Math.pow(y, 2))){
           return "Rectangulo";
       }else if (Math.pow(z, 2)<(Math.pow(x, 2)+Math.pow(y, 2))){
           return "Acutángulo";
       }else{
           return "Obtusángulo";
       }
    }
    
}