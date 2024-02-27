package excepciones.ejemplos;

public class Calculadora {

	public int calcularCuadrado(int numero) {
		if (numero < 0) {
			// Lanzar una excepción no comprobada si el número es negativo
			throw new IllegalArgumentException("El número no puede ser negativo.");
		}
		return numero * numero;
	}
	
	public double dividir(int num, int den){
		
		if(den==0) {
			throw new ArithmeticException("El denominador no puede ser cero: ->By Zero");
		}
		
		return num/den;
	}

}
