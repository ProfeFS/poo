package herencia.ejercicios.empleados;

public class SistemaGestionEmpleados {

	public static void main(String[] args) {

		Empleado empleadoRegular = new Empleado("Juan", 12, 1300.00 );
		
		Gerente gerenteRRHH= new Gerente("carmen", 13, 2000.00, "RRHH");
		
		Director directorComercial= new Director("Fátima", 14, 5000.00);
		
		System.out.println("Nómina empleado regular: " +empleadoRegular.calcularNomina());		
		System.out.println("Nómina Gerente: " +gerenteRRHH.calcularNomina());
		System.out.println("Nómina Director: " +directorComercial.calcularNomina());
		
		empleadoRegular.setAumentoAnual(100);
		gerenteRRHH.setAumentoAnual(100);
		directorComercial.setAumentoAnual(100);
		
		System.out.println("\r luego del aumento");
		System.out.println("Nómina empleado regular: " +empleadoRegular.calcularNomina());		
		System.out.println("Nómina Gerente: " +gerenteRRHH.calcularNomina());
		System.out.println("Nómina Director: " +directorComercial.calcularNomina());
		
				
		
	}

}
