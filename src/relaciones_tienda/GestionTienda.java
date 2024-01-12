package relaciones_tienda;
public class GestionTienda {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        // Agregar productos al tienda
        tienda.agregarProducto(new Producto("Manzanas", "Frutas", 0.99, 50));
        tienda.agregarProducto(new Producto("Leche", "Lácteos", 1.50, 30));

        // Realizar una venta
        tienda.realizarVenta("Manzanas", 10);

        // Listar productos
        tienda.listarProductos();
    }
}
