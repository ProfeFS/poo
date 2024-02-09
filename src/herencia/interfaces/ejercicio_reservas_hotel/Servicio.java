package herencia.interfaces.ejercicio_reservas_hotel;

public enum Servicio {
	SPA(50), DESAYUNO(10), SERVICIO_HABITACION(15);

	double precio;

	private Servicio(double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	}

}
