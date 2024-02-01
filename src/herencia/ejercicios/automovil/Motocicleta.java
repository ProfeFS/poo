package herencia.ejercicios.automovil;

import java.time.LocalDate;

public class Motocicleta extends Vehiculo {

	private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, LocalDate anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(", Tiene sidecar: " + tieneSidecar);
    }

}
