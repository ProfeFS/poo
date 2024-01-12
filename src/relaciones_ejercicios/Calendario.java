package relaciones_ejercicios;
import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private List<Evento> eventos;

    public Calendario() {
        eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void mostrarEventos() {
        for (Evento evento : eventos) {
            System.out.println("Evento: " + evento.getTitulo() + ", Día: " + evento.getDia() + ", Hora: " + evento.getHora());
        }
    }
}
