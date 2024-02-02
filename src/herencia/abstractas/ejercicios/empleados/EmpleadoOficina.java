package herencia.abstractas.ejercicios.empleados;
public class EmpleadoOficina extends EmpleadoConHorario {
    private double bonificacion;

    public EmpleadoOficina(String nombre, String id, String departamento, int horasTrabajadas, double tarifaPorHora, double bonificacion) {
        super(nombre, id, departamento, horasTrabajadas, tarifaPorHora);
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonificacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Empleado de Oficina, Bonificación: " + bonificacion);
    }
}
