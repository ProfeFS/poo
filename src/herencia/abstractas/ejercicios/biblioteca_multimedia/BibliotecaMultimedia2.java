package herencia.abstractas.ejercicios.biblioteca_multimedia;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaMultimedia2 {
	private List<ContenidoMultimedia> contenidos;

	public BibliotecaMultimedia2() {
		contenidos = new ArrayList<>();
	}

	public void addContenido(ContenidoMultimedia contenido) {
		contenidos.add(contenido);
	}

	public void mostrarContenidos() {
		System.out.println("Contenidos en la Biblioteca:");
		for (ContenidoMultimedia contenido : contenidos) {
			contenido.mostrarDetalles();
			System.out.println();
		}

	}
	
	public void reproducirContenidos() {
		for (ContenidoMultimedia contenido : contenidos) {
			contenido.reproducir();;
			System.out.println();
		}
	}

}
