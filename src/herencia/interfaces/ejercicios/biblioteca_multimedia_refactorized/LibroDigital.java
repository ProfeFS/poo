package herencia.interfaces.ejercicios.biblioteca_multimedia_refactorized;
public class LibroDigital extends ContenidoMultimedia {
    private int numeroPaginas;

    public LibroDigital(String titulo, String autor, double duracion, int numeroPaginas) {
        super(titulo, autor, duracion);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de Páginas: " + numeroPaginas);
    }


	@Override
	public void iniciar() {
		 System.out.println("Abriendo libro electrónico");
		
	}
}
