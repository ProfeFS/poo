package herencia.ejercicios.empleados;

public class Gerente extends Empleado {

	private String departamentoaCargo;
	private final double PLUS = 1200;

	public Gerente(String nombre, int id, double salario, String depto) {
		super(nombre, id, salario);
		departamentoaCargo = depto;

	}
	
	public double calcularNomina() {
		return super.calcularNomina() + PLUS/12;
	}

	public String mostrarInformacion() {
		return super.mostrarInformacion() + "Departamento a cargo: " + departamentoaCargo;
	}

}
