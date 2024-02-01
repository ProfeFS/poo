package aaaexamen;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {

	public static void main(String[] args) {

		Tienda tienda1 = new Tienda("PlazaEliptica");

		Producto p1 = new Producto(1, "Jabón", 1);
		Producto p2 = new Producto(2, "Arroz", 1);
		Producto p3 = new Producto(3, "Pasta", 2);
		Producto p4 = new Producto(4, "pollo", 5);
		Producto p5 = new Producto(5, "pañitos", 2);

		tienda1.registrarProducto(p1);
		tienda1.registrarProducto(p2);
		tienda1.registrarProducto(p3);
		tienda1.registrarProducto(p4);
		tienda1.registrarProducto(p5);

//		ArrayList<Producto> productosVenta = new ArrayList<>();
//		productosVenta.add(p5);
//		productosVenta.add(p1);

//		ArrayList<Producto> productosVenta2 = new ArrayList<>();
//		productosVenta2.add(p2);
//		productosVenta2.add(p3);
//		productosVenta2.add(p4);

//		tienda1.realizarVenta(tienda1.generateListaProductosAVender(), "Juan");
//		tienda1.realizarVenta(tienda1.generateListaProductosAVender2(), "Maria");
		
		ArrayList<Producto> productosVenta = tienda1.generateListaProductosAVender();
		
		tienda1.realizarVenta(productosVenta, "Juan");
		//tienda1.realizarVenta(tienda1.generateListaProductosAVender2(), "Maria");

		//tienda1.setEstadofactura(2, Estado.COBRADA);
		tienda1.imprimirDatelleFacturas(Estado.GENERADA, LocalDate.of(2023, 1, 26));

	}

}
