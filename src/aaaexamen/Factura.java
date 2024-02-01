package aaaexamen;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {
	
	private int cod;
	private ArrayList<Producto> productosVendidos;
	private LocalDate fechaVenta;
	private Estado estado;
	private String nombreCliente;
	

	public Factura(int codFact, ArrayList<Producto> productosVendidos, String nombreCliente) {
		this.productosVendidos = productosVendidos;
		this.nombreCliente = nombreCliente;
		fechaVenta = LocalDate.of(2023, 1, 26);
		//fechaVenta = LocalDate.now();
		estado = Estado.GENERADA;
		cod = codFact;
	}


	public LocalDate getFechaVenta() {
		return fechaVenta;
	}


	public Estado getEstado() {
		return estado;
	}


	public void mostrarDetalle() {		
		System.out.println("Factura: " +  cod);
		for(Producto p : productosVendidos) {
			System.out.println("    " + p.getDetalle());
		}
		System.out.println("    Total: " + getTotal());
		
	}
	
	private double getTotal() {
		double total=0;
		for(Producto p : productosVendidos) {
			total+= p.getPrecio();
		}
		return total;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	public int getCod() {
		return cod;
	}
	
	
	
	
	
	

}
