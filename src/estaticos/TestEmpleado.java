package estaticos;
public class TestEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("E123", "Alice");
        Empleado empleado2 = new Empleado("E456", "Bob");

        empleado1.marcarEntrada();
        empleado2.marcarEntrada();
        empleado1.marcarSalida();

        System.out.println("Total de empleados dentro del edificio: " + Empleado.getEmpleadosDentro());
    }
}
