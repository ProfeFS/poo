package herencia.interfaces.ejercicio_notificador_refactorized;

public class NotificadorEmail implements Notificador {

	private String direccionEmail;

	public NotificadorEmail(String direccionEmail) {
		this.direccionEmail = direccionEmail;
	}

	@Override
	public void enviarNotificacion(String mensaje) {
		System.out.println("Enviando email a " + direccionEmail + " con el mensaje: " + mensaje);

	}

}