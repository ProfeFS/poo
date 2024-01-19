package ejercicio_restaurante;
public class Mesa {
    private int numero;
    private int capacidadMaxima;

    public Mesa(int numero, int capacidadMaxima) {
        this.numero = numero;
        this.capacidadMaxima = capacidadMaxima;
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

    
}
