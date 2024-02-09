package herencia.interfaces.ejercicios.biblioteca_multimedia_refactorized;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Crear la biblioteca
		BibliotecaMultimedia biblioteca = new BibliotecaMultimedia();

		// Crear diferentes tipos de contenido multimedia
		Video video = new Video("Aprende Java en 30 Minutos", "Coder", 30, "1080p");
		Podcast podcast = new Podcast("Historias de Programadores", "TechTalks", 45, "MP3");
		LibroDigital libro = new LibroDigital("El Manual del Programador", "TechAuthor", 0, 120);
		Reproducible video2 = new Video("oteo video", "Coder", 30, "1080p");
		
		
		List<Reproducible> reproducibles = new ArrayList<>();
		reproducibles.add(video);
		reproducibles.add(podcast);
		reproducibles.add(video2);
		

		// Añadir contenido a la biblioteca
		biblioteca.añadirContenido(video);
		biblioteca.añadirContenido(podcast);
		biblioteca.añadirContenido(libro);
		
		

		// Mostrar los contenidos de la biblioteca
		biblioteca.mostrarContenidos();

		// Reproducir un contenido específico
		System.out.println("Reproduciendo contenido específico:");
		biblioteca.ejecutarContenido(0); // Reproducir el primer contenido (video)

		// Reproducir todos los contenidos
		System.out.println("\r");
		biblioteca.ejecutarContenidos(); // Reproducir el primer contenido (video)
	}
}
