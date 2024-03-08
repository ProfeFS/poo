package iostreams.java_nio.ejemplos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OperacionesBasicasJavaNio {

	public static void main(String[] args) throws IOException {

		// 1.-Crear un archivo
		String ruta = "Data";
		Path archivo = Paths.get(ruta, "archivo.txt");

		if (!Files.exists(archivo)) {
			Files.createFile(archivo); // si no existe el directorio, lanza excepción. Solamente se encarga de crear un
										// nuevo archivo en un directorio existente.
		}

		// 2.- Hacer una copia del archivo en otro path
		Path nuevoArchivo = Paths.get(ruta, "copiaArchivo.txt");
		Files.copy(archivo, nuevoArchivo);

		// 3.- mover un archivo (si la ruta del archivo es la misma, lo renombra.
		Path archivoRenombrado = Paths.get(ruta, "ArchivoRenombrado.txt");
		Files.move(archivo, archivoRenombrado);

		// 4.- eliminar un archivo
		Files.deleteIfExists(archivoRenombrado);

	}

}
