package iostreams.java_nio.ejemplos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EscritorLectorArchivos {

	public static void main(String[] args) throws IOException {
		// operaciones de escritura para textos de poco contenido
		
		Path contactos = Paths.get("Data","Contactos.txt");
		if(Files.notExists(contactos)){
			Files.createFile(contactos);
		}
		
		StringBuffer sb = new StringBuffer("María, maria@gmail.com, 345678"+"\n");
		sb.append(System.getProperty("line.separator"));
		sb.append("Juan, kjuan@gmail.com, 342313515");
		
		Files.writeString(contactos, sb.toString(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		
		List<String> contenidoContactos = Files.readAllLines(contactos);
		for(String linea: contenidoContactos) {
			System.out.println(linea);
		}
		
		

	}

}
