package oistreams.ejemplos.binarios;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchivoBinarioCopiador {
    public static void main(String[] args) {
        //String origen = "java.png";
    	String origen = "c:" + File.separator + "data" + File.separator +"java.png";
        String destino = "c:" + File.separator + "data" + File.separator +"copia.jpg";
        
        File fileOrigen = new File("c:" + File.separator + "data" + File.separator +"java.png");
        
        if(fileOrigen.exists()) {
        	System.out.println(fileOrigen.toString());
        }
        
        System.out.println(System.getProperty("user.dir"));

        try (FileInputStream fis = new FileInputStream(origen);
             FileOutputStream fos = new FileOutputStream(destino)) {
            
            int byteLeido;
            while ((byteLeido = fis.read()) != -1) {
            	//System.out.println("El byteLeido: " + byteLeido);
                fos.write(byteLeido);
            }
            System.out.println("Archivo copiado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}
