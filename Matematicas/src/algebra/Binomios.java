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
public class Binomios {
    int a; //Acceso solo en el mismo paquete
    private int b; //Acceso solo en la misma clase
    public int x; //Acceso en todo el proyecto
    //protected int y;
    
    //Acceso solo en el mismo paquete
    boolean comparaNumeros(int n1,int n2){
        return n1 >= n2;  
    }
    //Acceso en la misma clase
    private int sumaBinomio(int n1, int n2){
        return n1 + n2;
    }
    
    //Acceso en todo el proyecto
    public double divideBinonio(int n1, int n2){
        return n1 / n2;
    }
    
    public int sumaDosBinomios(){
        return this.sumaBinomio(4, 5) + this.sumaBinomio(9, 7);
    }
}
