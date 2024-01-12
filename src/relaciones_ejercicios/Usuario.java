package relaciones_ejercicios;
public class Usuario {
    private String nombre;
    private String identificacion;

    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", identificacion=" + identificacion + "]";
	}



    // Puedes agregar aquí más métodos si son necesarios
}
