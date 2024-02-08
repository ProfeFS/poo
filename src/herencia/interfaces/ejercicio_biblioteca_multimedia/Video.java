package herencia.interfaces.ejercicio_biblioteca_multimedia;

public class Video extends ContenidoMultimedia implements Reproducible {
	private String resolucion;

	public Video(String titulo, String autor, double duracion, String resolucion) {
		super(titulo, autor, duracion);
		this.resolucion = resolucion;
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo video en resolución " + resolucion);
	}

	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Resolución: " + resolucion);
	}

	@Override
	public void ejecutar() {
		reproducir();

	}

}
