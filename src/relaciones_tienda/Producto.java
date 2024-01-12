package relaciones_tienda;
public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, String categoria, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Métodos para actualizar la cantidad en stock
    public void comprar(int cantidad) {
        cantidadEnStock += cantidad;
    }

    public boolean vender(int cantidad) {
        if (cantidadEnStock >= cantidad) {
            cantidadEnStock -= cantidad;
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }
}
