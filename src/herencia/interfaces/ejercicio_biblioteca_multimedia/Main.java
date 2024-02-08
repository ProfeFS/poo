package herencia.interfaces.ejercicio_biblioteca_multimedia;

public class Main {
	public static void main(String[] args) {
		// Crear la biblioteca
		BibliotecaMultimedia biblioteca = new BibliotecaMultimedia();

		// Crear diferentes tipos de contenido multimedia
		Video video = new Video("Aprende Java en 30 Minutos", "Coder", 30, "1080p");
		Podcast podcast = new Podcast("Historias de Programadores", "TechTalks", 45, "MP3");
		LibroElectronico libro = new LibroElectronico("El Manual del Programador", "TechAuthor", 0, 120);

		// Añadir contenido a la biblioteca
		biblioteca.añadirContenido(video);
		biblioteca.añadirContenido(podcast);
		biblioteca.añadirContenido(libro);

		// Mostrar los contenidos de la biblioteca
		biblioteca.mostrarContenidos();

		// Reproducir un contenido específico
		System.out.println("Reproduciendo contenido específico:");
		biblioteca.reproducirContenido(0); // Reproducir el primer contenido (video)

		// Reproducir todos los contenidos
		System.out.println("\r");
		biblioteca.reproducirContenidos(); // Reproducir el primer contenido (video)
	}
}
