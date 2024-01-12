package relaciones;

import java.time.LocalDate;

class Conductor {
	private String code;
	private LocalDate fechaRegistro;
	private String nombre;
    //private Coche coche;

    public Conductor(Coche coche) {
        //this.coche = coche;
    }
    
    public Conductor(String code, String nombre, LocalDate fechaRegistro) {
        this.code = code;
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
    }

    public void conducir() {
        //coche.mover();
    }
    
    public void conducir(Coche coche) {
    	coche.mover();
    	
    }
}
