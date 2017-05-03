/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo1;

import Intrumentos.InstrumentoMusical;
import Intrumentos.Piano;
import Intrumentos.Tambor;

/**
 *
 * @author personal
 */
public class Polimorfismo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        InstrumentoMusical i = new InstrumentoMusical();
        Piano p = new Piano();
        Tambor t = new Tambor();
        
        i.setNombre("Instrumento");
        p.setNombre("Piano");
        t.setNombre("Tambor");
        
        //Llamada a los métodos polimórficos
        //Por medio de la REDEFINICION DE METODOS
        System.out.println(i.getNombre());
        i.sonar();
        System.out.println(p.getNombre());
        p.sonar();
        System.out.println(t.getNombre());
        t.sonar();
        
        
    }
    
}
