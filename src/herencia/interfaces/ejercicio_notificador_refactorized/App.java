package herencia.interfaces.ejercicio_notificador_refactorized;

public class App {

	public static void main(String[] args) {
		Notificador notificador = new NotificadorEmail("hola@notificador.com");
		//Notificador notificador = new NotificadorSMS("536346456");
		
		notificador.enviarNotificacion("Tienes una nueva notificación");

	}

}
