package herencia.abstractas;

public class NotificadorEmail extends Notificador {

	private String direccionEmail;

	public NotificadorEmail(String mensaje, String direccionEmail) {
		super(mensaje);
		this.direccionEmail = direccionEmail;
	}

	@Override
	public void enviarNotificacion() {
		System.out.println("Enviando email a " + direccionEmail + " con el mensaje: " + getMensaje());

	}

}