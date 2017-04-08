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
public class alumno extends persona {
    
    private double cal1;
    private double cal2;
    private double cal3;

    public double getCal1() {
        return cal1;
    }

    public void setCal1(double cal1) {
        this.cal1 = cal1;
    }

    public double getCal2() {
        return cal2;
    }

    public void setCal2(double cal2) {
        this.cal2 = cal2;
    }

    public double getCal3() {
        return cal3;
    }

    public void setCal3(double cal3) {
        this.cal3 = cal3;
    }
    
    public double obtenerPromedio(){
        return (this.cal1 + this.cal2 + this.cal3)/3;
    }
   
    //Método sobreescrito
    public void saludar(){
        System.out.println("Hola amigos");
    }
   
    public alumno(String n, String a, int c1, int c2, int c3){
        super(n,a);
        this.cal1 = c1;
        this.cal2 = c2;
        this.cal3 = c3;
    }
    
    public alumno(){
        super();
    }
    
}
