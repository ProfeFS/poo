package iostreams.java_nio.ejercicio_coches;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
		GestorInventario gestor = new GestorInventario();

		
			gestor.añadirCoche(new Coche("1234ABC", "Toyota", 120000, 10000.0));
			gestor.añadirCoche(new Coche("1234xyz", "Toyota", 12000, 10000.0));
			gestor.añadirCoche(new Coche("1345tgey", "Audi", 200000, 10000.0));
			
			gestor.eliminarCoche("1234ABC");
			gestor.eliminarCoche("1234ABCsss");
			gestor.generarOfertas();

		

	}

}
