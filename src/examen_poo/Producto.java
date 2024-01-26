package examen_poo;

public class Producto {
	
	String nombre;
	double precio;
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	

}
