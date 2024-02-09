package herencia.interfaces.ejercicio_reservas_hotel;

import java.util.ArrayList;
import java.util.List;

public class Deluxe extends Habitacion implements ServicioAdicional {
	List<Servicio> serviciosDeluxe = new ArrayList<>();

	public Deluxe(double precioBase, int piso) {
		super("Deluxe", precioBase, piso);
		serviciosDeluxe.add(Servicio.DESAYUNO);
		serviciosDeluxe.add(Servicio.SERVICIO_HABITACION);
	}

	@Override
	public double getCostoHabitacion() {
		return getPrecioBase() + getCostoServicio();
	}

	@Override
	public double getCostoServicio() {
		double costo =0;
		for(Servicio servicio: serviciosDeluxe ) {
			costo += servicio.getPrecio();
		}		
		return costo;
	}

	@Override
	public List<Servicio> getServicios() {
		return serviciosDeluxe;
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println(", Costo total con servicios: " + getCostoHabitacion());
	}

}
