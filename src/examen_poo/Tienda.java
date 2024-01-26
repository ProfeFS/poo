package examen_poo;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Tienda {

	String nombre;
	ArrayList<Producto> productos;
	ArrayList<Factura> facturasTienda;

	public Tienda(String nombre) {
		this.nombre = nombre;
		productos = new ArrayList<>();
		facturasTienda = new ArrayList<>();

	}

	public void registrarProducto(Producto producto) {
		productos.add(producto);
	}

	public void realizarVenta(ArrayList<Producto> productos, String nombreCliente) {
		Factura factura = new Factura(facturasTienda.size() + 1, productos, nombreCliente);
		facturasTienda.add(factura);
		System.out.println("venta realizada, se ha agregado una nueva factura");
	}
	
	private ArrayList<Factura> getFacturas(EstadoFactura estado, LocalDate fechaVenta){
		ArrayList<Factura> facturasEstado = new ArrayList<>();
		for(Factura factura: facturasTienda) {
			if(factura.getEstado().equals(estado) && factura.getFechaVenta().equals(fechaVenta)) {
				facturasEstado.add(factura);
				
			}
		}		
		
		return facturasTienda;
		
	}
	
	public void mostrarFacturas(EstadoFactura estado, LocalDate fechaVenta) {
		for(Factura factura: getFacturas(estado, fechaVenta) ) {
			factura.mostrarDetalles();
		}
	}
	
	public ArrayList<Producto> generarListaProductosEnMostrador(){
		ArrayList<Producto> productosMostrador = new ArrayList<>();
		productosMostrador.add(productos.get(0));
		productosMostrador.add(productos.get(2));
		
		return productosMostrador;
		
	}

}
