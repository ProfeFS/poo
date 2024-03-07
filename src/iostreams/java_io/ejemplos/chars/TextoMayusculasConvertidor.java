package iostreams.java_io.ejemplos.chars;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextoMayusculasConvertidor {
    public static void convertirTextoAMayusculas(String archivoOrigen, String archivoDestino) {
        
    	//String archivoOrigen = "texto.txt";
    	
    	try (BufferedReader br = new BufferedReader(new FileReader(archivoOrigen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino))) {
            
            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea.toUpperCase() + "\n");
            }
            System.out.println("Archivo convertido y guardado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al convertir el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        convertirTextoAMayusculas("texto.txt", "texto_mayusculas.txt");
    }
}
