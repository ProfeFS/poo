package herencia.abstractas.ejercicios.empleados;

public abstract class EmpleadoConHorario extends Empleado {
	protected int horasTrabajadas;
	protected double tarifaPorHora;

	public EmpleadoConHorario(String nombre, String id, String departamento, int horasTrabajadas,
			double tarifaPorHora) {
		super(nombre, id, departamento);
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaPorHora = tarifaPorHora;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public double getTarifaPorHora() {
		return tarifaPorHora;
	}

//	@Override
//	public double calcularSalario() {
//		return horasTrabajadas * tarifaPorHora;
//	}

}
