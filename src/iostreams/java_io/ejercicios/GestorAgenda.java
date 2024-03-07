package iostreams.java_io.ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class GestorAgenda {
    private Agenda agenda;
    private Scanner scanner;

    public GestorAgenda() {
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.print("Ingrese el nombre del archivo de la agenda: ");
        String archivoAgenda = scanner.nextLine();
        this.agenda = new Agenda(archivoAgenda);

        cargarAgenda();

        while (true) {
            System.out.println("\n1. Añadir contacto\n2. Mostrar contactos\n3. Guardar y salir");
            System.out.print("Seleccione una opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    añadirContacto();
                    break;
                case 2:
                    agenda.mostrarContactos();
                    break;
                case 3:
                    guardarYSalir();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void cargarAgenda() {
        try {
            agenda.leerAgenda();
            System.out.println("Agenda cargada exitosamente.");
        } catch (IOException e) {
            System.out.println("No se pudo cargar la agenda. Empezando una nueva.");
        }
    }

    private void añadirContacto() {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese email: ");
        String email = scanner.nextLine();

        agenda.añadirContacto(new Contacto(nombre, telefono, email));
        System.out.println("Contacto añadido.");
    }

    private void guardarYSalir() {
        try {
            agenda.guardarAgenda();
            System.out.println("Agenda guardada. Saliendo...");
        } catch (IOException e) {
            System.err.println("Error al guardar la agenda: " + e.getMessage());
        }
    }
}
