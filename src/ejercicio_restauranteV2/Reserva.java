package ejercicio_restauranteV2;

import java.time.LocalDateTime;

public class Reserva {

	private int cod;
	public static int contReservas;
	private int codMesa;
	private String nombreCliente;
	private LocalDateTime fechaReserva;
	private int cantPersonas;

	public Reserva(int codMesa, String nombreCliente, LocalDateTime fechaReserva, int cantPersonas) {
		this.cod = ++contReservas;		
		this.nombreCliente = nombreCliente;
		setReservationInfo(codMesa,fechaReserva, cantPersonas );
	}
	
	public void setReservationInfo(int codMesa, LocalDateTime fechaReserva, int cantPersonas) {
		this.codMesa = codMesa;
		this.fechaReserva = fechaReserva;
		this.cantPersonas = cantPersonas;
	}

	public int getCod() {
		return cod;
	}

	public void setFechaReserva(LocalDateTime fechaReserva) {
		this.fechaReserva = fechaReserva;

	}
	
	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}
	
	public void setCodMesa(int codMesa){
		this.codMesa = codMesa;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	
	public LocalDateTime getFechaReserva() {
		return fechaReserva;
	}

	public int getCodMesa() {
		return codMesa;
	}
	
}
