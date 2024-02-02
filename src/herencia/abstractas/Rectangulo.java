package herencia.abstractas;

public class Rectangulo extends FiguraGeometrica {

	private double largo;
	private double ancho;

	public Rectangulo(double largo, double ancho) {
		super("Rectángulo");
		this.ancho = ancho;
		this.largo = largo;

	}

	@Override
	public double calcularArea() {

		return largo * ancho;
	}

	@Override
	public double calcularPerimetro() {

		return 2 * (largo + ancho);
	}

}
