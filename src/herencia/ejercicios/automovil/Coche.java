package herencia.ejercicios.automovil;

import java.time.LocalDate;

public class Coche extends Vehiculo {

	private int numeroDePuertas;

	public Coche(String marca, String modelo, LocalDate anio, int numeroDePuertas) {
		super(marca, modelo, anio);
		this.numeroDePuertas = numeroDePuertas;
	}

	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println(", Número de puertas: " + numeroDePuertas);
	}

}
