package iostreams.java_io.ejemplos.chars;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LectorEscritorBufferedJavaIO {

	public static void main(String[] args) {

		String rutaOrigen = "c:\\data100\\configuracion01.txt";
		String rutaDestino = "c:\\data100\\copiaConfiguracion01.txt";

		File file = new File(rutaDestino);

		try (BufferedReader br = new BufferedReader(new FileReader(rutaOrigen));
				BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.print(linea);
				bw.write(linea.toUpperCase() + "\n");
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
