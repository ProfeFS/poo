package herencia.ejercicios.automovil;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<Vehiculo> vehiculos = new ArrayList<>();

		Vehiculo coche = new Vehiculo("Audi", "A1", LocalDate.of(2023, 1, 1));
		Vehiculo moto = new Vehiculo("Yamaha", "xx", LocalDate.of(2024, 1, 1));
		Vehiculo camion = new Vehiculo("Toyota", "cc", LocalDate.of(2023, 6, 1));

		vehiculos.add(coche);
		vehiculos.add(camion);
		vehiculos.add(moto);

		Coche miCoche = new Coche("Audi", "A1", LocalDate.of(2023, 1, 1), 5);
		Motocicleta miMoto = new Motocicleta("Yamaha", "xx", LocalDate.of(2024, 1, 1), false);
		
		miCoche.mostrarInfor();
		miMoto.mostrarInfo();

	}

}
