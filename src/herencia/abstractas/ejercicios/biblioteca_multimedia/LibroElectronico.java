package herencia.abstractas.ejercicios.biblioteca_multimedia;
public class LibroElectronico extends ContenidoMultimedia {
    private int numeroPaginas;

    public LibroElectronico(String titulo, String autor, double duracion, int numeroPaginas) {
        super(titulo, autor, duracion);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void reproducir() {
        System.out.println("Mostrando libro electrónico, páginas: " + numeroPaginas);
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de Páginas: " + numeroPaginas);
    }
}
