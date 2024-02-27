package excepciones.personalizadas.ejemplo_buscador;

public class App {

	public static void main(String[] args) {
		GestorDeBusqueda gestor = new GestorDeBusqueda();
		gestor.agregarElementoABuscar(1);
		gestor.agregarElementoABuscar(2);
		gestor.agregarElementoABuscar(null);

		// Realiza búsquedas, demostrando el manejo de excepciones
		gestor.buscarElementoPorIndice(1); // Este debería funcionar
		gestor.buscarElementoPorIndice(2);
		gestor.buscarElementoPorIndice(5); // Esto lanzará ElementoNoEncontradoException
	}

}
