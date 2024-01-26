package examen_poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {
	private int codFact;
	private LocalDate fechaVenta;
	private ArrayList<Producto> productos;
	private String nombreCliente;
	private EstadoFactura estado;

	public Factura(int codFact, ArrayList<Producto> productos, String nombreCliente) {
		this.fechaVenta = LocalDate.of(2024, 1, 26);
		this.codFact = codFact;
		this.productos = productos;
		this.nombreCliente = nombreCliente;
		estado = EstadoFactura.GENERADA;
	}


	public LocalDate getFechaVenta() {
		return fechaVenta;
	}



	public EstadoFactura getEstado() {
		return estado;
	}



	private double getTotalfactura() {
		double total = 0;
		for (Producto producto : productos) {
			total += producto.getPrecio();
		}
		return total;
	}
	
	public void mostrarDetalles() {
		System.out.println("Factura: " + codFact);
		System.out.println("    Fecha venta: " + fechaVenta + " | Cliente: " + nombreCliente + " | Estado: " + estado);
		
		for (Producto producto : productos) {
			System.out.println("    " + producto);
		}
		
		System.out.println("    Total de factura: " + getTotalfactura());
	}

}
