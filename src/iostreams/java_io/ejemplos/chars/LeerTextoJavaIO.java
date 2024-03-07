package iostreams.java_io.ejemplos.chars;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerTextoJavaIO {

	public static void main(String[] args) {

		String rutaOrigen = "c:\\data100\\configuracion01.txt";

		try (FileReader fr = new FileReader(rutaOrigen)) {
			int leido;
			while ((leido= fr.read()) != -1) {
				System.out.print((char)leido);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
