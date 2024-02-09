package herencia.interfaces.ejercicio_reservas_hotel;

public abstract class Habitacion {
	
	private String tipo; //single, double
    private double precioBase;
    private int piso;

    public Habitacion(String tipo, double precioBase, int piso) {
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    public abstract double getCostoHabitacion();

    public void mostrarInformacion() {
        System.out.print("Habitación " + tipo + " - Precio base: " + precioBase);
    }
    
    protected double getPrecioBase() {
    	return precioBase;
    }

}
