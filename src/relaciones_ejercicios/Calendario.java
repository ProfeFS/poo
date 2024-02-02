package relaciones_ejercicios;
import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private List<Evento> eventos;
    private String idioma;

    public Calendario() {
        eventos = new ArrayList<>();
        this.idioma = "ENG";
    }
    
    public Calendario(String idioma) { 
        eventos = new ArrayList<>(); 
        this.idioma = idioma.toUpperCase(); 
    } 


    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void mostrarEventos() {
        for (Evento evento : eventos) {
            System.out.println("Evento: " + evento.getTitulo() + ", Día: " + evento.getDia() + ", Hora: " + evento.getHora());
        }
    }
    
    public void imprimirCalendario() { 
        for (Evento evento : eventos) { 
            String nombreDia = (idioma.equals("ESP")) ? evento.getDia().getNombreEsp() : evento.getDia().getNombreIng(); 
            System.out.println(nombreDia + ": " + evento.getTitulo() + " a las " + evento.getHora()); 
        } 
    } 

}
