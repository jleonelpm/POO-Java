/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;
import catalogos.Estudiante;


/**
 *
 * @author personal
 */
public class Escuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante a = new Estudiante();
        
        System.out.println(Math.pow(2, 3));
        
        System.out.println("Datos del Alumno");
        a.setNombre("Juan");
        a.setApellido("Perez");
        a.setCorreo("juan.perez@hotmail.com");
        
        System.out.println(a.getNombre());
        System.out.println(a.getApellido());
        System.out.println(a.getCorreo());     
   
        
    }
    
}
