package herencia.interfaces.ejercicio_notificador;

public class NotificadorEmail implements Notificador {

	String email;

	public NotificadorEmail(String email) {
		super();
		this.email = email;
	}

	@Override
	public void enviarNotificacion(String mensaje) {
		System.out.println("Se ha enviado un email a la dirección: " + email + " con el siguiente mensaje: " + mensaje);

	}

}
