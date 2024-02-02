package clases;

import java.util.ArrayList;

public class CuentaEstudiante {
	private String nombre;
	private String numeroIdentificacion;
	private String[] asignaturasMatriculadas;
	private double saldoCreditos;

	public CuentaEstudiante(String nombre, String numeroIdentificacion) {
		this.nombre = nombre;
		this.numeroIdentificacion = numeroIdentificacion;
		this.saldoCreditos = 0;
		asignaturasMatriculadas = new String[5];
	}

	public void matricularAsignatura(String asignatura) {
		for (String cupoAsignatura : asignaturasMatriculadas) {
			if (cupoAsignatura == null) {
				cupoAsignatura = asignatura;
			}
		}
	}

	public void ajustarSaldoCreditos(double cantidad) {
		saldoCreditos += cantidad; //
	}

	public String mostrarInformacion() {
		return "Estudiante: " + nombre + "\nNúmero de Identificación: " + numeroIdentificacion + "\nSaldo de Créditos: "
				+ saldoCreditos + "\nAsignaturas Matriculadas: " + asignaturasMatriculadas;
	}
}
