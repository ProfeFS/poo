package relaciones_reserva;
public class Mesa {
    private int numero;
    private int capacidad;
    private boolean estaReservada;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.estaReservada = false;
    }

    // Métodos para manejar la reserva de la mesa
    public void reservar() {
        estaReservada = true;
    }

    public void liberar() {
        estaReservada = false;
    }

	public boolean isEstaReservada() {
		return estaReservada;
	}



  
    
}
