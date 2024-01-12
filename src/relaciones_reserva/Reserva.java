package relaciones_reserva;
import java.util.Date;

public class Reserva {
    private Mesa mesa;
    private String clienteNombre;
    private Date fecha;

    public Reserva(Mesa mesa, String clienteNombre, Date fecha) {
        this.mesa = mesa;
        this.clienteNombre = clienteNombre;
        this.fecha = fecha;
        mesa.reservar();
    }

    // Métodos para manejar la reserva
    public void cancelarReserva() {
        mesa.liberar();
    }

    // Getters y setters
}
