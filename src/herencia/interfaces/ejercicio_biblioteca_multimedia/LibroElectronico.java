package herencia.interfaces.ejercicio_biblioteca_multimedia;

public class LibroElectronico extends ContenidoMultimedia {
	private int numeroPaginas;

	public LibroElectronico(String titulo, String autor, double duracion, int numeroPaginas) {
		super(titulo, autor, duracion);
		this.numeroPaginas = numeroPaginas;
	}

	public void iniciarLectura(int numPagina) {
		System.out.println("Iniciando lelctura desde la página: " + numPagina);
	}

	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Número de Páginas: " + numeroPaginas);
	}

	@Override
	public void ejecutar() {

		System.out.println("abriendo libro");
	}
}
