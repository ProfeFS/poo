package enums;
public class TestPedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(123, "Cliente 1");
        pedido.cambiarEstado(EstadoPedido.PROCESADO);
        pedido.cambiarEstado(EstadoPedido.ENVIADO);
        pedido.cambiarEstado(EstadoPedido.ENTREGADO);
    }
}
