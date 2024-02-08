package herencia.interfaces.ejercicio_metodo_pago;

import java.time.LocalDate;

public class Tarjeta implements MetodoPago {

	private String numeroTarjeta;
	private String cvv;
	private LocalDate fechaExpiracion;

	public Tarjeta(String numeroTarjeta, String cvv, LocalDate fechaExpiracion) {
		this.numeroTarjeta = numeroTarjeta;
		this.cvv = cvv;
		this.fechaExpiracion = fechaExpiracion;
	}

	@Override
	public boolean autorizarCompra(double montoCompra) {
		
		return false;
	}

	@Override
	public void procesarPago(double montoCompra) {
		System.out.println("Se ha realizado el pago con tarjeta");
		
	}

}
