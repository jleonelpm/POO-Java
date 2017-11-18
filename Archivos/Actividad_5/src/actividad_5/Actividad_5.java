
package actividad_5;
import java.util.*;
import java.io.*;
public class Actividad_5 {

    public static void main(String[] args) {
        try{
            FileOutputStream archivo = new FileOutputStream ("prueba.dat");
            ObjectOutputStream salida = new ObjectOutputStream (archivo);
            salida.writeObject("Hoy es: ");
            salida.writeObject(new Date());
            salida.close();
        }catch (IOException e){
            System.out.println("Problemas con el archivo. ");
        }
      try{
           FileInputStream archivo2 = new FileInputStream ("prueba.dat");
            ObjectInputStream entrada = new ObjectInputStream (archivo2);
            String hoy =(String)entrada.readObject();
            Date fecha = (Date)entrada.readObject();
            entrada.close();
            
            System.out.println(hoy+fecha);
      }catch(FileNotFoundException e){
          System.out.println("No se pudo abrir  el archivo. ");
      }catch(IOException e){
          System.out.println("problemas con el archivo. ");
      }catch(Exception e){
          System.out.println("Eror al leer un objetos");
      }
      
    }
    
}
