package Ejercicio_libreria;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Libreria {

	String nombre;
	ArrayList<Libro> inventario;

	public Libreria(String nombre) {
		this.nombre = nombre;
		this.inventario = new ArrayList<>();
	}

	public void registrarLibro(Libro ejemplar) {
		inventario.add(ejemplar);
	}

	public ArrayList<Libro> getLibros(Categoria categoria) {
		ArrayList<Libro> librosPorCategoria = new ArrayList<>();
		for (Libro libro : inventario) {
			if (libro.getCategoria().equals(categoria)) {
				librosPorCategoria.add(libro);
			}
		}

		return librosPorCategoria;
	}
	
	public void actualizarStockLibro(Libro libro, int nuevoStock) {
		for(Libro libroInventario: inventario) {
			if(libro.equals(libroInventario)) {
				libroInventario.setStock(nuevoStock);
			}
		}
	}
	
	public void mostrarLibros(){
		for(Libro libro: inventario) {
			System.out.println(libro);
		}
	}
	
	private ArrayList<Libro> getLibrosConBajoStock(){
		ArrayList<Libro> librosConBajoStock = new ArrayList<>();
		
		for(Libro libro: inventario) {
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
