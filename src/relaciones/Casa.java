package relaciones;

import java.util.ArrayList;

public class Casa {
	private ArrayList<Habitacion> habitaciones;

	public Casa() {
		habitaciones = new ArrayList<>();
		habitaciones.add(new Habitacion()); // La casa se crea con habitaciones
	}

	// Métodos para gestionar habitaciones
}
