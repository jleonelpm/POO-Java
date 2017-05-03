/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo2;
import Intrumentos.Piano;
import Intrumentos.Tambor;
import Intrumentos.InstrumentoMusical;
/**
 *
 * @author personal
 */
public class Polimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //InstrumentoMusical i = new InstrumentoMusical();
        
        Piano p = new Piano();
        Tambor t = new Tambor();
        
        p.setNombre("Piano");
        t.setNombre("Tambor");
        
        //Llamando a los métodos polimórficos
        //que se han redefinido a partir de CLASES ABSTRACTAS
        
        System.out.println(p.getNombre());
        p.sonar();
        System.out.println(t.getNombre());
        t.sonar();
        
    }
    
}
