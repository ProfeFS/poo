package relaciones_clinica;

public class Paciente {
	private String nombre;
	private String identificacion;

	public Paciente(String nombre, String identificacion) {
		this.nombre = nombre;
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

}
