package clases;


public class Book {
	private String autor;
	private String titulo;
	private String codigo;
	private boolean estaPrestado;

	public Book(String autor, String titulo, String codigo) {
		this.autor = autor;
		this.titulo = titulo;
		this.codigo = codigo;
		this.estaPrestado = false;
	}

	public void prestar() {
		if (!estaPrestado) {
			estaPrestado = true;
		}
	}

	public void devolver() {
		if (estaPrestado) {
			estaPrestado = false;
		}
	}

	public String getInformation() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", codigo=" + codigo + ", estaPrestado=" + estaPrestado
				+ "]";
	}

	
	
	
	
}
