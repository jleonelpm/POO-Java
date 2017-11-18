package actividad_4;

import java.io.*;

/*EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;*/
public class Actividad_4 {

    public static void main(String arg[]) {
        
        RandomAccessFile archivo = null;
        try {
            
            String queArchivo = "prueba.txt";
            archivo = new RandomAccessFile(queArchivo, "rw");
            int total = (int) archivo.length();
            System.out.println(total);
           
            System.out.println(new String(leerArchivo(queArchivo, 10, 24)));
            escribirArchivo(queArchivo, total + "XXXXXXXXXXXXXXXXX", 25);

        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println("Problemas con el archivo");
        }

    }

    private static byte[] leerArchivo(String rutaArchivo, int posicion, int size)
            throws IOException {

        RandomAccessFile archivo = new RandomAccessFile(rutaArchivo, "r");
        archivo.seek(posicion);
        byte[] bytes = new byte[size];
        archivo.read(bytes);
        archivo.close();
        return bytes;

    }

    private static void escribirArchivo(String rutaArchivo, String data, int posicion)
            throws IOException {

        RandomAccessFile archivo = new RandomAccessFile(rutaArchivo, "rw");
        archivo.seek(posicion);
        archivo.write(data.getBytes());
        archivo.close();

    }

}
