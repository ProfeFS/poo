package relaciones_ejercicios;
public enum DiaSemana {
	LUNES("Lunes", "Monday"),
    MARTES("Martes", "Tuesday"),
    MIERCOLES("Miércoles", "Wednesday"),
    JUEVES("Jueves", "Thursday"),
    VIERNES("Viernes", "Friday"),
    SABADO("Sábado", "Saturday"),
    DOMINGO("Domingo", "Sunday");

    private final String nombreEsp;
    private final String nombreIng;

    DiaSemana(String nombreEsp, String nombreIng) {
        this.nombreEsp = nombreEsp;
        this.nombreIng = nombreIng;
    }

    public String getNombreEsp() {
        return nombreEsp;
    }

    public String getNombreIng() {
        return nombreIng;
    }
}
