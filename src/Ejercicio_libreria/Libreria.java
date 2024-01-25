package Ejercicio_libreria;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Libreria {

	String nombre;
	ArrayList<Libro> ;

	public Libreria(String nombre) {
		this.nombre = nombre;
		this.libros = new ArrayList<>();
	}

	public void registrarLibro(Libro ejemplar) {
		libros.add(ejemplar);
	}

	public ArrayList<Libro> getLibros(Categoria categoria) {
		ArrayList<Libro> librosPorCategoria = new ArrayList<>();
		for (Libro libro : libros) {
			if (libro.getCategoria().equals(categoria)) {
				librosPorCategoria.add(libro);
			}
		}

		return librosPorCategoria;
	}
	
	public void actualizarStockLibro(Libro libro, int nuevoStock) {
		for(Libro librolibros: libros) {
			if(libro.equals(librolibros)) {
				librolibros.setStock(nuevoStock);
			}
		}
	}
	
	public void mostrarLibros(){
		for(Libro libro: libros) {
			System.out.println(libro);
		}
	}
	
	private ArrayList<Libro> getLibrosConBajoStock(){
		ArrayList<Libro> librosConBajoStock = new ArrayList<>();
		
		for(Libro libro: libros) {
			if(libro.getStock() <3) {
				librosConBajoStock.add(libro);
			}
		}
		
		return librosConBajoStock;
	}
	
	public void gestionarLibrosStockBajo() {
		ArrayList<Libro> librosConBajoStock = getLibrosConBajoStock();
		
		if(!librosConBajoStock.isEmpty()) {
			System.out.println("Debes actualizar el stock de los siguientes libros:");
			System.out.println(librosConBajoStock);
		}else {
			System.out.println("No hay libros con stock bajo");
		}
	}

	

}
