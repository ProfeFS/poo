package clases;
public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;
    private boolean alarmaActivada;

    public Reloj() {
        
    }

    public void establecerHora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void activarAlarma() {
        alarmaActivada = true;
    }

    public void desactivarAlarma() {
        alarmaActivada = false;
    }

    public String mostrarHora() {
        return "Hora actual: " + hora + ":" + minutos + ":" + segundos;
    }
}
