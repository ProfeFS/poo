package oistreams.ejemplos.binarios;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopier {
    public static void copiarImagen(String rutaOrigen, String rutaDestino) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(rutaOrigen));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(rutaDestino))) {
             
            byte[] buffer = new byte[1024];
            int cantidadBytesLeidos;
            while ((cantidadBytesLeidos = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, cantidadBytesLeidos);
            }
        }
    }
}
