package herencia.abstractas.ejercicios.biblioteca_multimedia;

public abstract class ContenidoMultimedia {
	protected String titulo;
	protected String autor;
	protected double duracion; // En minutos

	public ContenidoMultimedia(String titulo, String autor, double duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.duracion = duracion;
	}

	public void mostrarDetalles() {
		System.out.println("Título: " + titulo + ", Autor: " + autor + ", Duración: " + duracion + " minutos");
	}

	// Método abstracto que deberá ser implementado por las subclases
	public abstract void reproducir();
}
