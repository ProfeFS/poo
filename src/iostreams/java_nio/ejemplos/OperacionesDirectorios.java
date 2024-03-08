package iostreams.java_nio.ejemplos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OperacionesDirectorios {

	public static void main(String[] args) throws IOException {

		String dir = "Data" + File.separator + "Dir1";

//		File file = new File(dir); // java.io
//		File directorio = file.getParentFile();// java.io

		Path ruta = Paths.get(dir); // java.nio
		if (Files.notExists(ruta)) {
			Files.createDirectories(ruta);
		}

		Path dir2 = Paths.get("Data1", "sub1", "archivo.txt").getParent();
		if (dir2 != null) {
			Files.createDirectories(dir2);
		}

	}

}
