package clases;

import java.util.ArrayList;

public class CuentaEstudianteArrayList {
    private String nombre;
    private String numeroIdentificacion;
    private ArrayList<String> asignaturasMatriculadas;
    private double saldoCreditos;

    public CuentaEstudianteArrayList(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.asignaturasMatriculadas = new ArrayList<>();
        this.saldoCreditos = 0;
    }

    public void matricularAsignatura(String asignatura) {
        asignaturasMatriculadas.add(asignatura);
        // Ajustar saldo de créditos si es necesario
    }

    public void ajustarSaldoCreditos(double cantidad) {
		saldoCreditos += cantidad; //
	}

    public String mostrarInformacion() {
        return "Estudiante: " + nombre + "\nNúmero de Identificación: " + numeroIdentificacion + 
               "\nSaldo de Créditos: " + saldoCreditos + "\nAsignaturas Matriculadas: " + asignaturasMatriculadas;
    }
}
