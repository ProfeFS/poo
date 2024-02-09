package herencia.interfaces.ejercicios.biblioteca_multimedia_refactorized;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaMultimedia {
    private List<ContenidoMultimedia> contenidos;
    private List<Reproducible> contenidoReproducible;

    public BibliotecaMultimedia() {
        this.contenidos = new ArrayList<>();
    }

    public void añadirContenido(ContenidoMultimedia contenido) {
        contenidos.add(contenido);
    }

    public void mostrarContenidos() {
        System.out.println("Contenidos en la Biblioteca:");
        for (ContenidoMultimedia contenido : contenidos) {
            contenido.mostrarDetalles();
            System.out.println();
        }
    }

    public void ejecutarContenido(int indice) {
        if (indice >= 0 && indice < contenidos.size()) {
            ContenidoMultimedia contenido = contenidos.get(indice);
            System.out.println("Reproduciendo: ");
            contenido.iniciar();
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
    
    public void ejecutarContenidos() {
    	for (ContenidoMultimedia contenido : contenidos) {
    		contenido.iniciar();
            System.out.println();
        }
    }
}
