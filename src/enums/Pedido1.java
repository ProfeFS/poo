package enums;
public class Pedido1 {
    private int id;
    private EstadoPedido1 estado;

    public Pedido1(int id) {
        this.id = id;
        this.estado = EstadoPedido1.RECIBIDO;
    }

    public void cambiarEstado(EstadoPedido1 nuevoEstado) {
        estado = nuevoEstado;
    }

    public void mostrarEstado() {
        System.out.println("Pedido " + id + " está en estado: " + estado);
    }
}