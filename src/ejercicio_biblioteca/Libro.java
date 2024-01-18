package ejercicio_biblioteca;

public class Libro {
	
	String titulo;
	String autor;
	boolean isDisponible;

	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		isDisponible = true;
	}
	
	public void setIsDisponible(boolean estado) {
		isDisponible = estado;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isDisponible=" + isDisponible + "]";
	}
	
	

}
