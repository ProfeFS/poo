package Ejercicio_libreria;

import java.lang.reflect.Array;

public class GestionInventario {

	public static void main(String[] args) {
		
		Libreria nuevasArtes = new Libreria("Nuevas artes");
		
		Libro libro1 = new Libro(11, "Libro1E1", "maria", Categoria.ARTES);
		Libro libro2 = new Libro(10, "Libro2E1", "andres", Categoria.ARTES);
		Libro libro3 = new Libro(3, "Libro2E1", "andres", Categoria.CIENCIAS);
		Libro libro4 = new Libro(2, "Libro2E1", "julia", Categoria.EDUCACION);
		
		nuevasArtes.registrarLibro(libro1);
		nuevasArtes.registrarLibro(libro2);
		nuevasArtes.registrarLibro(libro3);
		nuevasArtes.registrarLibro(libro4);
		
		System.out.println(nuevasArtes.getLibros(Categoria.ARTES));
		
		nuevasArtes.actualizarStockLibro(libro4, 4);
		nuevasArtes.mostrarLibros();
		
		nuevasArtes.gestionarLibrosStockBajo();
		
		
		
		

		
		

	}

}
