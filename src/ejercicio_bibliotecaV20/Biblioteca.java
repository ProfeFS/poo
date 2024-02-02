package ejercicio_bibliotecaV20;

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

	// creo una relación de agregación de libro con Biblioteca
	public void registrarLibro(Libro libro) {
		libros.add(libro);
	}

	public void procesarNuevoPrestamo(ArrayList<Libro> libros, Usuario usuario) {
		for (Libro lib : libros) {
			prestamos.add(new Prestamo(lib, usuario));
		}
	}

	public ArrayList<Libro> generarListaLibros() {
		ArrayList<Libro> libros = new ArrayList<>();
		libros.add(this.libros.get(0));
		libros.add(this.libros.get(3));
		return libros;
	}
	
	public ArrayList<Libro> generarListaLibros2() {
		ArrayList<Libro> libros = new ArrayList<>();
		libros.add(this.libros.get(0));
		return libros;
	}

	public void procesarDevolucion(ArrayList<Libro> libros, String docUsuario) {
		for (Libro lib : libros) {
			devolverLibro(lib, docUsuario);
		}

	}

	private void devolverLibro(Libro libro, String docUsuario) {
		for (Prestamo prestamo : prestamos) {
			if (prestamo.getLibro().equals(libro)
					&& prestamo.getUsuario().getDocumento().equalsIgnoreCase(docUsuario)) {
				prestamo.setFechaDevolucion(LocalDate.now());
				prestamo.getLibro().setIsDisponible(true);
				//libro.setIsDisponible(true);
			}
		}
	}

	public void registrarUsuario(Usuario usuario) {
		usuarios.add(usuario);

	}

	public void imprimeLibros() {
		for (Libro libro : libros) {
			System.out.println(libro);
		}
		System.out.println("\r");
	}

}
