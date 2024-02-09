package herencia.interfaces.ejercicio_reservas_hotel;

import java.util.List;

public interface ServicioAdicional {
	List<Servicio> getServicios();
	double getCostoServicio();

	// como acceso a spa, desayuno incluido, y servicio a la habitación
}
