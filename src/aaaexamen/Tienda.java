package aaaexamen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

	private String nombre;
	private ArrayList<Producto> productos;
	private ArrayList<Factura> facturas;
	
	private Scanner sc = new Scanner(System.in);

	public Tienda(String nombre) {
		this.nombre = nombre;
		this.productos = new ArrayList<>();
		this.facturas = new ArrayList<>();
	}

	public void registrarProducto(Producto p) {
		productos.add(p);

	}

	public void realizarVenta(ArrayList<Producto> productosVenta, String nombreCliente) {
		Factura factura = new Factura(facturas.size()+1, productosVenta, nombreCliente);
		facturas.add(factura);
	}

	public void imprimirDatelleFacturas(Estado estado, LocalDate fechaVenta) {
		for(Factura factura : facturas) {
			if(factura.getEstado().equals(estado) && factura.getFechaVenta().equals(fechaVenta)) {
				factura.mostrarDetalle();
			}
		}
	}

	public void imprimirDatelleFacturaGeneradas(LocalDate fechaVenta) {
		for(Factura factura : facturas) {
			if(factura.getEstado().equals(Estado.GENERADA) && factura.getFechaVenta().equals(fechaVenta)) {
				factura.mostrarDetalle();
			}
		}
	}
	
	public void setEstadofactura(int cod, Estado estado) {
		for(Factura factura: facturas) {
			if(factura.getCod() == cod) {
				factura.setEstado(estado);
			}
		}
	}
	
	public ArrayList<Producto> generateListaProductosAVender(){
		int codProd =-1;
		ArrayList<Producto> productosAVender = new ArrayList<>();
		
		do {
			
			System.out.println("Ingrese el cod producto / 0 para terminar de ingresar productos");
			codProd = sc.nextInt();
			
			Producto p = buscarProducto(codProd);
			productosAVender.add(p);
			
			
		} while (codProd != 0);
		
		return productosAVender;
	}
	
	private Producto buscarProducto(int codProd) {

		for(Producto producto : productos) {
			if(producto.getCod() == codProd) {
				return producto;
			}
		}
		return null;
	}

	public ArrayList<Producto> generateListaProductosAVender2(){
		ArrayList<Producto> productosAVender = new ArrayList<>();
		productosAVender.add(productos.get(1));
		productosAVender.add(productos.get(2));	
		productosAVender.add(productos.get(4));	
		return productosAVender;
	}
	
	
}
