package estaticos;
public class Empleado {
    private static int empleadosDentro = 0;

    private String id;
    private String nombre;
    private boolean estaDentro;

    public Empleado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.estaDentro = false;
    }

    public void marcarEntrada() {
        if (!estaDentro) {
            estaDentro = true;
            empleadosDentro++;
            System.out.println(nombre + " ha entrado en el edificio.");
        } else {
            System.out.println(nombre + " ya está dentro del edificio.");
        }
    }

    public void marcarSalida() {
        if (estaDentro) {
            estaDentro = false;
            empleadosDentro--;
            System.out.println(nombre + " ha salido del edificio.");
        } else {
            System.out.println(nombre + " ya está fuera del edificio.");
        }
    }

    public static int getEmpleadosDentro() {
        return empleadosDentro;
    }
}
