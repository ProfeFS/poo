package iostreams.java_io.ejemplos.binarios;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class EjemploBufferedInputStream {
    public static void main(String[] args) {
        // Ruta al archivo que deseas leer
        String rutaArchivo = "prueba.txt";

        try (FileInputStream fis = new FileInputStream(rutaArchivo);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            
            // Lee el archivo byte a byte
            int byteLeido;
            while ((byteLeido = bis.read()) != -1) {
                // Procesa el byte leído como se necesite
                System.out.print((char) byteLeido); // Convertir byte a char para la visualización
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
