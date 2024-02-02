package herencia.abstractas;

public abstract class Notificador {
	private String mensaje;

	public Notificador(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	// Método abstracto para enviar notificación
	public abstract void enviarNotificacion();
}
