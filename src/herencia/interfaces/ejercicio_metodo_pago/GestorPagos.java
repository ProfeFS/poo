package herencia.interfaces.ejercicio_metodo_pago;

public class GestorPagos {

	public void procesarPago(double monto, MetodoPago metodoPago) {
		if (metodoPago.autorizarCompra(monto)) {
			System.out.println("Compra autorizada, procederemos al cobro");
			metodoPago.procesarPago(monto);
		} else {
			System.out.println("No se ha autorizado el pago, por favor intente con otro método de pago");
		}
	}

}
