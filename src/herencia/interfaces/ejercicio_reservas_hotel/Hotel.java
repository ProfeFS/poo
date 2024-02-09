package herencia.interfaces.ejercicio_reservas_hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private List<Habitacion> habitacionesReservadas;
	
	public Hotel() {
		habitacionesReservadas = new ArrayList<>();
	}
	
	public void registrarHabitacionReservada(Habitacion habitacion) {
		habitacionesReservadas.add(habitacion);
	}
	
	public void mostrarInfoHabitacionesReservadas() {
		for(Habitacion hab: habitacionesReservadas) {
			hab.mostrarInformacion();
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
}
