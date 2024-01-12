package relaciones_clinica;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Ana López", "AL123456");
        Cita cita1 = new Cita(paciente1, "",  new Date(), "Consulta general");

        // Mostrar detalles de la cita
        System.out.println("Cita para " + cita1.getPaciente().getNombre() + " con " + cita1.getDoctorNombre());
    }
}
