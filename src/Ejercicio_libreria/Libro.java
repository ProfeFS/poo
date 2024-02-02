package Ejercicio_libreria;

public class Libro {

	private String titulo;
	private String autor;
	private Categoria categoria;
	private int stock;

	public Libro(int stock, String titulo, String autor, Categoria categoria) {

		this.stock = stock;
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "" +titulo + ", autor=" + autor + ", categoria=" + categoria + ", stock=" + stock;
	}



}
