package herencia.interfaces.ejercicio_reservas_hotel;

public class Standard extends Habitacion {

	public Standard(double precioBase, int piso) {
		super("Estandard", precioBase, piso);

	}

	@Override
	public double getCostoHabitacion() {
		return getPrecioBase();
	}

}
