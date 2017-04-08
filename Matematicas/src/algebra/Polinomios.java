/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

/**
 *
 * @author personal
 */
public class Polinomios {
    
    Binomios b = new Binomios();
  
    
    public double sumaPolinomios(int n1, int n2){
       
        //comparaNumeros es de acceso solo paquete
        if (b.comparaNumeros(n1, n2)){
            return n1+n2;
        }else{
            //a es de acceso solo paquete
            b.a = 12;
            return b.a;
        }
    }
    
}
