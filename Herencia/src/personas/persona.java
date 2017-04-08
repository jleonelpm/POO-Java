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
public class persona {

    /**
    protected:  sirve para indicar un tipo de visibilidad 
    * de los atributos y métodos de la clase padre y 
    * significa que cuando un atributo es 'protected' o protegido, 
    * solo es visible ese atributo o método desde una de 
    * las clases hijas y no desde otra clase.     
    **/
    protected String nombre;
    protected String apellidos;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    protected int edad;
  
    public persona(){
        this.nombre="";
        this.apellidos = "";
    }
    
    public persona(String name, String lastName){
        this.nombre = name;
        this.apellidos = lastName;
    }
               
    //Constructor
    public persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
    
    public void saludar(){
        System.out.println("hola");
    }

}
