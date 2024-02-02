package herencia.ejercicios.empleados;

public class Empleado {

	private String nombre;
	private int id;
	private double salarioBase;

	public Empleado(String nombre, int id, double salarioBase) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.salarioBase = salarioBase;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public String mostrarInformacion() {
		return "Empleado [nombre=" + nombre + ", id=" + id + ", salario=" + salarioBase + "]";
	}

	public void setAumentoAnual(double aumento) {
		salarioBase += aumento;
	}

	public double calcularNomina() {
		return getSalarioBase();
	}

}
