package herencia.interfaces.ejercicio_metodo_pago;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		
		GestorPagos gestor = new GestorPagos();
		
		gestor.procesarPago(30, new Paypal("gynny@gmail.com", "fsdfsdf"));
		
		gestor.procesarPago(30, new Tarjeta("34234245", "122", LocalDate.of(2030, 1, 3)));
	}

}
