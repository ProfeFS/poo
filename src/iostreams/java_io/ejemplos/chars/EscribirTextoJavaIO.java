package iostreams.java_io.ejemplos.chars;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirTextoJavaIO {

	public static void main(String[] args) throws IOException {

		String rutaDestino = "c:\\data100";
		File file = new File(rutaDestino);

		if (!file.exists()) {
			System.out.println("Creando nuevo directorio: " + rutaDestino);
			if (file.mkdir()) {
				file = new File(file + file.separator + "configuracion01.txt");
			}
		} 

		int cont = 0;
		while (cont < 3) {
			try (FileWriter fw = new FileWriter(file, true)) {
				// fw.append("prueba append " + cont); //append retorna una referencia al objeto Writer
				fw.write("prueba " + cont + "\n"); // write no devuelve un valor (es void).
				cont++;
			} catch (IOException e) {
				cont = 3;
				System.out.println("Error escritura de archivo " + e);
			}

		}

	}

}

/*
 * append devuelve una referencia al propio objeto Writer, permitiendo encadenar
 * llamadas a append en una sola instrucción.
 * 
 * /* Aunque write y append pueden usarse de manera intercambiable en muchos
 * contextos, append se introdujo para proporcionar una semántica más clara
 * cuando el objetivo es añadir datos al final de un stream, mejorando la
 * legibilidad del código.
 */
