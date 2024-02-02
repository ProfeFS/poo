package ejercicio_restaurante;
import java.time.LocalDateTime;

public class Reserva {
    private LocalDateTime fechaHora;
    private int numeroPersonas;
    private String nombreCliente;
    private Mesa mesaAsignada;

    public Reserva(LocalDateTime fechaHora, int numeroPersonas, String nombreCliente, Mesa mesaAsignada) {
        this.fechaHora = fechaHora;
        this.numeroPersonas = numeroPersonas;
        this.nombreCliente = nombreCliente;
        this.mesaAsignada = mesaAsignada;
    }

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Mesa getMesaAsignada() {
		return mesaAsignada;
	}

	public void setMesaAsignada(Mesa mesaAsignada) {
		this.mesaAsignada = mesaAsignada;
	}

   
}
