/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;
import personas.alumno;
import personas.maestro;

/**
 *
 * @author personal
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        alumno a = new alumno();                
        
        a.setNombre("Mary");
        a.setApellidos("Juana del Campo");
        a.setEdad(25);
        
        a.setCal1(70);
        a.setCal2(95);
        a.setCal3(100);
        
        
        System.out.println(a.getNombre());
        System.out.println(a.getApellidos());
        System.out.println(a.getEdad());
        
        System.out.println(a.obtenerPromedio());
        
        if (a.obtenerPromedio()>=70){
            System.out.println("Alumno Aprobado");            
        }else{
            System.out.println("Esfuérzate más..");
        }
        
        //Saludo del alumno
        a.saludar();
            
        maestro m = new maestro("Pedro","Páramo");
        //Saludo del maestro
        m.saludar();
        
        m.saludar("miguel"); //método sobrecargado en maestro
        
        alumno x = new alumno("Leobardo","Lopez",100,100,100);
        System.out.println(x.getNombre());
        System.out.println(x.getApellidos());
        System.out.println(x.obtenerPromedio());
        
        
    }
    
}
