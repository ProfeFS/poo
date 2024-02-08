package herencia.interfaces.ejercicio_notificador;

public class NotificadorMovil implements Notificador {
	private int numero;

	public NotificadorMovil(int numero) {
		this.numero = numero;
	}

	@Override
	public void enviarNotificacion(String mensaje) {
		System.out.println("Se ha enviado al móvil número: " + numero + " El siguiente mensaje: " + mensaje);

	}

}
