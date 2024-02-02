package herencia.ejercicios.empleados;

public class Director extends Empleado {

	private Double bonoAnual;
	private int acciones;

	public Director(String nombre, int id, double salario) {
		super(nombre, id, salario);
		acciones = 100;
		bonoAnual = 5000.00;
	}
	
	public void comprarAcciones(int cantAcciones) {
		acciones += cantAcciones;
	}
	
	public void setAumentoAnual(double aumento) {	
		double plus = bonoAnual <=5000.00?  1000.00 : 500;
		super.setAumentoAnual(aumento + plus);
	}
	
	public double calcularNomina() {
		return getSalarioBase() + bonoAnual/12 ;
	}
	

}
