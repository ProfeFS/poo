package herencia.abstractas.ejercicios.empleados;
public class EmpleadoRemoto extends EmpleadoConHorario {
    private double compensacionInternet;

    public EmpleadoRemoto(String nombre, String id, String departamento, int horasTrabajadas, double tarifaPorHora, double compensacionInternet) {
        super(nombre, id, departamento, horasTrabajadas, tarifaPorHora);
        this.compensacionInternet = compensacionInternet;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + compensacionInternet;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Empleado Remoto, Compensación por Internet: " + compensacionInternet);
    }
}
