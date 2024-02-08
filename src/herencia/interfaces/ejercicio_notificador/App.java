package herencia.interfaces.ejercicio_notificador;

public class App {

	public static void main(String[] args) {
		
		GestorNotificaciones gestor = new GestorNotificaciones();
		
		String mensaje = "Tienes una notificación importante";
		
		gestor.procesarNotificacion(mensaje, new NotificadorMovil(111));
		

	}

}
