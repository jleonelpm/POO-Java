package actividad_2;

import java.io.*;

public class Actividad_2 {

    public static void main(String arg[]) {
        //Leyendo un archivo
        String nombreArchivo = "Trigonometria.java";
        FileReader archivo;
        BufferedReader filtro;
        String linea;
        try {
            archivo = new FileReader(nombreArchivo);          
            filtro = new BufferedReader(archivo);
            linea = filtro.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = filtro.readLine();
            }

            archivo.close();

        } catch (IOException e) {
            System.out.println("Imposible abrir el archivo para leer.");
        }

    }


}
