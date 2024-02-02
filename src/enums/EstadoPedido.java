package enums;
public enum EstadoPedido {
    PENDIENTE(1, "Pendiente de procesar"),
    PROCESADO(2, "Procesado y en preparación"),
    ENVIADO(3, "Enviado al cliente"),
    ENTREGADO(4, "Entregado al cliente");

    private final int codigo;
    private final String descripcion;

    EstadoPedido(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

