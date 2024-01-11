package enums;
public class TestSemaforo {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.mostrarEstado();
        semaforo.cambiarEstado(ColorSemaforo.VERDE);
        semaforo.mostrarEstado();
    }
}