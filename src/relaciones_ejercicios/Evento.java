package relaciones_ejercicios;
public class Evento {
    private String titulo;
    private DiaSemana dia;
    private String hora;

    public Evento(String titulo, DiaSemana dia, String hora) {
        this.titulo = titulo;
        this.dia = dia;
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public DiaSemana getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }
}
