package iostreams.java_io.ejemplos.binarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploFileImputStream {

	public static void main(String[] args) {

		String rutaOrigen = "c:\\data\\java.png";
		FileInputStream fis=null;

		try {
			fis = new FileInputStream(rutaOrigen);
			// System.out.println(fis.readAllBytes().length);

			int byteLeido;
			while ((byteLeido = fis.read()) != -1) {
				System.out.println("El byteLeido: " + byteLeido);
				// fos.write(byteLeido);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
