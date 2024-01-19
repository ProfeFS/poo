package ejercicio_bibliotecaV20;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionPrestamosBiblioteca {

	public static void main(String[] args) {

		Biblioteca bibliotecaPlazaEliptica = new Biblioteca();

		Libro libro1 = new Libro("Libro 1", "Gynny");
		Libro libro2 = new Libro("Libro 2", "María");
		Libro libro3 = new Libro("Libro 3", "Carmen");
		Libro libro4 = new Libro("Libro 4", "Andrés");

		bibliotecaPlazaEliptica.registrarLibro(libro1);
		bibliotecaPlazaEliptica.registrarLibro(libro2);
		bibliotecaPlazaEliptica.registrarLibro(libro3);
		bibliotecaPlazaEliptica.registrarLibro(libro4);
		bibliotecaPlazaEliptica.imprimeLibros();

		Usuario maria = new Usuario("222222", "Maria");
		bibliotecaPlazaEliptica.registrarUsuario(maria);

		bibliotecaPlazaEliptica.procesarNuevoPrestamo(bibliotecaPlazaEliptica.generarListaLibros(), maria);
		bibliotecaPlazaEliptica.imprimeLibros();

		bibliotecaPlazaEliptica.procesarDevolucion(bibliotecaPlazaEliptica.generarListaLibros2(), maria.getDocumento());
		bibliotecaPlazaEliptica.imprimeLibros();

	}

}
