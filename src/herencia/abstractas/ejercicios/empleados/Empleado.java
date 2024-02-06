package herencia.abstractas.ejercicios.empleados;

public abstract class Empleado {
	protected String nombre;
	protected String id;
	protected String departamento;

	public Empleado(String nombre, String id, String departamento) {
		this.nombre = nombre;
		this.id = id;
		this.departamento = departamento;
	}

	public abstract double calcularSalario();

	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre + ", ID: " + id + ", Departamento: " + departamento);
	}
}
