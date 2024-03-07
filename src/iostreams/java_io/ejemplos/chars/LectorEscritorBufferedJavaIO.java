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

		try (FileReader fr = new FileReader(rutaOrigen);
				FileWriter fw = new FileWriter(file);
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw)) {

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
