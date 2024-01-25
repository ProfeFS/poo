package ejercicio_restauranteV2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GestionReservas {

	public static void main(String[] args) {

		ArrayList<Mesa> mesas = new ArrayList<>();
		Mesa mesa1 = new Mesa(1, 4);
		Mesa mesa2 = new Mesa(2, 4);
		Mesa mesa3 = new Mesa(3, 2);
		Mesa mesa5 = new Mesa(66, 2);
		Mesa mesa4 = new Mesa(4, 5);
		Mesa mesa6 = new Mesa(5, 5);

		mesas.add(mesa6);
		mesas.add(mesa1);
		mesas.add(mesa2);
		mesas.add(mesa3);
		mesas.add(mesa4);
		mesas.add(mesa5);

		Restaurante restaurante = new Restaurante("El sazón de Andrés", mesas);
		
		System.out.println(restaurante.createReservation(LocalDateTime.of(2024, 1, 24, 19, 30), "Iván", 5));
		System.out.println(restaurante.createReservation(LocalDateTime.of(2024, 1, 24, 19, 30), "Iván", 5));
		System.out.println(restaurante.createReservation(LocalDateTime.of(2024, 1, 24, 19, 30), "Iván", 1));

	}

}
