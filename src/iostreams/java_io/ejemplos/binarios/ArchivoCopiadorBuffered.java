package iostreams.java_io.ejemplos.binarios;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchivoCopiadorBuffered {
    public static void copiarArchivo(String rutaOrigen, String rutaDestino) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(rutaOrigen));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(rutaDestino))) {

            byte[] buffer = new byte[4096]; // Un buffer de tamaño común
            int numBytesLeidos;
            while ((numBytesLeidos = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, numBytesLeidos);
            }
            bos.flush(); // Asegura que todo el contenido del buffer se escribe al destino
        }
    }

    public static void main(String[] args) {
        try {
            copiarArchivo("archivoOrigen.bin", "archivoDestino.bin");
            System.out.println("Archivo copiado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
