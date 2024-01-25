package ejercicio_restauranteV2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Restaurante {
	String nombre;
	ArrayList<Reserva> reservas;
	ArrayList<Mesa> mesas;

	public Restaurante(String nombre, ArrayList<Mesa> mesas) {
		this.mesas = mesas;
		this.nombre = nombre;
		this.reservas = new ArrayList<>();
	}

	public int createReservation(LocalDateTime fechaReserva, String nombreCliente, int cantPersonas) {
		Mesa mesaDisponible = buscarMesaDisponible(fechaReserva, cantPersonas);
		if (mesaDisponible != null) {
			Reserva reserva = new Reserva(mesaDisponible.getCodMesa(), nombreCliente, fechaReserva, cantPersonas);
			reservas.add(reserva);
			return reserva.getCod();
		} else {
			return -1;
		}
	}

	private Mesa buscarMesaDisponible(LocalDateTime fechaReserva, int cantPersonas) {
		for (Mesa mesa : mesas) {
			if (cantPersonas <= mesa.getNumMaximo() && !isTableReserved(mesa, fechaReserva)) {
				return mesa;
			}
		}

		return null;
	}

	private boolean isTableReserved(Mesa mesa, LocalDateTime fechaReserva) {
		for (Reserva reserva : reservas) {
			if (reserva.getCodMesa() == mesa.getCodMesa() && reserva.getFechaReserva().equals(fechaReserva)) {
				return true;
			}
		}
		return false;
	}

	public void updateReservation(String nombreCliente, LocalDateTime fechaReserva, int cantPersonas) {
		Mesa mesaDisponible = buscarMesaDisponible(fechaReserva, cantPersonas);
		if (mesaDisponible != null) {
			Reserva reserva = buscarReserva(nombreCliente, fechaReserva);
			if (reserva != null) {
				reserva.setReservationInfo(mesaDisponible.getCodMesa(), fechaReserva, cantPersonas);
			} else {
				System.out.println("No existe una reserva con esos datos");
			}
		} else {
			System.out.println("NO hay mesas disponibles para esa fecha/hora");
		}
	}

	private Reserva buscarReserva(String nombreCliente, LocalDateTime fechaReserva) {
		for (Reserva reserva : reservas) {
			if (reserva.getNombreCliente().equalsIgnoreCase(nombreCliente)
					&& reserva.getFechaReserva().equals(fechaReserva)) {
				return reserva;
			}
		}
		return null;
	}

	public void cancelReservation(String nombreCliente, LocalDateTime fechaReserva) {
		Reserva reserva = buscarReserva(nombreCliente, fechaReserva);
		if (reserva != null) {
			reservas.remove(reserva);
		} else {
			System.out.println("No existe una reserva con esos datos");
		}
	}

}
