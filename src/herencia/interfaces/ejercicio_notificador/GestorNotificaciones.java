package herencia.interfaces.ejercicio_notificador;

public class GestorNotificaciones {

	public void procesarNotificacion(String mensaje, Notificador notificador) {
		notificador.enviarNotificacion(mensaje);
	}
}
