package iostreams.java_nio.ejercicio_coches;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class GestorInventario {
	private Path rutaInventario;
	private Path rutaOfertas;

	public GestorInventario() {
		this.rutaInventario = Paths.get("Inventario\\Coches\\coches.txt");
		this.rutaOfertas = Paths.get("Inventario\\Coches\\Ofertas\\ofertas.txt");
		crearDirectoriosNecesarios();
	}

	private void crearDirectoriosNecesarios() {
		try {
			Files.createDirectories(rutaInventario.getParent());
			Files.createDirectories(rutaOfertas.getParent());
		} catch (IOException e) {
			System.out.println("Error creando directorios");
			e.printStackTrace();
		}
	}

	public void añadirCoche(Coche coche) {
		if (!Files.exists(rutaInventario)) {
			try {
				Files.createFile(rutaInventario);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			if (existeMatricula(coche.getMatricula())) {
				throw new RuntimeException("El coche ya existe en el inventario.");
			} else {
				String cocheStr = coche.toString();
				Files.writeString(rutaInventario, cocheStr + System.lineSeparator(), StandardOpenOption.CREATE,
						StandardOpenOption.APPEND);
				System.out.println("Coche añadido: " + cocheStr);
			}
		} catch (RuntimeException e) {
			System.out.println("Error al añadir coche: " + e);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al añadir coche: " + e);
			e.printStackTrace();
		}

	}

	private boolean existeCoche(String matricula) throws IOException {
		List<String> cochesExistentes = Files.readAllLines(rutaInventario);
		for (String registro : cochesExistentes) {
			if (!(new Coche(registro).getMatricula()).equalsIgnoreCase(matricula)) {
				return true;
			}
		}
		return false;
	}

	public void eliminarCoche(String matricula) {
		List<String> cochesExistentes;
		try {
			cochesExistentes = Files.readAllLines(rutaInventario);
			List<String> cochesActualizados = new ArrayList<>();
			boolean encontrado = false;

			for (String registro : cochesExistentes) {
				if (!(new Coche(registro).getMatricula()).equalsIgnoreCase(matricula)) {
					cochesActualizados.add(registro);
				} else {
					encontrado = true;
				}
			}

			if (!encontrado) {
				System.out.println("El coche con matrícula " + matricula + " no existe.");
				return;
			}

			Files.write(rutaInventario, cochesActualizados, StandardOpenOption.TRUNCATE_EXISTING);
			System.out.println("Coche eliminado: " + matricula);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void generarOfertas() {
		List<String> cochesExistentes;
		try {
			cochesExistentes = Files.readAllLines(rutaInventario);
			List<String> cochesEnOferta = new ArrayList<>();
			boolean hayOfertas = false;

			for (String registro : cochesExistentes) {
				String[] partes = registro.split(",");
				int kilometraje = Integer.parseInt(partes[2]);
				if (kilometraje >= 100000) {
					double precio = Double.parseDouble(partes[3]);
					double precioOferta = precio - (precio * 0.1);
					String cocheOferta = registro + "," + precioOferta;
					cochesEnOferta.add(cocheOferta);
					hayOfertas = true;
				}
			}

			if (!hayOfertas) {
				System.out.println("No hay coches en oferta.");
				return;
			}

			Files.write(rutaOfertas, cochesEnOferta, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
			for (String oferta : cochesEnOferta) {
				System.out.println(oferta);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private boolean existeMatricula(String matricula) throws IOException {
		List<String> cochesExistentes = Files.readAllLines(rutaInventario);
		
		String buscarMatricula = matricula; // Matrícula a buscar
		
		// Escapar la matrícula en caso de que contenga caracteres especiales de regex
		String matriculaEscapada = Pattern.quote(buscarMatricula);
		
		// Crear el patrón de búsqueda usando límites de palabra (\b)
		String patron = "\\b" + matriculaEscapada + "\\b";

		for (String registro : cochesExistentes) {
			if (Pattern.compile(patron).matcher(registro).find()) {
				return true;
			}
		}
		return false;

	}
}