package excepciones.personalizadas.ejemplo_buscador;

public class GestorDeBusqueda {
	private Buscador buscador;

	public GestorDeBusqueda() {
		this.buscador = new Buscador();
	}

	public void agregarElementoABuscar(Integer elemento) {
		buscador.agregarElemento(elemento);
	}

	public void buscarElementoPorIndice(int indice) {
		try {
			Integer resultado = buscador.buscarPorIndice(indice);
			System.out.println("Elemento encontrado: " + resultado);
		} catch (ElementoNoEncontradoException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			// Captura específica de la excepción de índice fuera de rango
			System.out.println("Error: El índice proporcionado está fuera de rango.");
		} catch (Exception e) {
			// Captura de cualquier otra excepción inesperada
			System.out.println("Error inesperado durante la búsqueda: " + e.getMessage());
		}
	}
}