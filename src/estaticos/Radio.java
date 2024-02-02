package estaticos;
public class Radio {
    // Atributo estático para llevar la cuenta de cuántas radios están encendidas
    private static int radiosEncendidas = 0;

    // Atributos no estáticos
    private boolean encendido;
    private int volumen;

    // Constructor
    public Radio() {
        encendido = false;
        volumen = 0;
    }

    // Método para encender la radio
    public void encender() {
        if (!encendido) {
            encendido = true;
            radiosEncendidas++;  // Incrementa el contador de radios encendidas
        }
    }

    // Método para apagar la radio
    public void apagar() {
        if (encendido) {
            encendido = false;
            radiosEncendidas--;  // Decrementa el contador de radios encendidas
        }
    }

    // Método para ajustar el volumen
    public void ajustarVolumen(int nuevoVolumen) {
        if (encendido && nuevoVolumen >= 0 && nuevoVolumen <= 100) {
            volumen = nuevoVolumen;
        }
    }

    // Método estático para obtener el total de radios encendidas
    public static int getRadiosEncendidas() {
        return radiosEncendidas;
    }
}
