package relaciones_tienda;
import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Producto> productos;

    public Tienda() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public boolean realizarVenta(String nombreProducto, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto) && producto.getCantidadEnStock() >= cantidad) {
                producto.vender(cantidad);
                return true;
            }
        }
        return false;
    }

    // Método para listar productos
    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - Stock: " + producto.getCantidadEnStock());
        }
    }
}
