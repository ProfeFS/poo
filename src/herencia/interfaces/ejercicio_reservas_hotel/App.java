package herencia.interfaces.ejercicio_reservas_hotel;

public class App {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		
		Standard habS = new Standard(50.0, 1);
		Suite suite = new Suite(100.00, 4);
		
		hotel.registrarHabitacionReservada(habS);
		hotel.registrarHabitacionReservada(suite);
		
		hotel.mostrarInfoHabitacionesReservadas();

	}

}
