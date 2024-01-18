package ejercicio_biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Prestamo {

	int cod;
	Usuario usuario;
	ArrayList<Libro> libros;
	LocalDate fechaPrestamo;
	LocalDate fechaDevolucion;

	public Prestamo(ArrayList<Libro> libros, Usuario usuario) {
		this.libros = libros;
		this.usuario = usuario;
		this.fechaPrestamo = LocalDate.of(2024, 1, 15);
		this.fechaDevolucion = null;
		setStatusLibros(libros);

	}

	private void setStatusLibros(ArrayList<Libro> libros) {
		for (Libro libro : libros) {
			libro.setIsDisponible(false);
		}

	}

	public Usuario getUsuario() {
		return usuario;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

}
