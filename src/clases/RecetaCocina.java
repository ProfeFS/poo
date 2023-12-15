package clases;

import java.util.ArrayList;

public class RecetaCocina {
	private String nombre;
	private String categoria;
	private ArrayList<String> ingredientes;
	private ArrayList<String> pasos;

	public RecetaCocina(String nombre, String categoria) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.ingredientes = new ArrayList<>();
		this.pasos = new ArrayList<>();
	}

	public void añadirIngrediente(String ingrediente) {
		ingredientes.add(ingrediente);
	}

	public void añadirPaso(String paso) {
		pasos.add(paso);
	}

	public String mostrarReceta() {
		return "RecetaCocina [nombre=" + nombre + ", categoria=" + categoria + ", ingredientes=" + ingredientes
				+ ", pasos=" + pasos + "]";
    }

	
	
}
