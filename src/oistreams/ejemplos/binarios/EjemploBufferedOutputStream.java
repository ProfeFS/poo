package oistreams.ejemplos.binarios;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploBufferedOutputStream {
    public static void main(String[] args) {
        // Ruta al archivo donde deseas escribir
        String rutaArchivo = "salida.txt";

        try (FileOutputStream fos = new FileOutputStream(rutaArchivo);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            
            String textoParaEscribir = "Este es un ejemplo de texto para escribir en el archivo.";
            byte[] bytesParaEscribir = textoParaEscribir.getBytes();
            
            bos.write(bytesParaEscribir);
            bos.flush(); // Asegura que todos los datos se escriban en el archivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
