package clases;

import java.util.ArrayList;

public class JuegoMovil {
    private String nombre;
    private String version;
    private boolean iniciado;
    private ArrayList<Integer> puntuacionesAltas;

    public JuegoMovil(String nombre, String version) {
        this.nombre = nombre;
        this.version = version;
        this.puntuacionesAltas = new ArrayList<>();
    }

    public void iniciarJuego() {
        iniciado = true;
    }

    public void finalizarJuego() {
    	iniciado = false;
    }

    public void guardarPuntuacion(int puntuacion) {
        puntuacionesAltas.add(puntuacion);
        // Ordenar o actualizar puntuaciones si es necesario
    }

    public String mostrarPuntuaciones() {
        return "Puntuaciones Altas: " + puntuacionesAltas;
    }
    
    public String mostrarEstado() {
    	return iniciado? "Juego Iniciado" : "Juego Finalizado";
    }
}
