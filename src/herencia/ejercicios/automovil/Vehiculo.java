package herencia.ejercicios.automovil;

import java.time.LocalDate;

public class Vehiculo {
	private String marca;
	private String modelo;
	private LocalDate anio;
	
	public Vehiculo(String marca, String modelo, LocalDate anio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	
	public void arrancar() {
		
	}
	
	public void detener() {
		
	}
	
	public void mostrarInfo() {
		System.out.print("Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + "]"); 
	}
	
	
	
	
	
	
	
}
