package herencia.interfaces.ejercicio_biblioteca_multimedia;

public abstract class ContenidoMultimedia {
	private String titulo;
	private String autor;
	private double duracion; // En minutos

	public ContenidoMultimedia(String titulo, String autor, double duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.duracion = duracion;
	}

	public void mostrarDetalles() {
		System.out.println("Título: " + titulo + ", Autor: " + autor + ", Duración: " + duracion + " minutos");
	}
	
	public abstract void ejecutar();
}
