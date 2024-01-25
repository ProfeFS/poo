package ejercicio_restaurante;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Restaurante {
	private String nombre;
	private ArrayList<Mesa> mesas;
	private ArrayList<Reserva> reservas;

	public Restaurante(String nombre) {
		this.nombre = nombre;
		this.mesas = new ArrayList<>();
		this.reservas = new ArrayList<>();
	}

	public void agregarMesa(Mesa mesa) {
		mesas.add(mesa);
	}

	public boolean realizarReserva(LocalDateTime fechaHora, int numeroPersonas, String nombreCliente) {

		Mesa mesaDisponible = encontrarMesaDisponible(numeroPersonas, fechaHora);
		if (mesaDisponible != null) {
			Reserva reserva = new Reserva(fechaHora, numeroPersonas, nombreCliente, mesaDisponible);
			reservas.add(reserva);
			return true;
		}
		return false;
	}

	public boolean realizarReserva2(LocalDateTime fechaHora, int numeroPersonas, String nombreCliente) {

		Mesa mesaDisponible = null;
		boolean estaMesaReservada = false;

		for (Mesa mesa : mesas) {
			for (Reserva reserva : reservas) {
				if (reserva.getMesaAsignada().equals(mesa) && reserva.getFechaHora().equals(fechaHora)) {
					estaMesaReservada = true;
				}
			}

			if (mesa.getCapacidadMaxima() >= numeroPersonas && !estaMesaReservada) {
				mesaDisponible = mesa;
			}
		}

		if (mesaDisponible != null) {
			Reserva reserva = new Reserva(fechaHora, numeroPersonas, nombreCliente, mesaDisponible);
			reservas.add(reserva);
			return true;
		}
		return false;
	}

	private Mesa encontrarMesaDisponible(int numeroPersonas, LocalDateTime fechaHora) {
		for (Mesa mesa : mesas) {
			if (mesa.getCapacidadMaxima() >= numeroPersonas && !estaMesaReservada(mesa, fechaHora)) {
				return mesa;
			}
		}
		return null;
	}

	private boolean estaMesaReservada(Mesa mesa, LocalDateTime fechaHora) {
		for (Reserva reserva : reservas) {
			if (reserva.getMesaAsignada().equals(mesa) && reserva.getFechaHora().equals(fechaHora)) {
				return true;
			}
		}
		return false;
	}

	public boolean cancelarReserva(LocalDateTime fechaHora, String nombreCliente) {
		for (Reserva reserva : reservas) {
			if (reserva.getFechaHora().equals(fechaHora) && reserva.getNombreCliente().equals(nombreCliente)) {
				reservas.remove(reserva);
				return true;
			}
		}
		return false;
	}

	public boolean modificarReserva(LocalDateTime fechaHoraOriginal, String nombreCliente, LocalDateTime nuevaFechaHora,
			int nuevoNumeroPersonas) {
		for (Reserva reserva : reservas) {
			if (reserva.getFechaHora().equals(fechaHoraOriginal) && reserva.getNombreCliente().equals(nombreCliente)) {
				Mesa mesaDisponible = encontrarMesaDisponible(nuevoNumeroPersonas, nuevaFechaHora);
				if (mesaDisponible != null) {
					reserva.setFechaHora(nuevaFechaHora);
					reserva.setNumeroPersonas(nuevoNumeroPersonas);
					reserva.setMesaAsignada(mesaDisponible);
					return true;
				}
				break;
			}
		}
		return false;
	}

	public void mostrarReservasPorFecha(LocalDateTime fecha) {
		for (Reserva reserva : reservas) {
			if (reserva.getFechaHora().toLocalDate().equals(fecha.toLocalDate())) {
				System.out.println("Reserva: " + reserva.getNombreCliente() + ", Mesa: "
						+ reserva.getMesaAsignada().getNumero() + ", Fecha y Hora: " + reserva.getFechaHora());
			}
		}
	}

	public void mostrarMesasDisponibles(LocalDateTime fechaHora) {
		for (Mesa mesa : mesas) {
			if (!estaMesaReservada(mesa, fechaHora)) {
				System.out
						.println("Mesa disponible: " + mesa.getNumero() + ", Capacidad: " + mesa.getCapacidadMaxima());
			}
		}
	}

}
