/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

import aritmetica.Numeros; //importando clase numeros
import geometria.Volumenes; //importando clase volumenes
import algebra.Sucesiones; //Importando clase suceciones
import algebra.Binomios; //Importando clase binomios

//import java.sql; //importado las clases de SQL
/**
 *
 * @author personal
 */
public class Matematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numeros operacion = new Numeros();
        Volumenes vol = new Volumenes();
        Sucesiones s = new Sucesiones();
        Binomios b = new Binomios();
        
        System.out.println("Sumas de Dos Numeros");
        System.out.println(operacion.suma(5, 8));
        System.out.println("Volumen Cilindro");
        System.out.println(vol.areaCilindro(20, 30));
        System.out.println("Sucesión");  
        s.generaSerie(5);
        
        //x y divideBinomio son de acceso público
        b.x = 12;
        b.divideBinonio(12, 6);
       
        
    }
    
}
