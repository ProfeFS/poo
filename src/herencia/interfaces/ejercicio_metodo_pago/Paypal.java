package herencia.interfaces.ejercicio_metodo_pago;

public class Paypal implements MetodoPago {
	
	private String email;
	private String contrasenia;
	
	public Paypal(String email, String contrasenia) {
		this.email = email;
		this.contrasenia = contrasenia;
	}
	
	@Override
	public boolean autorizarCompra(double montoCompras) {
		//Lógica de validación de contraseña con paypal y suficiencia de fondos
		return true;
	}
	@Override
	public void procesarPago(double montoCompra) {
		System.out.println("Se ha realizado el pago con Paypal de forma exitosa");
		
	}
	
	

}
