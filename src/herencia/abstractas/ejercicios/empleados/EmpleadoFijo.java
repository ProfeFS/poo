package herencia.abstractas.ejercicios.empleados;
public class EmpleadoFijo extends Empleado {
    private double salarioFijo;
    private double bonificacionAnual;

    public EmpleadoFijo(String nombre, String id, String departamento, double salarioFijo, double bonificacionAnual) {
        super(nombre, id, departamento);
        this.salarioFijo = salarioFijo;
        this.bonificacionAnual = bonificacionAnual;
    }

    @Override
    public double calcularSalario() {
        // El salario total podría incluir otros factores, como bonificaciones.
        // Aquí, simplemente retornamos el salario fijo como ejemplo.
        return salarioFijo + bonificacionAnual;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Salario Fijo: " + salarioFijo + ", Bonificación Anual: " + bonificacionAnual);
    }

    // Getters y Setters
    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    public double getBonificacionAnual() {
        return bonificacionAnual;
    }

    public void setBonificacionAnual(double bonificacionAnual) {
        this.bonificacionAnual = bonificacionAnual;
    }
}
