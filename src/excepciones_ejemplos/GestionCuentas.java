package excepciones_ejemplos;

public class GestionCuentas {

	Calculadora calculadora;

	public GestionCuentas() {
		calculadora = new Calculadora();
	}

	public int calcularCuadrado(int numero) {
		if (numero < 0) {
			// Lanzar una excepción no comprobada si el número es negativo
			throw new IllegalArgumentException("El número no puede ser negativo.");
		}
		return numero * numero;
	}

	public double dividir(int num, int den) {
		return calculadora.dividir(num, den);
	}

}
