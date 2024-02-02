package enums;
public class Pedido {
    private int id;
    private String cliente;
    private EstadoPedido estado;

    public Pedido(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.estado = EstadoPedido.PENDIENTE;
    }

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El pedido " + id + " está ahora en estado: " + estado.getDescripcion());
    }
}
