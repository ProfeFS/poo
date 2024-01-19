package ejercicio_bibliotecaV20;

import java.time.LocalDate;

public class Prestamo {

	int cod;
	Usuario usuario;
	Libro libro;
	LocalDate fechaPrestamo;
	LocalDate fechaDevolucion;

	public Prestamo(Libro libro, Usuario usuario) {
		this.libro = libro;
		this.usuario = usuario;
		this.fechaPrestamo = LocalDate.of(2024, 1, 15);
		this.fechaDevolucion = null;
		libro.setIsDisponible(false);

	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public LocalDate getFechaPrestamo() {
		// TODO Auto-generated method stub
		return fechaPrestamo;
	}

}
