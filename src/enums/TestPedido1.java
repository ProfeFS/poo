package enums;
public class TestPedido1 {
    public static void main(String[] args) {
        Pedido1 pedido = new Pedido1(101);
        pedido.mostrarEstado();
        pedido.cambiarEstado(EstadoPedido1.ENVIADO);
        pedido.mostrarEstado();
    }
}