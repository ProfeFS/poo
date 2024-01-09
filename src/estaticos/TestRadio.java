package estaticos;
public class TestRadio {
    public static void main(String[] args) {
        Radio miRadio = new Radio();
        miRadio.encender();
        miRadio.ajustarVolumen(50);

        Radio tuRadio = new Radio();
        tuRadio.encender();

        System.out.println("Radios encendidas: " + Radio.getRadiosEncendidas()); // Salida: 2
        miRadio.apagar();
        System.out.println("Radios encendidas: " + Radio.getRadiosEncendidas()); // Salida: 1
    }
}
