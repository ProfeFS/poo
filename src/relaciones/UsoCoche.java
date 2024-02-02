package relaciones;

import java.time.LocalDate;


public class UsoCoche {

	public static void main(String[] args) {
		Coche miCoche = new Coche();
		Conductor conductor = new Conductor(miCoche);
		
		Conductor conductor2 = new Conductor("aa1", "josè", LocalDate.now());
		conductor.conducir();
		conductor2.conducir(miCoche);


	}

}
