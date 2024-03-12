package iostreams.java_nio.ejercicio_coches;

public class Coche {
	private String matricula;
	private String marca;
	private int kilometraje;
	private double precio;

	public Coche(String matricula, String marca, int kilometraje, double precio) {
		this.matricula = matricula;
		this.marca = marca;
		this.kilometraje = kilometraje;
		this.precio = precio;
	}

	public Coche(String lineaCoche) {
		String[] atributosCoche = lineaCoche.split(",");
		matricula = atributosCoche[0];
		marca = atributosCoche[1];
		kilometraje = Integer.parseInt(atributosCoche[2]);
		precio = Double.parseDouble(atributosCoche[3]);
	}

	public String toString() {
		return matricula + "," + marca + "," + kilometraje + "," + precio;
	}

	public String getMatricula() {

		return matricula;
	}

}
