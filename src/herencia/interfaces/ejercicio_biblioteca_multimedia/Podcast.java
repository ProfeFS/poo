package herencia.interfaces.ejercicio_biblioteca_multimedia;

public class Podcast extends ContenidoMultimedia implements Reproducible {
	private String formatoAudio;

	public Podcast(String titulo, String autor, double duracion, String formatoAudio) {
		super(titulo, autor, duracion);
		this.formatoAudio = formatoAudio;
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo podcast en formato " + formatoAudio);
	}

	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Formato de Audio: " + formatoAudio);
	}

	@Override
	public void ejecutar() {
		reproducir();
	}

}
