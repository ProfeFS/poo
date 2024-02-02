package ejercicio_restaurante;
import java.time.LocalDateTime;

public class SistemaReservasRestaurante {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("La Buena Mesa");

        // Agregar mesas
        restaurante.agregarMesa(new Mesa(1, 1));
        
        restaurante.agregarMesa(new Mesa(2, 2));

        // Intentar realizar una reserva
        LocalDateTime fechaHoraReserva = LocalDateTime.of(2024, 5, 10, 19, 0);
        boolean resultado = restaurante.realizarReserva(fechaHoraReserva, 2, "Juan Pérez");

        if (resultado) {
            System.out.println("Reserva realizada con éxito.");
        } else {
            System.out.println("No se pudo realizar la reserva.");
        }
        
        
        fechaHoraReserva = LocalDateTime.of(2024, 5, 10, 19, 0);
        if (restaurante.realizarReserva(fechaHoraReserva, 2, "Juan Pérez")) {
            System.out.println("Reserva realizada con éxito.");
        } else {
            System.out.println("No se pudo realizar la reserva.");
        }

     // Modificar una reserva
        LocalDateTime nuevaFechaReserva = LocalDateTime.of(2024, 5, 11, 20, 0);
        boolean reservaModificada = restaurante.modificarReserva(fechaHoraReserva, "Juan Pérez", nuevaFechaReserva, 2);
        System.out.println(reservaModificada ? "Reserva modificada con éxito." : "No se pudo modificar la reserva.");

        // Cancelar una reserva
        boolean reservaCancelada = restaurante.cancelarReserva(nuevaFechaReserva, "Juan Pérez");
        System.out.println(reservaCancelada ? "Reserva cancelada con éxito." : "No se pudo cancelar la reserva.");
        
        
        // Mostrar mesas disponibles para una fecha y hora
        System.out.println("Mesas disponibles para la fecha " + LocalDateTime.of(2024, 02, 11, 20, 0).toString() + ":");
        restaurante.mostrarMesasDisponibles(LocalDateTime.of(2024, 02, 11, 20, 0));

        // Mostrar reservas para una fecha específica
        System.out.println("\nReservas para el día " + LocalDateTime.of(2024, 02, 11, 20, 0).toLocalDate().toString() + ":");
        restaurante.mostrarReservasPorFecha(LocalDateTime.of(2024, 02, 11, 20, 0));
    }
}
