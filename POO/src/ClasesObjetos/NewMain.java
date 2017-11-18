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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno a;
        a = new Alumno();
        Alumno b = new Alumno();
        
        a.nombre = "Jose";
        a.apellido = "Pacheco";
        a.edad = 20;
        a.calcularPromedio(70, 90, 85);
        
        b.nombre = "Teresa";
        b.apellido = "Mena";
        b.edad = 19;
        b.decirAdios("Hasta Luego");
        
        /* =============== */
        
        Figuras f1 = new Figuras();
        Figuras f2 = new Figuras("C"); //Creación de un Cuadrado
        Figuras f3 = new Figuras("T"); //Creación de un Triángulo
        Figuras f4 = new Figuras("R"); //Creación de un Rectángulo
        
        System.out.println(f2.calcularArea(10)); //Llamada al método del Cuadrado
        System.out.println(f3.calcularArea(4, 5)); //Llamada al método del Rectanculo
        System.out.println(f4.calcularArea(4, 5, "T")); //Llamada al método del Triángulo
        System.out.println(f1.calcularArea(4, 5, "R")); //Llamada al método del Rectángulo
    }
    
}
