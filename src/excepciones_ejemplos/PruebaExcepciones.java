package excepciones_ejemplos;

public class PruebaExcepciones {

	public static void main(String[] args) {
		GestionCuentas gestion = new GestionCuentas();
		int resultado = 0;

		// int resultado = calculadora.calcularCuadrado(-5);
		try {
			resultado = gestion.calcularCuadrado(-5);
			System.out.println(resultado);
			
		} catch (IllegalArgumentException e) {
			System.err.println("Error al calcular el cuadrado: " + e.getMessage());
		} 
		
		double resultadoDiv = 0;
		
		try {
			resultadoDiv = gestion.dividir(1, 1);
			System.out.println(resultadoDiv);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
