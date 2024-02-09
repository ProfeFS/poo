package herencia.interfaces.ejercicio_notificador_refactorized;

public class NotificadorSMS implements Notificador {
	private String numeroTelefono;

	public NotificadorSMS(String numeroTelefono) {
		
		this.numeroTelefono = numeroTelefono;
	}

	@Override
	public void enviarNotificacion(String mensaje) {
		System.out.println("Enviando SMS al número " + numeroTelefono + " con el mensaje: " + mensaje);
		
	}
}