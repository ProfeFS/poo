package herencia.interfaces.ejercicio_metodo_pago;

public interface MetodoPago {
	
	boolean autorizarCompra(double montoCompra);
	
	void procesarPago(double montoCompra);
	

}
