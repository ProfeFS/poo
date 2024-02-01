package aaaexamen;

public class Producto {

	private int cod;
	private String nombre;
	private double precio;

	public Producto(int cod, String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.cod=cod;
	}

	public String getDetalle() {
		return "Producto: " + nombre + " Precio: " + precio + " | ";

	}

	public double getPrecio() {
		return precio;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
	
	

}
