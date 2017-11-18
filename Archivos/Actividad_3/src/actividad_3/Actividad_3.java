package actividad_3;

import java.util.*;
import java.io.*;

public class Actividad_3 {

    public static void main(String arg[]) {

        String directorio;
        if (arg.length > 0) {
            directorio = arg[0];
        } else {
            directorio = ".";
        }
        File actual = new File(directorio);
        System.out.println("El directorio es:");
        try {
            System.out.println(actual.getCanonicalPath());
        } catch (IOException e) {
            System.out.println(e.toString());
        }


            System.out.println("Su contenido es :");
            File[] archivos = actual.listFiles();
            System.out.println(archivos.length);
            for (File archivo : archivos) {
                System.out.printf("%-15s", archivo.getName());
                if (archivo.isFile()) {
                    System.out.println(archivo.length() + "%6d");
                    System.out.println(new Date(archivo.lastModified()) + "%1$t0 %1$tT");
                }
                System.out.println();
            }
        

    }

}
