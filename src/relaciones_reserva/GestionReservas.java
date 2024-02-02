package relaciones_reserva;
import java.util.Date;

public class GestionReservas {
    public static void main(String[] args) {
        Mesa mesa1 = new Mesa(1, 4);
        Reserva reserva1 = new Reserva(mesa1, "Juan Pérez", new Date());

        // Cancelar la reserva
        reserva1.cancelarReserva();

        // Verificar el estado de la mesa
        System.out.println("Mesa reservada: " + mesa1.isEstaReservada());
    }
}
