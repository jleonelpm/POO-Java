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
public class Alumno {
    //Atributos
    private String matricula;
    String nombre;
    String apellido;
    String fecha_nacimiento;
    int edad;
    double peso;
    double estatura;
    String carrera;
    String telefono;
    String direccion;
    int c1;
    int c2;
    int c3;
    
    //Métodos     
    public void saludar(){
        System.out.println("Hola a todos");
    }
    
    //método que no retorna valores y recibe un argumento de entrada
    public void decirAdios(String n){
        System.out.println("Hasta luego " + n);
    }
    
    //método que retorna valores
    public double calcularPromedio(int c1, int c2, int c3){
        this.c1 = c1;
        double promedio;
        promedio = (c1+c2+c3)/3;
        return promedio;
    }
    
}
