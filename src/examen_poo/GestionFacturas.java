package examen_poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionFacturas {

	public static void main(String[] args) {

		Tienda tienda = new Tienda("MiTienda");
		
		Producto p1 = new Producto("jabón", 1);
		Producto p2 = new Producto("crema", 10);
		Producto p3 = new Producto("arroz", 2);
		Producto p4 = new Producto("cereal", 2);
		Producto p5 = new Producto("pasta", 3);
		
		tienda.registrarProducto(p5);
		tienda.registrarProducto(p1);
		tienda.registrarProducto(p2);
		tienda.registrarProducto(p3);
		tienda.registrarProducto(p4);
		
		ArrayList<Producto> prodVenta = new ArrayList<>();
		prodVenta.add(p5);
		prodVenta.add(p1);		
		
		tienda.realizarVenta(prodVenta, "Gynny");
		
		ArrayList<Producto> prodVenta2 = new ArrayList<>();
		prodVenta2.add(p2);
		prodVenta2.add(p4);	
		
		tienda.realizarVenta(prodVenta2, "José");
		
		tienda.mostrarFacturas(EstadoFactura.GENERADA, LocalDate.of(2024, 1, 26));
		
		

	}

}
