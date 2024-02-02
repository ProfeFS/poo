package herencia.abstractas.ejercicios.empleados;
public class Main {
    public static void main(String[] args) {
        Empleado empleadoOficina = new EmpleadoOficina("Ana", "001", "Contabilidad", 160, 25.0, 300);
        Empleado empleadoRemoto = new EmpleadoRemoto("Luis", "002", "Desarrollo", 160, 20.0, 150);

        empleadoOficina.mostrarInformacion();
        System.out.println("Salario: " + empleadoOficina.calcularSalario());

        System.out.println("---");

        empleadoRemoto.mostrarInformacion();
        System.out.println("Salario: " + empleadoRemoto.calcularSalario());
        
        EmpleadoFijo empleadoFijo = new EmpleadoFijo("Elena", "004", "Marketing", 60000, 5000);

        System.out.println("---");
        empleadoFijo.mostrarInformacion();
        System.out.println("Salario Total: " + empleadoFijo.calcularSalario());
    }
}
