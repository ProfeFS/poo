package enums;

public class Semaforo {

	ColorSemaforo estado;

	//constructor que crea un nuevo semáforo en rojo
	public Semaforo() {
		this.estado = ColorSemaforo.ROJO;
	}

	public void cambiarEstado(ColorSemaforo nuevoColor) {
		estado = nuevoColor;
	}

	public void mostrarEstado() {
		System.out.println("El semáforo está en " + estado);
	}

}
