package relaciones_ejercicios;
public class PlanificaciónEventos {
    public static void main(String[] args) {
        // Crear eventos
        Evento evento1 = new Evento("Reunión de equipo", DiaSemana.LUNES, "10:00");
        Evento evento2 = new Evento("Consulta médica", DiaSemana.MIERCOLES, "15:00");

        // Crear calendario y agregar eventos
        Calendario calendario = new Calendario();
        calendario.agregarEvento(evento1);
        calendario.agregarEvento(evento2);

        // Mostrar eventos del calendario
        calendario.mostrarEventos();
        calendario.imprimirCalendario();
    }
}
