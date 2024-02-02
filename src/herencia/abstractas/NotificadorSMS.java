package herencia.abstractas;

public class NotificadorSMS extends Notificador {
	private String numeroTelefono;

	public NotificadorSMS(String mensaje, String numeroTelefono) {
		super(mensaje);
		this.numeroTelefono = numeroTelefono;
	}

	@Override
	public void enviarNotificacion() {
		System.out.println("Enviando SMS al número " + numeroTelefono + " con el mensaje: " + getMensaje());
		
	}
}