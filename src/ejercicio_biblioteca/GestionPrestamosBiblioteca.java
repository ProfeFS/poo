package ejercicio_biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionPrestamosBiblioteca {

	public static void main(String[] args) {
		
		Biblioteca bibliotecaPlazaEliptica = new Biblioteca();
		
		bibliotecaPlazaEliptica.registrarLibro("Libro 1", "Gynny");
		bibliotecaPlazaEliptica.registrarLibro("Libro 2", "María");
		bibliotecaPlazaEliptica.registrarLibro("Libro 3", "Carmen");		
		bibliotecaPlazaEliptica.registrarLibro("Libro 4", "Andrés");
		
		
		Usuario maria = new Usuario("222222", "Maria");
		bibliotecaPlazaEliptica.registrarUsuario(maria);
		
		ArrayList<Libro> librosaPrestar = bibliotecaPlazaEliptica.generarListaLibrosaPrestar();		
		bibliotecaPlazaEliptica.procesarNuevoPrestamo(librosaPrestar, maria);
		
		bibliotecaPlazaEliptica.procesarDevolucion(maria.getDocumento(), LocalDate.of(2024, 1, 15));
		
		
		

	}

}
