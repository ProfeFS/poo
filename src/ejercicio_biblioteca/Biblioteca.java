package ejercicio_biblioteca;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Libro> libros;
	private ArrayList<Prestamo> prestamos;

	public Biblioteca() {
		usuarios = new ArrayList<>();
		libros = new ArrayList<>();
		prestamos = new ArrayList<>();
	}

	// creo una relación de composición de libro con Biblioteca
	public void registrarLibro(String titulo, String autor) {
		Libro libro = new Libro(titulo, autor);
		libros.add(libro);
	}

	public void procesarNuevoPrestamo(ArrayList<Libro> libros, Usuario usuario) {

		prestamos.add(new Prestamo(libros, usuario));
	}

	public ArrayList<Libro> generarListaLibrosaPrestar() {
		ArrayList<Libro> librosAprestar = new ArrayList<>();
		for (int i = 0; i < 2 && i < libros.size(); i++) {
			librosAprestar.add(libros.get(i));
		}
		return librosAprestar;
	}

	public void procesarDevolucion(String docIdentidad, LocalDate fechaPrestamo) {

		// 1.- busco el préstamo por fecha de prestamo y por usuario
		for (Prestamo prestamo : prestamos) {
			if (prestamo.getFechaPrestamo().equals(fechaPrestamo)
					&& prestamo.getUsuario().getDocumento().equalsIgnoreCase(docIdentidad)) {
				ArrayList<Libro> librosaRetornar = prestamo.getLibros();
				for (Libro libro : librosaRetornar) {
					libro.setIsDisponible(true);
				}
				prestamo.setFechaDevolucion(LocalDate.now());
				System.out.println("Se ha procesado la devolución de forma exitosa");

			}
		}

	}

	public void registrarUsuario(Usuario usuario) {
		usuarios.add(usuario);

	}

}
