package herencia.abstractas.ejercicios.biblioteca_multimedia_polimorfismo;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaMultimedia {
    private List<ContenidoMultimedia> contenidos;

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

    public void reproducirContenido(int indice) {
        if (indice >= 0 && indice < contenidos.size()) {
            ContenidoMultimedia contenido = contenidos.get(indice);
            System.out.println("Reproduciendo: ");
            contenido.reproducir();
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
    
    public void reproducirContenidos() {
    	for (ContenidoMultimedia contenido : contenidos) {
            contenido.reproducir();;
            System.out.println();
        }
    }
}
