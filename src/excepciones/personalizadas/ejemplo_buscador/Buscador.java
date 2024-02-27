package excepciones.personalizadas.ejemplo_buscador;

import java.util.ArrayList;

public class Buscador {
	private ArrayList<Integer> elementos;

	public Buscador() {
		this.elementos = new ArrayList<>();
	}

	public void agregarElemento(Integer elemento) {
		elementos.add(elemento);
	}

	public Integer buscarPorIndice(int indice) throws ElementoNoEncontradoException, IndexOutOfBoundsException {
		Integer elemento = elementos.get(indice);
		if (elemento == null) { // Suponiendo que queremos tratar los elementos nulos como no encontrados
			throw new ElementoNoEncontradoException("No existe un elemento en el índice " + indice);
		}
		return elemento;

	}
}
