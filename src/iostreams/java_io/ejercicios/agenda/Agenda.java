package iostreams.java_io.ejercicios.agenda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

	List<Contacto> contactos;
	String rutaArchivo;

	public Agenda(String directorio, String nombre) throws IOException {
		contactos = new ArrayList<>();
		rutaArchivo = directorio + File.separator + nombre;
		System.out.println(rutaArchivo);
		crearAgenda(directorio, nombre);
	}

	private void crearAgenda(String directorio, String nombre) throws IOException {
		File file = new File(directorio);

		if (!file.exists()) {
			System.out.println("Creando nuevo directorio: " + directorio);
			file.mkdir();
		}

		file = new File(file + file.separator + nombre);
		file.createNewFile();
	}

	public void AgregarContacto(Contacto contacto) {
		contactos.add(contacto);
	}

	public void guardar() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
			copiarContactosEnAgenda(bw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	private void copiarContactosEnAgenda(BufferedWriter bw) throws IOException {
		for(Contacto c:contactos) {
			bw.write(c.toString());
			bw.newLine();
		}
		
	}

}
