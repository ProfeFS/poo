package herencia.abstractas.ejercicios.biblioteca_multimedia;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaMultimedia {
	private List<Video> videos;
	private List<Podcast> podcasts;
	private List<LibroElectronico> librosElectronicos;
	

	public BibliotecaMultimedia() {
		this.videos = new ArrayList<>();
		this.podcasts = new ArrayList<>();
		this.librosElectronicos = new ArrayList<>();
	}

	public void addContenido(Video video) {
		videos.add(video);
	}

	public void addContenido(LibroElectronico LibroElectronico) {
		librosElectronicos.add(LibroElectronico);
	}

	public void addContenido(Podcast podcast) {
		podcasts.add(podcast);
	}

	public void mostrarContenidos() {
		System.out.println("Contenidos en la Biblioteca:");
		for (Video contenido : videos) {
			contenido.mostrarDetalles();
			System.out.println();
		}
		
		for (Podcast contenido : podcasts) {
			contenido.mostrarDetalles();
			System.out.println();
		}
		
		
		for (LibroElectronico contenido : librosElectronicos) {
			contenido.mostrarDetalles();
			System.out.println();
		}
		
		
	}


}
