/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author personal
 */
public class maestro extends persona {
    //Campos específicos de la subclase.

    private String id_maestro;
    
    //Llamando al constructor por defecto, el cual debe existir
    
    public maestro() {
        super();
    }
   
   //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase
    
    public maestro(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad); //Acceder al constructor de la clase base
        id_maestro = "";
    } 

    
    public String getId_maestro() {
        return id_maestro;
    }

    public void setId_maestro(String id_maestro) {
        this.id_maestro = id_maestro;
    }
    
    public void saludar(String persona){
        System.out.println("Que tal!! " + persona);
    }   
    
    public maestro(String n, String a){
        super(n,a);
    }
    
 
}
