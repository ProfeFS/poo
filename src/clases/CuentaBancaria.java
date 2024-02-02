package clases;

public class CuentaBancaria {
	// Atributos
	private String numeroCuenta;
	private double saldo;

	// Constructor
	public CuentaBancaria(String numeroCuenta, double saldoInicial) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldoInicial;
	}

	//este constructor inicializa todos los atributos a su valores por defecto.
	public CuentaBancaria() {

	}

	// Método para depositar dinero
	public void depositar(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
			System.out.println("Depósito realizado. Saldo actual: " + saldo);
		} else {
			System.out.println("Cantidad no válida para depositar.");
		}
	}

	// Método para retirar dinero / aunque si el método hace un cambio en el estado de un atributo, debería ser void, pueden existir excepciones que vienen dadas por convenios en la comunidad
	//o necesidades del negocio. Pero no debe ser arbitrario.
	public boolean retirar(double cantidad) {
		if (cantidad > 0 && saldo >= cantidad) {
			saldo -= cantidad;
			System.out.println("Retiro realizado. Saldo restante: " + saldo);
			return true;
		} else {
			System.out.println("Fondos insuficientes o cantidad no válida.");
			return false;
		}
	}

	// Método para consultar el saldo
	public double consultarSaldo() {

		return saldo;

	}

}